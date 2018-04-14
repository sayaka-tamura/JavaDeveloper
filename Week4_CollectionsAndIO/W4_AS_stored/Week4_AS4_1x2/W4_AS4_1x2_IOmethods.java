package Week4_AS4_1x2;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author Sayaka tamura
 */

public class W4_AS4_1x2_IOmethods {
		
	private String name;
	private String address;
	private String msg;
	
	// # 1
	public String displayNameAndAddress() {
		
		Scanner in = new Scanner(System.in);					// ask user-information
		System.out.println("What's your name?");
		name = in.nextLine();
		
		System.out.println("What's your address?");
		address = in.nextLine();
		in.close();
		msg = printPostCard(name, address);
		return msg;
	}

	private String printPostCard(String name, String address) {
		String postcard = "+----------------------------------------------------------------+\r\n";
		
		for (int i = 0; i < 3; i++) {
			postcard += String.format("| %62s | \r\n", "####");		// for making stamp
		}
		
		postcard += String.format("| %62s | \r\n", "");
		postcard += String.format("| %62s | \r\n", "");
		
		postcard += String.format("| %62s | \r\n", this.name);		// for writing name and address
		postcard += String.format("| %62s | \r\n", this.address);
		
		postcard += String.format("| %62s | \r\n", "");
		
		postcard += ("+----------------------------------------------------------------+");
		return postcard;
	}
	
	// # 2
	public void outputLetterAsTextFile() throws IOException {

		String path = "C:\\Users\\Students\\Desktop\\Letter.txt";
		File writeTo = new File(path);
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		try {

			fw = new FileWriter(writeTo);
			
			bw = new BufferedWriter(fw);
			
			pw = new PrintWriter(bw);
			
			pw.println(msg);
		}
		finally {
			if(pw!=null)
				pw.close();
			if(fw != null)
				fw.close();
		}
	}

}
