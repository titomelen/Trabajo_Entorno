package Funciones;
public class Funcion5{
public static void main(String[] args) {


    int [] numero = {2,8,16,48};


System.out.println(Funcion5(numero));
}

	public static int Funcion5(int [] num) {

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
