package Aula3;

import java.util.Scanner;

public class CalcularMultiplos {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numero1,numero2;
        System.out.println("Digite o primeiro numero");
        numero1 = leia.nextInt();
        System.out.println("Digite o segundo numero");
        numero2 = leia.nextInt();
        if (numero1 > numero2)
            System.out.println("Intervalo Inválido!");
        else
        {
            if (numero1%5 == 0 && numero1%3 == 0 )
            {
                System.out.println(numero1+" é multiplo de 5 e 3");

            }
            else if (numero1%5 == 0 && numero1%3 != 0 )
            {
                System.out.println(numero1+" é multiplo de 5 mas não é de 3");

            }
            else if (numero1%5 != 0 && numero1%3 == 0 )
            {
                System.out.println(numero1+" é multiplo de 3 mas não é de 5");

            }
            else
                System.out.println("Intervalo inválido");

            if (numero2%5 == 0 && numero2%3 == 0 )
            {
                System.out.println(numero2+" é multiplo de 5 e 3");

            }
            else if (numero2%5 == 0 && numero2%3 != 0 )
            {
                System.out.println(numero2+" é multiplo de 5 mas não é de 3");

            }
            else if (numero2%5 != 0 && numero2%3 == 0 )
            {
                System.out.println(numero2+" é multiplo de 3 mas não é de 5");

            }
            else
                System.out.println("Intervalo inválido");
        }

    }
}