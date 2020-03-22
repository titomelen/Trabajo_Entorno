package Funciones;

public class Funcion2 {
	
	public static void main(String[] args) {

		System.out.println(Funcion2(153));
	}

	public static Boolean Funcion2(int num) {

		Boolean resp = null;

		int y = 200 - 50;
		int x = 200 + 50;

		if (num <= x && num >= y) {

			resp = true;

		} else {
			resp = false;
		}

		return resp;

	}
}

