package com.intercorp.reto.util;

import java.util.List;
import com.intercorp.reto.model.Cliente;

public class RetoUtil {
	
	public static int getPromedio(List<Cliente> clientes){
		int acum = 0;
		int i = 0;
		for (Cliente cli : clientes){
			acum = acum + cli.getEdadCli();
		    i++;
		}
		
		return (i > 0 ) ? acum/i : 0;		
	}
	
	public static double getDesviacion(List<Cliente> clientes,int media){
		double varianza = 0.0;
		double desviacion= 0.0; 
		
		for(int i = 0 ; i < clientes.size(); i++){
		   double rango;
		   rango = Math.pow(clientes.get(i).getEdadCli() - media, 2);
		   varianza = varianza + rango;
		}
		
		varianza = varianza / (clientes.size() - 1);
		desviacion = Math.sqrt(varianza);
		
		return desviacion;		
	}	
	
}
