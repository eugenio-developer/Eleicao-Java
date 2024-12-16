package models;

public class Eleitor extends Pessoa {

	@Override
	public String toString() {
		return "Eleitor [Nome: "+ super.getNome() + ", CPF: "+ super.getCpf()+ ", Codigo: " + super.getCodigo() + "]";
	}
	
}
