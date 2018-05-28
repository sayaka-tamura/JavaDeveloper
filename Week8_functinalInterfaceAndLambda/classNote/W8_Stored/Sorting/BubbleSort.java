package classNote;

public class BubbleSort {
	public static void main(String[] args) {
		Integer [] elements = {23,4,5,11,65,33,21,9};	//4,5,9,11,21,23,33,65
		
		for (int i = 0; i < elements.length; i++) {
			Integer temp = 0;
			for (int x = 1; x < elements.length-i; x++) {
				if(elements[x-1] > elements[x]) {
					temp = elements[x-1];
					elements[x-1]=elements[x];
					elements[x]=temp;
				}				
			}
		}
		
		for(Integer e:elements)
			System.out.print(e+" ");
	}
}
