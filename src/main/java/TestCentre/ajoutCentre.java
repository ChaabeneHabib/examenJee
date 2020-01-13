package TestCentre;

import javax.naming.*;

import Entity.CentreCommercial;
import Service.CentreRemote;

public class ajoutCentre {

	public static void main(String[] args) throws NamingException {
		// TODO Auto-generated method stub
		String jndiName="ExamenGL-ear/ExamenGL-ejb/CentreService!Service.CentreRemote";
		Context context = new InitialContext();
		CentreRemote  proxy = (CentreRemote) context.lookup(jndiName);
		
		CentreCommercial centre = new CentreCommercial("ArianaCenter","Ariana","CentreA","CentreA");
		
		proxy.ajoutCentre(centre);
	}

}
