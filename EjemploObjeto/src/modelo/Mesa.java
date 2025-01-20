package modelo;

public class Mesa {

	private int numPatas;
	private String color;
	private boolean respaldo;
	private String talla;

	public Mesa(int numPatas, String color, boolean respaldo, String talla) {
		super();
		this.numPatas = numPatas;
		this.color = color;
		this.respaldo = respaldo;
		this.talla = talla;
	}

	public int getNumPatas() {
		return numPatas;
	}

	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isRespaldo() {
		return respaldo;
	}

	public void setRespaldo(boolean respaldo) {
		this.respaldo = respaldo;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	@Override
	public String toString() {
		return "Mesa [numPatas=" + numPatas + ", color=" + color + ", respaldo=" + respaldo + ", talla=" + talla + "]";
	}

}
