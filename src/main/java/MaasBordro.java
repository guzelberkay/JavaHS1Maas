import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

class MaasBordro {
    public static void bordroOlustur(List<Personel> personelListesi) {
        LocalDate simdikiTarih = LocalDate.now();

        for (Personel personel : personelListesi) {
            String dosyaAdi = personel.getTamAd() + "_MaasBordro_" + simdikiTarih.getMonth() + "_" + simdikiTarih.getYear() + ".json";
            JSONObject bordroJSON = new JSONObject();
            bordroJSON.put("Personel Ismi", personel.getTamAd());
            bordroJSON.put("Calisma Saati", personel.getCalismaSaatleri());
            bordroJSON.put("Ana Odeme", personel.maasHesapla());


            try (FileWriter file = new FileWriter(dosyaAdi)) {
                file.write(bordroJSON.toJSONString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}