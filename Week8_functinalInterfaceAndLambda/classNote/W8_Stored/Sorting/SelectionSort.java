package classNote;

public class SelectionSort {
	public static void main(String[] args) {
		Integer [] elements = {65,33,23,21,11,9,5,4};	//4,5,9,11,21,23,33,65
		int counter = 0;
		for (int i = 0; i < elements.length-1; i++) {
			int min_in = i;
			Boolean flag = false;
			for (int x = i+1; x < elements.length; x++) {
				if(elements[x] < elements[min_in]) {
					min_in = x;		// swap index of array not number in array
					flag = true;
				}
				counter++;
			}
			
			if(flag) {
				int temp = elements[min_in];
				elements[min_in] = elements[i];
				elements[i]=temp;
				continue;
			}
			
			break;
		}
		
		for(Integer e:elements)
			System.out.print(e+" ");
		System.out.println("\n"+counter);
	}
}
