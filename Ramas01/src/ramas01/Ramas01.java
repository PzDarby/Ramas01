package ramas01;
import java.util.Scanner;

import util.Funciones;
public class Ramas01 {
	static int total=0;
	static int cont=0;
	static int mayor=-1;
	static int menor=11;
	public static void main(String[] args) {
		int opcion=0;
		do {
			System.out.println("1. Agregar nota de un alumno\n2. Calcular promedio\n3. Mostrar nora más alta.\n4. Mostrar nota más baja.\n0. Salir");
		} while (opcion<0 && opcion>4);
	}
	public static void agregarNota(Scanner sc) {
		double nota;
		do {
			nota=Funciones.dimeDouble("Dime una nota del 0 al 10", sc);
		} while (!(nota>=0 && nota<=10));
		total+=(int) nota;
		if (nota>mayor) {
			mayor=(int) nota;
		}else if(nota<menor) {
			menor= (int) nota;
		}
		cont++;
	}
	public static int calcularPromedio(int totalAlumunos) {
		return total/cont;
	}
	public static int notaMaxima() {
		return mayor;
	}
	public static int notaMinima() {
		return menor;
	}
	
}	
