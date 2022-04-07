package PacoteJava;

public class Paciente {


	private String nomeEnfermo;
	private String diagnostico;
	private String condiçaoMedica;
	private int diasInternado;
	
	public Paciente (String nomeEnfermo, String diagnostico, String condiçaoMedica, int diasInternado)
	{
		this.nomeEnfermo = nomeEnfermo;
		this.diagnostico = diagnostico;
		this.condiçaoMedica= condiçaoMedica;
		this.diasInternado = diasInternado;
		
	}

	public String getNomeEnfermo() {
		return nomeEnfermo;
	}

	public void setNomeEnfermo(String nomeEnfermo) {
		this.nomeEnfermo = nomeEnfermo;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getCondiçaoMedica() {
		return condiçaoMedica;
	}

	public void setCondiçaoMedica(String condiçaoMedica) {
		this.condiçaoMedica = condiçaoMedica;
	}

	public int getDiasInternado() {
		return diasInternado;
	}

	public void setDiasInternado(int diasInternado) {
		this.diasInternado = diasInternado;
	}
	
	public void imprimirInfo()
	{
		System.out.println ("\nO paciente "+nomeEnfermo+" foi diagnosticado com "+diagnostico+" e, atualemnte, encontra-se em estado "+condiçaoMedica+" e precisará de "+diasInternado+ " dias.");
	}	

	
	
	
	
	
}
