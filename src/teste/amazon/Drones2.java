package teste.amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Drones2 {

	static int minimumNumberOfTrips(int tripMaxWeight, int[] packagesWeight) {
		
		int tripsResult = 0;
		int currentWeight = 0;
		int qtdPack = 0;

		List<Integer> auxListPack = new ArrayList<Integer>();
		for (int prim : packagesWeight) {
			auxListPack.add(prim);
		}
		Collections.sort(auxListPack,Collections.reverseOrder());
		
		int size = auxListPack.size();
		for (int i = 0; i < size; i++) {
			Integer pack = getFitPack(currentWeight, tripMaxWeight, auxListPack);
			if (pack == -1) {
				pack = auxListPack.get(0);
				if(pack>100){
					auxListPack.remove(pack);
					continue;
				}
				++tripsResult;
				currentWeight = pack;
				qtdPack = 1;
				auxListPack.remove(pack);
				continue;
			}
			auxListPack.remove(pack);
			if (qtdPack < 2) {
				if (currentWeight == 0) {
					++tripsResult;
				}
				currentWeight += pack;
				++qtdPack;
			}
			if (qtdPack == 2) {
				currentWeight = 0;
				qtdPack = 0;
			}

		}
		return tripsResult;
	}

	void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int tmp = 0;
				if (arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	
	private static Integer getFitPack(int currentWeight, int tripMaxWeight, List<Integer> auxListPack) {
		Integer result = -1;
		for (Integer carga : auxListPack) {
			if (currentWeight + carga <= tripMaxWeight) {
				result = carga;
				break;
			}
		}
		return result;
	}

	public static void reverse(int[] input) {
		int last = input.length - 1;
		int middle = input.length / 2;
		for (int i = 0; i < middle; i++) {
			int temp = input[i];
			input[i] = input[last - i];
			input[last - i] = temp;
		}
	}

	public static void reversee(int[] arr) {
		List<Integer> auxList = new ArrayList<Integer>();
		for (int i : arr) {
			auxList.add(i);
		}
		Collections.reverse(auxList);
		int i = 0;
		for (Integer integer : auxList) {
			arr[i] = integer;
			++i;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int tripMaxWeight = in.nextInt();
		int numberOfPackages = in.nextInt();

		int[] packagesWeight = new int[numberOfPackages];

		for (int i = 0; i < numberOfPackages; i++) {
			packagesWeight[i] = in.nextInt();
		}

		int minimumNumberOfTrips = minimumNumberOfTrips(tripMaxWeight, packagesWeight);

		System.out.println("The minimum Number Of Trips are: " + minimumNumberOfTrips);
	}
}
