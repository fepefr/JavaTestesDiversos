package teste.uol;

public class TesteUOL {

	public static void main(String[] args) {
		for (int num : oddNumbers(3, 5)) {
			System.out.println(num);
		} 
    }
        
    static int[] oddNumbers(int l, int r) {
        int size = r - l + 1;
        if(size%2==1 && l%r==1)
            size = (size / 2) +1;
        else
            size = size / 2;
        int[] result = new int[size];
        for(int x = 0, i = l; i<=r;i++){
            if(i%2==1){
               result[x] = i;
               x++;
            }
        }
        return result;
    }
    
    
}
