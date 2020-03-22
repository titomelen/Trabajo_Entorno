package Funciones;





public class Funcion6 {





	    public static void main(String[] args) {



                double [] num1 = {2,8,16,48};

		System.out.println(Funcion6(num1));



	}

	public static double Funcion6(double [] num1) {



        	double [] num2 = new double [num1.length];



        	double z = 4;



        	double w = 4;



	        for (int cont = 0; cont < num1.length; cont++) {



        	    if (num1[cont]%2==0) {



                	num2[cont] = num1[cont]*z; 



                	System.out.print("  Numero Par -->  " + num2[cont]);



            	}else {



               		num2[cont] = num1[cont]*w; 



                	System.out.print("  Numero Impar -->  " +num2[cont]);

            }

        }

		return z;

        }



}