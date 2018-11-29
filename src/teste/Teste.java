package teste;

public class Teste {
	public static void main(String[] args) {
		int i;

		for (i = 1; i <= 100; i++) {
			if (i % 3 == 0)
				System.out.println("Fizz");
			else if (i % 5 == 0)
				System.out.println("Buzz");
			else if (i % (3 * 5) == 0)
				System.out.println("FizzBuzz");
			else
				System.out.println(String.format("%d", i));
		}

	}
}
