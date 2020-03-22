public class Funcion8 {
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
