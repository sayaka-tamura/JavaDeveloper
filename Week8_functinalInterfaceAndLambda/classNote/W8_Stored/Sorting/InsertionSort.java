package classNote;

public class InsertionSort {
	
	public static void main(String[] args) {
		Integer [] elements = {65,33,23,21,11,9,5,4};	//4,5,9,11,21,23,33,65
		Integer counter = 0;
		
		for (int i = 1; i < elements.length; i++) {
			int sub_ele = elements[i];
			int x = i-1;
			
			while(x>=0 && elements[x]>sub_ele) {
				elements[x + 1] = elements[x];
				x--;
				counter++;
			}
			elements[x + 1] = sub_ele;
		}
		
		for(Integer e : elements)
			System.out.print(e+" ");
		System.out.println("\n" + counter);
	}
}
