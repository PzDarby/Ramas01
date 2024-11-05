package util;

import java.util.Scanner;

public class Funciones {
	public static boolean esInt(String num) {
		try {
			Integer.parseInt(num);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public static boolean esDouble(String num) {
		try {
			Double.parseDouble(num);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public static int dimeEntero(String texto ,Scanner sc) {
		int num=0;
		do {
			try {
				System.out.println(texto);
				String s=sc.nextLine();
				num =Integer.parseInt(s);
				return num;
			} catch (Exception e) {
				System.out.println("Numero no valido");
			}
		}while(true);
	}
	public static double dimeDouble(String texto,Scanner sc) {
		double num=0;
		do {
			try {
				System.out.println(texto);
				String s=sc.nextLine();
				num =Double.parseDouble(s);
				return num;
			} catch (Exception e) {
				System.out.println("Numero no valido");
			}
		}while(true);
	}
}
