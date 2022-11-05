package cliente.model;

public class TestaCliente {

	private String nome;
	private int cep;
	private String rua;
	private int numerocasa; 
	private String estado;
	
	public TestaCliente(String nome, int cep, String rua, int numerocasa, String estado) {
		
		this.nome = nome;
		this.cep = cep;
		this.rua = rua;
		this.numerocasa = numerocasa;
		this.estado = estado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumerocasa() {
		return numerocasa;
	}

	public void setNumerocasa(int numerocasa) {
		this.numerocasa = numerocasa;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	public void visualizar() {
		System.out.println("\n*************************************************");
		System.out.println("Dados do cliente");
		System.out.println("\n*************************************************");
		System.out.println("\nNome do titular: " + this.nome);
		System.out.println("\nCEP : " + this.cep);
		System.out.println("\nRua: " + this.rua);
		System.out.println("\nNumero da Casa: " + this.numerocasa);
		System.out.println("\nUF: " + this.estado);
	}
}