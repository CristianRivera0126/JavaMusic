package tools;

public class Colaboraciones {
	public String name_ca;
	public String name_co;
	public String fecha_cre;
	public String genero;
	public float dura;
	Artistas mi_duo;
	
	public Colaboraciones(String name_ca, String name_co, float dura, String fecha, String genero) {
		this.name_ca=name_ca;
		this.name_co=name_co;
		this.dura=dura;
		this.fecha_cre=fecha;
		this.genero=genero;
	}

	public void quien_es_mi_duo(Artistas mi_duo) {
		this.mi_duo=mi_duo;
	}

}
