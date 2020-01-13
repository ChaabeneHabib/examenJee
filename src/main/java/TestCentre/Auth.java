package TestCentre;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import Entity.CentreCommercial;
import Service.CentreRemote;

public class Auth {

	public static void main(String[] args) throws NamingException {
		// TODO Auto-generated method stub
		String jndiName="ExamenGL-ear/ExamenGL-ejb/CentreService!Service.CentreRemote";
		Context context = new InitialContext();
		CentreRemote  proxy = (CentreRemote) context.lookup(jndiName);
		
		CentreCommercial c = proxy.getCentreByLoginAndPassword("CentreA","CentreA");
		System.out.println(c.getLogin());
	}

}
