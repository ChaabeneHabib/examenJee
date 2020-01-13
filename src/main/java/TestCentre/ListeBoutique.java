package TestCentre;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import Entity.Boutique;
import Service.CentreRemote;

public class ListeBoutique {

	public static void main(String[] args) throws NamingException {
		// TODO Auto-generated method stub

		String jndiName="ExamenGL-ear/ExamenGL-ejb/CentreService!Service.CentreRemote";
		Context context = new InitialContext();
		CentreRemote  proxy = (CentreRemote) context.lookup(jndiName);
		
	List<Boutique> boutiques = 	proxy.listeBoutique(1L);
	
	boutiques.forEach(e->{
		System.out.println(e.getId());
	});
		
	}

}
