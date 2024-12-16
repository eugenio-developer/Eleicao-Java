package Controller;

import javax.swing.JOptionPane;

import Repository.RepositoryCandidato;

public class ControllerCandidato {
	public static void menu(RepositoryCandidato repository) {
		boolean control = true;
		while(control) {
			String menuMensagem = "--------------------------------------------Candidato-----------------------------------------------\n\n";
			
			

			String[] menuPrincipal = { "Cadastro", "Buscar","Sair"};
			int op = JOptionPane.showOptionDialog(null, menuMensagem, "Sistema POO", 1, 1, null, menuPrincipal,
					menuPrincipal[0]);
			
			switch(op) {
			case 0:
				repository.cadastraCandidato();
				break;
			case 1:
				int cpf = Integer.parseInt(JOptionPane.showInputDialog("Digite o cpf para buscar: "));
				if(repository.getCandidato(cpf) == null) {
					JOptionPane.showMessageDialog(null, "Não encontrado");
				}
				else{
					JOptionPane.showMessageDialog(null, repository.getCandidato(cpf).toString());
				}
				break;
			case 2:
				control = false;
				break;
			}
			
			
		}
		
		
	
	}
}
