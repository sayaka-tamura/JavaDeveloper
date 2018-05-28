package classNote;

public class lambdaEx_D2_p9 {
	public static void main(String[] args) {
		ComparatorInterface reverser_space = (str) ->{
			String sub_str = "";
			for (int i = str.length()-1; i>=0; i--) {
				sub_str += str.charAt(i);
			}
			return sub_str;
		};
		
		ComparatorInterface nomal_noSpace = (str) ->
		{
			String sub_str = "";
			for (int i = 0; i < str.length(); i++) {
				if(str.charAt(i) != ' ')
					sub_str += str.charAt(i);
			}
			return sub_str;
		};
	
		System.out.println(reverser_space.comparator("Hello class of JD"));
		System.out.println(nomal_noSpace.comparator("Hello class of JD"));
	}
}
