package academia.devdojo.maratona.javacore.Minterfaces.teste;

import academia.devdojo.maratona.javacore.Minterfaces.dominio.DataBaseLoader;
import academia.devdojo.maratona.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {

        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileloader = new FileLoader();

        dataBaseLoader.load();
        fileloader.load();

        dataBaseLoader.remove();
        fileloader.remove();

        dataBaseLoader.checkPermission();
        fileloader.checkPermission();

    }
}
