package teste;

public class C_8 {
	private static int $8;
	public static void main(String[] args) {
		String a_b;
		// TODO Auto-generated method stub
		System.out.println($8);
		//System.out.println(a_b);
		
		String s1 = "java";
		String s2 = "java";
		StringBuilder sb = new StringBuilder();
		sb.append("ja").append("va");
		System.err.println(s1 == s2);
		System.err.println(s1.equals(s2));
		System.err.println(sb.toString() == s1);
		System.err.println(sb.toString().equals(s1));
	}

}
