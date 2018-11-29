package teste;

public class Fatorial {
	public static void main(String []args) {
		System.out.println(calcFatorial(7));

	}
	static Integer calcFatorial(final Integer num){
	    Integer result = 1;
	    int numAux = num;
	    for(int i=1; i<num;i++){
	    	result = numAux * (num-i);
	        numAux = result;
	    }
	    return result;
	}
}
