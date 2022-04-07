package PacoteJava;
/*1. 1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/
public class Cliente {
	
    //declaração dos atributos da classe
	
	private String nomeCliente;
	private String cidade;
	private int idade;
	private int CPF;
	
	//declaração do método construtor
	
	public Cliente (String nomeCliente, String cidade, int idade, int CPF)
	{
		this.nomeCliente = nomeCliente;
		this.cidade = cidade;
		this.idade = idade;
		this.CPF = CPF;
				
	}
	//declaração dos métodos gerais

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getcidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getCPF() {
		return CPF;
	}

	public void setCPF(int cPF) {
		CPF = cPF;
	}
	public void imprimirInfo()
	{
		System.out.println("\nNome do cliente: "+nomeCliente+", moradora do "+cidade+" com idade de "+idade+" anos e CPF "+CPF);
	}
	
	
	
}
