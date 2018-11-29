package teste;

public class FaltaNumero {

	public static void main(String[] args) {
		// exemplo de 1 ate 10 para simplificar a ideia geral.
		int[] numeros = { 0, 1, 2, 3, 4, 6, 7, 8, 9, 10 };
		int faltante = 0;
		for (int i = 0; i < numeros.length -1; i++) {
			if (numeros[i + 1] != numeros[i] + 1) {
				faltante = numeros[i] + 1;
			}
		}
		System.out.println(faltante);
	}

}
