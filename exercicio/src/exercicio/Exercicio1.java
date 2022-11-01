package exercicio;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int salario;
		int abono; 

		System.out.println("Digite o salario: ");
	salario = leia.nextInt();
		
		System.out.println("Digite o abono: ");
	abono = leia.nextInt();
	
			System.out.println("\nSeu novo Salario e: "  + salario + " + " + abono + "= " + (salario+abono));
			
	
	
	}
	
	

}
