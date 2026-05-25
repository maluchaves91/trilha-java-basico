import java.util.Scanner;


public class App {


    public static int soma(int a, int b) {
        return a + b;
    }


    public static void main(String[] args) {


        try (Scanner entrada = new Scanner(System.in)) {


            System.out.println("Digite o valor de A:");
            int a = entrada.nextInt();


            System.out.println("Digite o valor de B:");
            int b = entrada.nextInt();


            int resultado = soma(a, b);


            System.out.println("A soma é: " + resultado);
        }
    }
}
