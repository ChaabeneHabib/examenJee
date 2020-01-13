package TestCentre;

import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import Entity.Boutique;
import Enum.Categorie;
import Enum.Genre;
import Service.CentreRemote;

public class ajouterEtAffecterBoutique {

	public static void main(String[] args) throws NamingException {
		// TODO Auto-generated method stub
		String jndiName="ExamenGL-ear/ExamenGL-ejb/CentreService!Service.CentreRemote";
		Context context = new InitialContext();
		CentreRemote  proxy = (CentreRemote) context.lookup(jndiName);
		
		List<Boutique> boutiques = new ArrayList<Boutique>();
		
		Boutique b1 = new Boutique("New Collection",Categorie.Adulte);
		Boutique b2 = new Boutique("Sport City",Categorie.sport);
		Boutique b3 = new Boutique("Funny kids" , Categorie.enfant);
		
		boutiques.add(b1);
		boutiques.add(b2);
		boutiques.add(b3);
		
		proxy.ajouterEtAffecterBoutique(boutiques, 1L);
	}

}
