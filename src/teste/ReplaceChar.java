package teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReplaceChar {
	// public static void main(String[] args) {
	// String words = "hello world, i am a java program, how are you today?";
	// char from = 'a';
	// char to = '/';
	//
	// String changed = replace(words, from, to);
	// System.out.println(words);
	// System.out.println(changed);
	// }

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		final String fileName = System.getenv("OUTPUT_PATH");
		int res;
		int _n;
		_n = Integer.parseInt(in.nextLine().trim());

		int _p_size = 0;
		_p_size = Integer.parseInt(in.nextLine().trim());
		int[] _p = new int[_p_size];
		int _p_item;
		for (int _p_i = 0; _p_i < _p_size; _p_i++) {
			_p_item = Integer.parseInt(in.nextLine().trim());
			_p[_p_i] = _p_item;
		}

		System.out.println(getUmbrellas(_n, _p));
	}

	static int getUmbrellas(int n, int[] p) {
		
		//Arrays.sort(p);
			List tipos = new ArrayList<>(Arrays.asList(p));
			Collections.reverse(tipos);
			Integer[] p2 = (Integer[]) tipos.toArray(new Integer[0]);

		for (int i = 0; i < p.length / 2; ++i) {
			int temp = p[i];
			p[i] = p[p.length - i - 1];
			p[p.length - i - 1] = temp;
		}

		int result = -1;
		for (int i = 0; i < p.length; i++) {
			if (p[i] == n) {
				result = 1;
				break;
			}
			if (n % p[i] == 0) {
				result = n / p[i];
				break;
			}
		}
		return result;
	}

	public static String replace(String s, char from, char to) {
		StringBuffer result = new StringBuffer(s.length());

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == from) {
				result.append(to);
			} else {
				result.append(s.charAt(i));
			}
		}
		return result.toString();

	}
}
