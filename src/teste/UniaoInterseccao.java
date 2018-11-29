package teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class UniaoInterseccao{
	    
	    public static void main(String args[]){
	        List<Integer> g1 = Arrays.asList(new Integer[]{2,3,1,0,5});
	        List<Integer> g2 = Arrays.asList(new Integer[]{1,2,3,4,5});
	        //Poderia usar union de uma Set tb, mas preferi usar metodo de List para facilitar entendimento
	        List<Integer> uniao = new ArrayList<Integer>();
	        uniao.addAll(g1);
	        uniao.addAll(g2);
	        System.out.println(uniao);
	        //Poderia tambem usar metodo de api Set ou retainAll de List, mas nao usei para mostrar exemplo 
	        List<Integer> interseccao = new ArrayList<Integer>();
	        for (int i = 0; i < g1.size(); i++){
	            for(int j=0; j< g2.size(); j++){
	                if(g1.get(i).equals(g2.get(j))){
	                    interseccao.add(g2.get(j));
	                    break;
	                }
	            }
	        }
	        System.out.println(interseccao);
	    }
}