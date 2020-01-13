package TestCentre;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import Enum.Genre;
import Service.CentreRemote;

public class Statistique {

	public static void main(String[] args) throws NamingException {
		// TODO Auto-generated method stub
		String jndiName="ExamenGL-ear/ExamenGL-ejb/CentreService!Service.CentreRemote";
		Context context = new InitialContext();
		CentreRemote  proxy = (CentreRemote) context.lookup(jndiName);
		Map<Genre, Long> map = new HashMap<Genre, Long>();
		
	map =	proxy.statistique();
	
	for(Entry<Genre,Long > ma : map.entrySet())
	{
		System.out.println(ma.getKey()+" , "+ma.getValue());
	}
	}
	

}
