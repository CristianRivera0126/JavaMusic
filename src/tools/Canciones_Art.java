package tools;

public class Canciones_Art {
	public String name_c;
	public String fecha_cre;
	public String genero;
	public float dura;
	
	Artistas mi_artista;
	
	public Canciones_Art(String name, float dura, String fecha, String genero) {
		this.name_c=name;
		this.dura=dura;
		this.fecha_cre=fecha;
		this.genero=genero;
	}

	public void quien_es_mi_artista(Artistas mi_artista) {
		this.mi_artista=mi_artista;
	}
}
