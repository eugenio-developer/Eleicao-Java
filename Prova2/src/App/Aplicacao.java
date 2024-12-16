package App;

import javax.swing.JOptionPane;

import Controller.ControllerCandidato;
import Controller.ControllerEleitor;
import Controller.ControllerVoto;
import Repository.RepositoryCandidato;
import Repository.RepositoryEleitor;
import Repository.RepositoryVoto;

public class Aplicacao {

	
	public static void main(String[] args) {
		RepositoryEleitor re = new RepositoryEleitor();
		RepositoryCandidato rc = new RepositoryCandidato();
		RepositoryVoto rv = new RepositoryVoto() ;
		
		boolean control = true;
		
		while(control) {
			switch(menuPrincipal()) {
			case 0:
				ControllerEleitor.menu(re);
				break;
			case 1:
				ControllerCandidato.menu(rc);
				break;
			case 2:
				ControllerVoto.menu(rc, re, rv);
				break;
			case 3:
				int cpf = Integer.parseInt(JOptionPane.showInputDialog("Digite o cpf do candidato para ver a quantidade de votos"));
				int contador = 0;
				for(int i = 0; i < rv.listALL().size(); i++) {
					if(rv.listALL().get(i).getCandidato().getCpf() == cpf) {
						contador++;
					}
				}
				JOptionPane.showMessageDialog(null, rc.getCandidato(cpf).toString() + "\nQuantidade de votos: " + contador);
				
				break;
			case 4:
				control = false;
				break;
				
			}
			
			
		}
		
		
	}
	
	
	public static int menuPrincipal() {

		String menuMensagem = "-------------------------------------------- Sistema Votação POO -----------------------------------------------\n\n";
				

		String[] menuPrincipal = { "Eleitor", "Candidato", "Voto","Resultado" , "Sair"};
		int op = JOptionPane.showOptionDialog(null, menuMensagem, "Sistema POO", 1, 1, null, menuPrincipal,
				menuPrincipal[0]);
		return op;

	}
}
