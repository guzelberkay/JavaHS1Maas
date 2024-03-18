import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DosyaOku {

    public static List<Personel> dosyadanOku(String dosyaYolu) {
        List<Personel> personelListesi = new ArrayList<>();

        JSONParser jsonParser = new JSONParser();
        try (FileReader reader = new FileReader(dosyaYolu)) {
            Object obj = jsonParser.parse(reader);
            JSONArray personeller = (JSONArray) obj;

            for (Object personelObj : personeller) {
                JSONObject personelJSON = (JSONObject) personelObj;
                String ad = (String) personelJSON.get("Ad");
                String unvan = (String) personelJSON.get("Unvan");
                double saatlikUcret = (double) personelJSON.get("SaatlikUcret");
                int calismaSaati = ((Long) personelJSON.get("CalismaSaati")).intValue();

                if (unvan.equals("Yonetici")) {
                    double bonus = (double) personelJSON.get("Bonus");
                    personelListesi.add(new Yonetici(ad, saatlikUcret, calismaSaati, bonus));
                } else if (unvan.equals("Memur")) {
                    int derece = ((Long) personelJSON.get("Derece")).intValue();
                    personelListesi.add(new Memur(ad, saatlikUcret, calismaSaati));
                }
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        return personelListesi;
    }
}