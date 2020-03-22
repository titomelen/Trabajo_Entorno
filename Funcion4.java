public class prueba4 {
	public static void main(String[] args) {


		String[] CadenaNombres = { "Javier Melendez", "Carlos Garcia", "Carlos Villar", "Juan Jesus" };

		System.out.println(Funcion4(CadenaNombres));

        }
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
}