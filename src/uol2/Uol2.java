package uol2;

public class Uol2 {
	public static void main(String[] args) {
		System.out.println(numlength(458874));
	}
	static int numlength(int n)
	{
	    if (n == 0) return 1;
	 
	    int length = (int)(Math.log10(n)+1);
	    int result = 0;
	    while( length> 0){
	    	if (getNthDigit(n, 10, length) == 4) {
	    		result++;
	    	}
	    	--length;
	    }
         
		return result;
	}
	
	public static int getNthDigit(int number, int base, int n) {    
		  return (int) ((number / Math.pow(base, n - 1)) % base);
	}
}
