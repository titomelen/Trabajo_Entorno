package Funciones;
public class Funcion5{


	public  int Funcion5(int [] num) {

		int tam = num.length;
		int sum = 0; 
		int [] numarray = new int [tam];

		for (int cont = 0; cont < tam; cont++) {
			numarray[cont] = num[cont];
			sum = sum + numarray[cont];
		}
		return sum;
	}
}
