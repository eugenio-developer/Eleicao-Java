package Repository;

import java.util.ArrayList;


import models.Voto;

public class RepositoryVoto {
	ArrayList<Voto>votos = new ArrayList<Voto>();
	
	public void addVoto(Voto voto) {
		votos.add(voto);
	}
	
	public ArrayList<Voto> listALL(){
		return votos;
	}

	

	
	
}
