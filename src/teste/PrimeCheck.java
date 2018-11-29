package teste;

import java.util.Scanner;

public class PrimeCheck {
	public static void main(String args[]) {
		int temp;
		boolean isPrime = true;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number for check:");
		// capture the input in an integer
		int num = scan.nextInt();
		for (int i = 2; i <= num / 2; i++) {
			temp = num % i;
			if (temp == 0) {
				isPrime = false;
				break;
			}
		}
		// If isPrime is true then the number is prime else not
		if (isPrime)
			System.out.println(num + " is Prime Number");
		else
			System.out.println(num + " is not Prime Number");
	}
//	class FaltaNumero{
	    
//	    public static void main(String []args){
//	        //exemplo de 1 ate 10 para simplificar a ideia geral.
//	        int [] numeros = {1,2,3,5,6,7,8,9,10};
//	        for (int i =0; i<numeros.leght; i++){
//	            if(numeros[i+1] != numeros[i]+1){
//	                return numeros[i]+1;
//	            }
//	        }
//	    }
//	}
}