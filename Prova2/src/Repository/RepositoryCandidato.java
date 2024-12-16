package Repository;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import models.Candidato;


public class RepositoryCandidato {
ArrayList<Candidato>candidatos = new ArrayList<Candidato>();
	
	
	public Candidato getCandidato(int cpf) {
		for (Candidato candidato : candidatos) {
			if(candidato.getCpf() == cpf) {
				return candidato;
			}
		}
		return null;
	}

	public void addCandidato(Candidato candidato) {
		candidatos.add(candidato);
	}
	
	public void cadastraCandidato() {
		boolean control = true;
		int cpf = Integer.parseInt(JOptionPane.showInputDialog("Digite o cpf: "));
		String nome = JOptionPane.showInputDialog("Digite o nome:");
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do candidato:"));
		for (Candidato candidato : candidatos) {
			if(candidato.getNumero() == numero) {
				control = false;
			}
		}
		if(control == true) {
			Candidato candidato = new Candidato();
			candidato.setCpf(cpf);
			candidato.setNome(nome);
			candidato.setNumero(numero);
			candidato.setCodigo(candidatos.size());
			addCandidato(candidato);
		}
		else{
			JOptionPane.showMessageDialog(null, "Numero já existente");			
		}
		
		
	}
}
