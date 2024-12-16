package models;

public class Candidato extends Pessoa{
	private int numero;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Candidato [numero=" + numero + ", Nome=" + super.getNome() + "]\n";
	}
	
	
	
}
