package teste.amazon;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Teste {

	public static void main(String[] args) {
		String strTest = "ATAGATACGATACGA";
		int k =3;
		System.out.println(repeatedParts(strTest, k));
		//other(strTest,k);

	}

	// Given a string containing a genetic sequence of length N and an integer K, 
	// implement a method that returns all K-size sub-sequences which repeat at 
	// least once in the original sequence.
	//
	// Exemplo:
	// Entrada: s = "ATAGATACGATA", k = 3
	// Retorno esperado: [ "ATA", "GAT" ]
	 
	static Set<String> repeatedParts(String s, int k) {
	    Set<String> result = new LinkedHashSet<String>();
	    Set<String> repSet = new TreeSet<String>();
	    for( int i = 0; i<= s.length()-k; i++){
	    	String seq = s.substring(i, k+i);
	        if (!repSet.add(seq)){
	        	result.add(seq);
	        }	        
	    }
		return result;
	}
	static void other(String test, int k){
	//String[] strs = {"AAAAAAAAA", "ABABAB", "ABCAB", "ABAb"};
	//for (String str : strs) {
		System.out.println(test.replaceAll("(.+?)\\1+", "$1"));
	    //System.out.println(repeated);
	}
}
