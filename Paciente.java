package PacoteJava;

public class Paciente {


	private String nomeEnfermo;
	private String diagnostico;
	private String condi�aoMedica;
	private int diasInternado;
	
	public Paciente (String nomeEnfermo, String diagnostico, String condi�aoMedica, int diasInternado)
	{
		this.nomeEnfermo = nomeEnfermo;
		this.diagnostico = diagnostico;
		this.condi�aoMedica= condi�aoMedica;
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

	public String getCondi�aoMedica() {
		return condi�aoMedica;
	}

	public void setCondi�aoMedica(String condi�aoMedica) {
		this.condi�aoMedica = condi�aoMedica;
	}

	public int getDiasInternado() {
		return diasInternado;
	}

	public void setDiasInternado(int diasInternado) {
		this.diasInternado = diasInternado;
	}
	
	public void imprimirInfo()
	{
		System.out.println ("\nO paciente "+nomeEnfermo+" foi diagnosticado com "+diagnostico+" e, atualemnte, encontra-se em estado "+condi�aoMedica+" e precisar� de "+diasInternado+ " dias.");
	}	

	
	
	
	
	
}
