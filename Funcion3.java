package Funciones;

public class Funcion3 {

	public static int Funcion3(int num) {


		int x = 5;
		int ymenos = 200-50;
		int ymas = 200+50;
		int rang = (int)Math.floor(Math.random()*(ymas+ymenos));
		int result = 0;

		if (num%x == 0) {
			result = rang%num;
		}

		return result;

	}
}
