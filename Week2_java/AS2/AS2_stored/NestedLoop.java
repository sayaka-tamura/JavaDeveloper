/**
 * @author Sayaka Tamura
 * 
 * 7. Create a program using nested loops that would generate the following output:
 * 1.
 * 88888888
 * 88888888
 * 88888888
 * 88888888
 * 88888888
 * 
 * 2.
 * 8888
 * 888
 * 88
 * 8
 * 
 * 3. 
 *      8
 *     8
 *    8
 *   8
 *  8
 * 8
 * 
 */

public class NestedLoop {
	public static void main(String[] args) {
		String eight = "8";
		
		System.out.println("1st Loop:");
		for(int i=0; i<5; i++){
			for (int j = 0; j < 8; j++) {
				System.out.print(eight);
			}
			System.out.println("");
		}
		
		System.out.println("2nd Loop");
		for(int i=3; i>=0; i--){
			for (int j = i; j >= 0; j--) {
				System.out.print(eight);
			}
			System.out.println("");
		}
		
		System.out.println("3rd Loop");
		String space = " ";
		for(int i=6; i>0; i--){
			for (int j=i-1; j>0; j--) {
				System.out.print(space);
			}
			System.out.println(eight);
		} 
	}
}
