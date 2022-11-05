package cliente;

import java.util.Scanner;

import cliente.model.TestaCliente;

public class Dados {


public static Scanner leia = new Scanner(System.in); 
	public static void main(String[] args) {
		
		int opcao;
		
		
		
TestaCliente  d1 = new TestaCliente("Ederson", 92200350,"Boa Vista", 928 , "RS");
		
		d1.visualizar();
			
		
		
		
		while(true) { 
		System.out.println("##############################################################################");
		System.out.println("                                                                              ");
		System.out.println("                            MENU PRINCIPAL                                   ");
		System.out.println("                                                                              ");
		System.out.println("##############################################################################");
		System.out.println("        1- NOME DO TITULAR                                                    ");
		System.out.println("        2- ENDEREÇO DO TITULAR                                                ");
		System.out.println("        3- SAIR                                                                      ");
		System.out.println("##############################################################################");
		System.out.println("        ENTRE COM A OPÇÃO                                                     ");
		System.out.println("                                                                              ");
	    opcao = leia.nextInt();
			
		if(opcao == 3) { 
			System.out.println("\n BOM FINAL DE SEMANA");
			leia.close();
			System.exit(0);
		}
		switch(opcao) {
		
		case 1:
			System.out.println("\n Digite o nome do cliente");
			
			break;
			
		case 2:
			System.out.println("\n Digite o Endereco do titular");
			
		break;
			
			
		}
		
		}

	} 
}