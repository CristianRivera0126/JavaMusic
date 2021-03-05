package musicja;

import tools.Artistas;
import tools.Canciones_Art;
import tools.Canciones_cl;
import tools.Cliente;
import tools.Colaboraciones;

public class Application {
	public static void main(String[] args) {
	//Creamos al artista
	Artistas artis1=new Artistas("Maluma",25,"1.516.517 millones");
	System.out.println(artis1.Saludar());
	
	//Creamos las canciones
	Canciones_Art can1=new Canciones_Art("Obsesion",3.24f,"23 de Febrero del 2019","Reggeaton");
	Canciones_Art can2=new Canciones_Art("La Curiosidad",3.24f,"26 de Abril del 2019","Reggeaton");
	Canciones_Art can3=new Canciones_Art("La Boda",2.57f,"25 de Octbre del 2019","Reggeaton");
	Canciones_Art can4=new Canciones_Art("Despeinada",3.33f,"08 de Noviembre del 2019","Reggeaton");
	//Creamos las colaboraciones
	Colaboraciones col1=new Colaboraciones("Dutty Love","Natty Natasha",3.24f,"27 de Febrero del 2019","Reggeaton");
	Colaboraciones col2=new Colaboraciones("Hasta Abajo","Kevin Roldan",3.24f,"29 de Abril del 2019","Reggeaton");
	Colaboraciones col3=new Colaboraciones("Me enamoré","Jay wheeler ",4.06f,"30 de Julio del 2019","Reggeaton");
	Colaboraciones col4=new Colaboraciones("Tal vez","Paulo Londra",4.28f,"15 de Agosto del 2019","Reggeaton");
	
	//Asignar Cancion
	artis1.asignar_cancion(can1);
	artis1.asignar_cancion(can2);
	artis1.asignar_cancion(can3);
	artis1.asignar_cancion(can4);
	
	//Asignar Colaboracion
	artis1.asignar_colaboracion(col1);
	artis1.asignar_colaboracion(col2);
	artis1.asignar_colaboracion(col3);
	artis1.asignar_colaboracion(col4);
	
	
	//imprimir canciones
	System.out.println("\t\t\tAlbum del artista (mis canciones)\n");
	artis1.imprimir_mis_canciones();
	//Imprimir Colaboraciones
	System.out.println("\t\t\tAlbum del artista (canciones con otros artistas)\n");
	artis1.imprimir_mis_colaboraciones();
	
	//Creamos al  cliente
	System.out.println("\t\t\tConocemos al cliente\n");
	Cliente client1=new Cliente("Cristian Rivera","0801-2001-03042","Bachata");
	System.out.println(client1.Saludo());
	
	//Creamos las canciones del cliente
	System.out.println("\t\t\tDejame mostrarte mi playlist\n");
	Canciones_cl canc1=new Canciones_cl("Solo por un beso","Romeo Santos ","Bachata",3.28f);
	Canciones_cl canc2=new Canciones_cl("La planta","Vilma Palma","Rock",3.33f);
	Canciones_cl canc3=new Canciones_cl("Booker T","Bad Bunny ","Reggeaton",3.48f);
	Canciones_cl canc4=new Canciones_cl("Feel Me","Los Vengadores","Reggeaton",5.34f);
	
	client1.asignar_cancion(canc1);
	client1.asignar_cancion(canc2);
	client1.asignar_cancion(canc3);
	client1.asignar_cancion(canc4);
	
	//Imprimir playlist
	client1.imprimir_mi_playlist();
	
   }
}
