package modelo;

public class Silla {

	private int numPatas;
	private String color;
	private boolean respaldo;
	private String talla;
	
	//Constructor
	public Silla() {
		
	}
	//Constructor con parametros
	public Silla(int num, String c, boolean r, String t) {
		numPatas = num;
		color = c;
		respaldo = r;
		talla = t;
	}
	//Getters y Setters
	public int getNumeroPatas() {
		return numPatas;
	}
	public String getColor() {
		return color;
	}
	public boolean getRespaldo() {
		return respaldo;
	}
	public String getTalla() {
		return talla;
	}
	public void setNumeroPatas(int otraCantidad) {
		numPatas = otraCantidad;
	}
	public void setColor(String otroColor) {
		color = otroColor;
	}
	public void setTalla(String otraTalla) {
		talla = otraTalla;
	}
	public void setRespaldo() {
		respaldo = !respaldo;
	}
	
	@Override
	public String toString() {
		return "Silla [numPatas=" + numPatas + ", color=" + color + ", respaldo=" + respaldo + ", talla=" + talla + "]";
	}
	
	
	
}
