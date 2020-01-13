package TestCentre;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import Entity.Client;
import Service.CentreRemote;

public class ListeClients {

	public static void main(String[] args) throws NamingException {
		// TODO Auto-generated method stub
		String jndiName="ExamenGL-ear/ExamenGL-ejb/CentreService!Service.CentreRemote";
		Context context = new InitialContext();
		CentreRemote  proxy = (CentreRemote) context.lookup(jndiName);
		
		List<Client>	 clients = proxy.listeClients(3L);
		clients.forEach(e->{
			System.out.println(e.getId());
		});
	}

}
