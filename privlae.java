
public class privlae {

	public static void main(String[]args) {
	
		int []num = {12,27,22,26,20,23,24,28,29};
		int list ;
		for(int i=0; i<num.length-1; i++) {
			if(num[i] > num[i + 1]) {
				list = num[i+1];
				num [i+1] = num[i];
				num[i] = list;
			}
		}
		for (int i: num)
			System.out.println(i);
		
	}
}

