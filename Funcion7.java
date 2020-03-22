import java.util.Arrays;

public class Funcion7 {
	 public String Funcion7(String[] listaDeCadenas) {


	        if (listaDeCadenas != null) {

	            for (int i = 0; i < listaDeCadenas.length; i++) {

	                String cadena = listaDeCadenas[i];

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
}

