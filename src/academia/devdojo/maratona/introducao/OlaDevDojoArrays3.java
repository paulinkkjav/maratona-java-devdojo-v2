package academia.devdojo.maratona.introducao;

public class OlaDevDojoArrays3 {
    public static void main(String[] args) {

       int [] numeros = new int[5];
       int [] numeros1 = {1 , 2, 3 ,4 ,5};
       int [] numeros2 = new int[] {5,4,3,2,1};
       String [] Nomes = {"PAULO", "JOSÉ", "MARIA", "PEDRO"};
       String [] Nomes1 = {"Helena", "Ravi", "Maite", "Enzo"};

       for (int i = 0; i < numeros1.length; i++) {
           System.out.println(numeros1[i]);



       }
for(int numero:numeros2){
    System.out.printf("%d \n", numero);
}
for(String nome :Nomes){
    System.out.println(nome);
}
for (String nome :Nomes1) {
    System.out.printf("Os nomes mais comuns do brasil são :%s %n", nome);
}

    }
}
