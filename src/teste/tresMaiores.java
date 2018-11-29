package teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class tresMaiores {
	
	public static void main(String[] args) {
		List<Integer> g1 = Arrays.asList(new Integer[]{2,33,1,0,22,10,11});
		System.out.println(tresMaiores(g1));
	}
	
	static List<Integer> tresMaiores(List<Integer> listaOrig){
	    List<Integer> result = new ArrayList();
	    Collections.sort(listaOrig, Collections.reverseOrder());
	    result.addAll(listaOrig.subList(0,3));
	    return result;
	}
}
