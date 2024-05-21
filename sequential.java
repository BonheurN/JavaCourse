
public class sequential {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {9,1,8,2,7,3,6,4,5};
		int index = linearSearch(array,1);
		if(index != -1) {
			System.out.println("index found at: "+ index);
		}
		else
			System.out.println("index not found");
	}

	private static int linearSearch(int[] array, int value) {
		// TODO Auto-generated method stub
		for(int i=0; i<array.length; i++) {
			if(array[i] == value) {
				return i;
			}
		}
		return -1;
	}

}
