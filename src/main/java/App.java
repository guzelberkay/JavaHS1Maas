import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) throws IOException {
        String jsonData = new String(Files.readAllBytes(Paths.get("src/main/resources/bordro.txt")));
        System.out.println(jsonData);
        System.out.println("Current working directory: " + System.getProperty("user.dir"));
        DosyaOku.dosyadanOku("src/main/resources/bordro.txt");


    }
}