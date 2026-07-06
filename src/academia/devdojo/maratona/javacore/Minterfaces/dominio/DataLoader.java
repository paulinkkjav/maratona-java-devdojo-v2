package academia.devdojo.maratona.javacore.Minterfaces.dominio;

public interface DataLoader {
    public abstract void load();
    default void checkPermission(){
        System.out.println("Checking permissions");
    }
}
