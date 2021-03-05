package tools;

public class Canciones_cl {
	public String name_c;
	public String artist;
	public String genero;
	public float dura;
	
	Cliente mi_oyente;
	
	public Canciones_cl(String name, String artista, String genero, float dura) {
		this.name_c=name;
		this.artist=artista;
		this.genero=genero;
		this.dura=dura;
	}

	public void quien_es_mi_artista(Artistas mi_artista) {
		this.mi_oyente=mi_oyente;
	}
}
