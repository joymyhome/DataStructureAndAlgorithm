import java.util.Arrays;
import java.util.Random;

public class RandomlyPicky {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Construct a random array of integers
		Random randnum = new Random();
		int[] array = new int[randnum.nextInt(15)];
		int size = array.length;
		for (int i = 0; i < size; i ++) {
			array[i] = randnum.nextInt(100);
		}
		
		//int[] array = {2, 4, 5, 7, 0, 25, 46, 6, 23,4, 124, 45,47};
		System.out.println("The original array is: "+ Arrays.toString(array));
		ramdomlyPicky(array);
		System.out.println("The resulting array is:" + Arrays.toString(array));
	}
	
	public static void ramdomlyPicky(int[] array) {
		Random rand = new Random();
		//if(array.length == 0) throw Index
		int size = array.length;
		boolean n = true;
		while(n) {
			int index = rand.nextInt(size);
			System.out.println("we picked "+ array[index]);
			array[index] = 0;
			for (int i = 0; i < size; i++) {
				if (array[i] != 0) {
					n = true;
					break;
				}
				else 
					n = false;									
					
			}	
		}				
	}
}
