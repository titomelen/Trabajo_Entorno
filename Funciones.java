




import java.util.Arrays;

public class Funciones {

	String[] cadenaDeNombres = { "Carlitos", "Titomelen", "CarlosVillar", "Limoncello" };
	System.out.println(Funcion7(cadenaDeNombres));

    
    public class prueba1 {
    		System.out.println(funcion1(40));
    	}
    		static int x = 5;
    		
    		public static boolean funcion1 (int n){
    			int x = 5;
    			boolean resp;
    			if(n % x == 0) {
    				resp= true;
    			}else {
    				resp=false;
    			}
    			return resp;
    		};
    		public class Funcion2 {

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
    			public class prueba4 {
    					String[] CadenaNombres = { "Javier Melendez", "Carlos Garcia", "Carlos Villar", "Juan Jesus" };

    					System.out.println(Funcion4(CadenaNombres));

    					public static String Funcion4(String[] CadenaNombres) {
    				
    						String CadenaConcatenada = null;
    						for (int i = 0; i < CadenaNombres.length; i++) {
    				
    							CadenaConcatenada = CadenaNombres[0] + "-" + CadenaNombres[1] + "-" + CadenaNombres[2] + "-"
    									+ CadenaNombres[3];
    						}
    						CadenaConcatenada = CadenaConcatenada.replaceAll("[AaEeIiOoUu]", "");
    						CadenaConcatenada = CadenaConcatenada.replaceAll("[A-Z]", "");
    						System.out.println(CadenaConcatenada);
    						return CadenaConcatenada;
    					}
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
    			}
    			public class Funcion6 {

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
    public static String Funcion7(String[] listaDeCadenas) {
        if (listaDeCadenas != null) {

            for (int i = 0; i < listaDeCadenas.length; i++) {

                String cadena = listaDeCade
                if (!cadena.equals("")){
                    listaDeCadenas[i] = cadena.substring(3, 6);
                }else {
                	cadena ="";
                }
            }

        } else {
            listaDeCadenas = null;
        }

        return Arrays.toString(listaDeCadenas);

    	}


public boolean Funcion8(String[] alumnos, int[][] tiemposDeTrabajos){	       
			int t = 400;
	        int sumatorio = 0;
	        boolean result = true;
	        for(int i = 0; i < tiemposDeTrabajos.length; i++){
	            sumatorio = 0;
	            for(int j = 0; j < tiemposDeTrabajos.length; j++){
	                sumatorio += tiemposDeTrabajos[j][i];
	            }
	            if(sumatorio<=t){
	                result = false;
	            }
	        }
	        return result;
	}
}
