package vista;

import java.util.Scanner;

import modelo.Silla;

public class Principal {

	static Silla[] sillas;

	public static void main(String[] args) {
		sillas = new Silla[3];
		rellenarCatalogo();
		mostrarCatalogo();
	}

	public static void rellenarCatalogo() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < sillas.length; i++) {
			System.out.println("Introduce el numero de patas de la silla "+(i+1));
			int numPatas = sc.nextInt();
			System.out.println("Introduce el color de la silla"+(i+1));
			String color = sc.nextLine();
			System.out.println("¿Tiene respaldo?");
			String respuesta = sc.nextLine();
			boolean respaldo;
			if(respuesta.equals("si"))
				respaldo = true;
			else
				respaldo = false;
			System.out.println("Introduce la talla");
			String talla = sc.nextLine();
			sillas[i] = new Silla(numPatas, color, respaldo, talla);
		}
	}
	
	public static void mostrarCatalogo() {
		for (int i = 0; i < sillas.length; i++) {
			System.out.println(sillas[i]);
		}
	}

}
