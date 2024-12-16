package Controller;

import javax.swing.JOptionPane;

import Repository.RepositoryCandidato;
import Repository.RepositoryEleitor;
import Repository.RepositoryVoto;
import models.Voto;

public class ControllerVoto {
	public static void menu(RepositoryCandidato repositoryC, RepositoryEleitor repositoryE, RepositoryVoto repositoryV){
		boolean control = true;
		while(control) {
			String menuMensagem = "--------------------------------------------Votos-----------------------------------------------\n\n";
			String[] menuPrincipal = { "Votar", "Sair"};
			int op = JOptionPane.showOptionDialog(null, menuMensagem, "Sistema POO", 1, 1, null, menuPrincipal,
					menuPrincipal[0]);
			switch(op) {
			case 0:
				int cpfE = Integer.parseInt(JOptionPane.showInputDialog("Digite o cpf do eleitor: "));
				int cpfC = Integer.parseInt(JOptionPane.showInputDialog("Digite o cpf do Candidato: "));
				if(repositoryC.getCandidato(cpfC) == null || repositoryE.getEleitor(cpfE) == null) {
					JOptionPane.showMessageDialog(null, "Cpf digitado invalido:");
				}
				else {
					Voto voto = new Voto();
					voto.setCandidato(repositoryC.getCandidato(cpfC));
					voto.setEleitor(repositoryE.getEleitor(cpfE));
					voto.setCodigo(repositoryV.listALL().size()+1);
					repositoryV.addVoto(voto);
					JOptionPane.showMessageDialog(null, "Voto computado!");
				}
			break;
			case 1:
				control = false;
			}
			
		}
	}
}
