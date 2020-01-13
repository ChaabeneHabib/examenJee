package TestCentre;

import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import Entity.Client;
import Enum.Genre;
import Service.CentreRemote;

public class AjouterEtAffecterClientBoutique {

	public static void main(String[] args) throws NamingException {
		// TODO Auto-generated method stub
		String jndiName="ExamenGL-ear/ExamenGL-ejb/CentreService!Service.CentreRemote";
		Context context = new InitialContext();
		CentreRemote  proxy = (CentreRemote) context.lookup(jndiName);
		
		Client client = new Client("Ahmed Ali", Genre.Masculin);
		List<Long> listBOutique = new ArrayList<Long>();
		listBOutique.add(3L);
		listBOutique.add(4L);
		
		proxy.ajouterEtAffecterClientBoutique(client, listBOutique);
	}

}
