package academia.devdojo.maratona.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;
import java.util.Locale;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Arquivo Criado - " + isCreated);
            System.out.println("path" + file.getPath());
            System.out.println("absolute path" + file.getAbsolutePath());
            System.out.println("tamanho " + file.length());
            System.out.println("last time modified " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()).toLocalDateTime());
            boolean exists = file.exists();
            if (exists){
                file.delete();
                System.out.println("Arquivo Deletado - " + !file.exists());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
