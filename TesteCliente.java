package PacoteJava;

public class TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//instanciando um objeto da classe automovel
		
		Cliente clien1 = new Cliente ("Lana Del Rey", "Recife", 21, 123456789); //perguntar na aula
        
		clien1.imprimirInfo();
		
		System.out.println("\n*******Transferência de Cidade********");
		
		clien1.setNomeCliente("Hanna");
		
		clien1.imprimirInfo();
		
		System.out.println("\nCPF:"+clien1.getCPF());
	
	
	
	}
	
	
	

}
