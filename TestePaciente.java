package PacoteJava;

public class TestePaciente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Paciente pasc1 = new Paciente ("Helton Migge", "esquizofrenia", "avan�ado",120);
		
		pasc1.imprimirInfo();
		
		System.out.println("Mudan�a de fomul�rio dos pacientes");
		
		pasc1.setDiagnostico(" gripe");
		
		pasc1.imprimirInfo();
		
		System.out.println("\nDiagnostico:"+pasc1.getDiagnostico());
		
		
	}

}