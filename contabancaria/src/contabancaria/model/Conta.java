package contabancaria.model;

public class Conta {
	
	private int numero; 
	private int agencia;
	private int tipo;
	private String titular;
	private float saldo;
	
	
	
	public Conta(int numero, int agencia, int tipo, String titular, float saldo) {
		
		
		this.numero = numero;
		this.agencia = agencia;
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;
	}



	public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}



	public int getAgencia() {
		return agencia;
	}



	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}



	public int getTipo() {
		return tipo;
	}



	public void setTipo(int tipo) {
		this.tipo = tipo;
	}



	public String getTitular() {
		return titular;
	}



	public void setTitular(String titular) {
		this.titular = titular;
	}



	public float getSaldo() {
		return saldo;
	}



	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public boolean sacar(float valor) {
		
		if(getSaldo() < valor) {
			System.out.println("Saldo insulficiente");
		return false;
		
	}
	
	   setSaldo(getSaldo()  -  valor);
	    return true; 
}

	    
	public void visualizar() {
		System.out.println("\n*************************************************");
		System.out.println("Dados da Conta");
		System.out.println("\n*************************************************");
		System.out.println("\nNumero da Conta: " + this.numero);
		System.out.println("\nNumero da Agencia: " + this.agencia);
		System.out.println("\nTipo da Conta: " + this.tipo);
		System.out.println("\nTitular: " + this.titular);
		System.out.println("\nSaldo: " + this.saldo);
		
	}
	

}
