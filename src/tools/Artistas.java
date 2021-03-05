package tools;

import java.util.ArrayList;
import java.util.List;

public class Artistas {
	public String nombre;
	public int edad;
	public String followers;
	List<Canciones_Art> cancion;
	List<Colaboraciones> colaboracion;
 	
	public Artistas(String nombre,int edad, String followers) {
		this.nombre=nombre;
		this.edad=edad;
		this.followers=followers;
		this.cancion= new ArrayList<Canciones_Art>();
		this.colaboracion=new ArrayList<Colaboraciones>();
	}
	
	public String Saludar() {
		String Saludo="Hola! estas a punto de escuchar el album de "+this.nombre+" tengo "+this.edad+" años de edad"+" y tengo "+this.followers+" de seguidores"+"\n";
		return Saludo;
	}
	
	public void asignar_cancion(Canciones_Art nueva_cancion) {
		nueva_cancion.mi_artista=this;
		this.cancion.add(nueva_cancion);
	}
	
	public void imprimir_mis_canciones() {
		short i=1;
		for(Canciones_Art c: this.cancion) {
			System.out.println("Mi cancion numero "+i+" es "+c.name_c+" esta cancion dura "+c.dura+"min"+" y fue creada el "+c.fecha_cre+" es del genero "+c.genero);
			i+=1;
		}
		System.out.println("");
	}
	
	public void asignar_colaboracion(Colaboraciones nueva_colaboracion) {
		nueva_colaboracion.mi_duo=this;
		this.colaboracion.add(nueva_colaboracion);
	}
	
	public void imprimir_mis_colaboraciones() {
		short i=1;
		for(Colaboraciones c: this.colaboracion) {
			System.out.println("Mi cancion numero "+i+" es "+c.name_ca+" en esta cancion me acompaña "+c.name_co+" esta cancion dura "+c.dura+"min"+" y fue creada el "+c.fecha_cre+" es del genero "+c.genero);
			i+=1;
		}
		System.out.println("");
	}

}
