package Controller;

import javax.swing.JOptionPane;

import Repository.RepositoryEleitor;

public class ControllerEleitor {
	public static void menu(RepositoryEleitor repository) {
		boolean control = true;
		while(control) {
			
			String menuMensagem = "--------------------------------------------Eleitor-----------------------------------------------\n\n";
			
			

			String[] menuPrincipal = { "Cadastro", "Buscar","Sair"};
			int op = JOptionPane.showOptionDialog(null, menuMensagem, "Sistema POO", 1, 1, null, menuPrincipal,
					menuPrincipal[0]);
			
			switch(op) {
			case 0:
				repository.addEleitor(repository.cadastraEleitor());
				break;
			case 1:
				int cpf = Integer.parseInt(JOptionPane.showInputDialog("Digite o cpf para buscar: "));
				if(repository.getEleitor(cpf) == null) {
					JOptionPane.showMessageDialog(null, "Cpf digitado invalido!");
				}
				else {
					JOptionPane.showMessageDialog(null, repository.getEleitor(cpf).toString());
				}
				break;
			case 2:
				control = false;
				break;
				
			
			}
			
			
		}
		
		


		
	}
}
