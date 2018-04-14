package Week4_AS4_3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class W4_AS4_3_IOmethods {
	private String name;
	private int number;
	private String msg;
	
	// #3
	public String displayNameAndScore() {
		
		Scanner in = new Scanner(System.in);					// ask user-information
		System.out.println("What's your name?");
		name = in.nextLine();
		
		System.out.println("What's your number?");
		number = in.nextInt();
		in.close();
		msg = printScore(name, number);
		return msg;
	}

	private String printScore(String name, int number) {
		String score = this.name + " got a " + this.number + " in the Math test.\n";
		
		return score;
	}
	// #4
		public void outputScoreAsTextFile() throws IOException {

			String path = "C:\\Users\\Students\\Desktop\\score.txt";
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
