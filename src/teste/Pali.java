package teste;

public class Pali {

	public static void main(String[] args) {
		System.out.println(isPalindromoV0("reviver"));
		System.out.println(isPalindromoV1("reviver"));
		
	}

	// Assumindo palavra is not null value
	static boolean isPalindromoV0(String palavra) {
		return palavra.equals(new StringBuilder(palavra).reverse().toString());
	}

	static boolean isPalindromoV1(String palavra) {
		boolean result = false;
		StringBuilder reverse = new StringBuilder();
		char[] chars = palavra.toCharArray();
		for (int i = chars.length - 1; i >= 0; i--) {
			reverse.append(chars[i]);
		}

		if (palavra.equals(reverse.toString()))
			result = true;

		return result;
	}
}