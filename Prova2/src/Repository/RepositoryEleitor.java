package Repository;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import models.Eleitor;



public class RepositoryEleitor {
	ArrayList<Eleitor>eleitores = new ArrayList<Eleitor>();
	
	public Eleitor getEleitor(int cpf) {
		for (Eleitor eleitor : eleitores) {
			if(eleitor.getCpf() == cpf) {
				return eleitor;
			}
		}
		
		return null;
	}
	public void addEleitor(Eleitor eleitor) {
		eleitores.add(eleitor);
	}
	
	public Eleitor cadastraEleitor() {
		int cpf = Integer.parseInt(JOptionPane.showInputDialog("Digite o cpf"));
		String nome = JOptionPane.showInputDialog("Digite o nome:");
		
		Eleitor eleitor = new Eleitor();
		eleitor.setCpf(cpf);
		eleitor.setNome(nome);
		eleitor.setCodigo(eleitores.size());
		JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
		return eleitor;
		
	}
	
}
