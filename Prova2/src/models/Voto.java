package models;

public class Voto {
	private int codigo;
	private Eleitor eleitor;
	private Candidato candidato;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Eleitor getEleitor() {
		return eleitor;
	}
	public void setEleitor(Eleitor eleitor) {
		this.eleitor = eleitor;
	}
	public Voto() {
		super();
		
	}
	public Candidato getCandidato() {
		return candidato;
	}
	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}
	
	
	
	
}
