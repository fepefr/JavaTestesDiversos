package teste.amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class RemoveDuplicadas {

	public static void main(String[] args) {
		givenListContainsDuplicates_whenRemovingDuplicatesWithPlainJava_thenCorrect();

	}

	public static void givenListContainsDuplicates_whenRemovingDuplicatesWithPlainJava_thenCorrect() {
	    List<Integer> listWithDuplicates = Arrays.asList(4, 5, 9, 5, 0, 1, 4, 2, 3, 0, 0,  null);
	    List<Integer> listWithoutDuplicates = new ArrayList<>(new TreeSet<>(listWithDuplicates));
	 
	    System.out.println(listWithoutDuplicates.size());
	}
}
