package tools;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	public String name_cl;
	public String id;
	public String Gene_int;
	
	List<Canciones_cl> cancion;
	
	public Cliente(String name,String id,String genero) {
		
		this.name_cl=name;
		this.id=id;
		this.Gene_int=genero;
		this.cancion= new ArrayList<Canciones_cl>();
		
	}

	public String Saludo() {
		String SaludoC1="Hola! mi nombre es "+this.name_cl+" mi id es: "+this.id+" y me interesa el genero "+this.Gene_int+"\n";
		return SaludoC1;
	}
	
	public void asignar_cancion(Canciones_cl nueva_cancion) {
		nueva_cancion.mi_oyente=this;
		this.cancion.add(nueva_cancion);
	}
	
	public void imprimir_mi_playlist() {
		short i=1;
		for(Canciones_cl c: this.cancion) {
			System.out.println("La cancion numero "+i+" de mi playlist se llama "+c.name_c+", esta cancion es de "+c.artist+" dura "+c.dura+"min"+" y es del genero "+c.genero);
		    i+=1;
		}
		
	}
	
	
	

}
