import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a frase desejada:");
        String frase = entrada.nextLine();
        System.out.println("Digite a letra desejada");
        String termoDesejado = entrada.nextLine();



        System.out.println(vezesLetraAparece(frase, termoDesejado));
        entrada.close();
    }

    public static String vezesLetraAparece(String frase, String termo) {

        int contador = 0;
        char[] arrayTermo = termo.toCharArray();
        char charTermo = arrayTermo[0];


        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == charTermo) {
                contador++;
            }
        }
        String qtsVezes = String.valueOf(contador);
        return "A letra " + termo + " apareceu " + qtsVezes + " vezes ";

    }
}
