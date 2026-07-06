package academia.devdojo.maratona.javacore.Oexpection.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {

        abreConexao();
    }
    private static String abreConexao(){
        try{
            System.out.println("Escrevendo arquivos");
            System.out.println("Escrevendo dados no arquivo");
        return "conexão aberta";
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally{   // <- SEMPRE VAI SER EXECUTADO
            System.out.println("Fechando finalizado");
        }
        return null;
    }
}
