package Week4_AS4_4to7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Week4_AS4_4_IOmethods {
	
	FileReader fr = null;
	BufferedReader br = null;
	FileWriter fw = null;
	BufferedWriter bw = null;
	PrintWriter pw = null;
	Scanner s = null;
	
	// #4
	public String createFileSplitsBySpaces() throws IOException {
		String msg = "";
		String pathIn = "C:\\Users\\Students\\Desktop\\num.txt";
		String pathOut = "C:\\Users\\Students\\Desktop\\num1.txt";
		File readIn = new File(pathIn);
		File writeTo = new File(pathOut);
		
		try {
			
			fr = new FileReader(readIn);
			fw = new FileWriter(writeTo);
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw);
			
			String l;
			while((l = br.readLine()) != null) {		// readLine() returns a line of text
				// write to file
				pw.print(l + " ");
				msg += l + " ";
			}
		}
		finally {
			if(pw!=null)
				pw.close();
			if(br != null)
				br.close();
		}
		
		return msg;
	}
	
	// #5
	public String openFileFindTotal(int fileName) throws IOException {
		
		String msg = "";
		int total = 0;
		String path = System.getProperty("user.dir") + "\\nums" + (fileName+1) + ".txt";
		
		File newFile = new File(path);
		
		try {
			fr = new FileReader(newFile);
			br = new BufferedReader(fr);
			s = new Scanner(br);

			while(s.hasNext()) {
				if(s.hasNextInt())
					total += s.nextInt();
				else
					System.out.println(s.next());		// to print out except Integer
			}
			
		}
		finally {
			if(s != null)
				s.close();
		}
		
		msg += "Total number in the text is " + total;
		return msg;
	}
	
	// #6
	public String openAPuzzle(int fileName) throws IOException {
		String msg = "";
		String secretWord = "";
		String path = "";
		
		switch(fileName) {
			case 1:
				path = System.getProperty("user.dir") + "\\puzzle.txt";
				break;
			case 2:
				path = System.getProperty("user.dir") + "\\puzzle2.txt";
				break;
		}
		
		File newFile = new File(path);
		try {
			
			fr = new FileReader(newFile);
			br = new BufferedReader(fr);
			
			// Way1
			while(br.ready())
				msg += (char) br.read();				// read file in path that user assigned, put to String
		
			char[] arrayOfChar = msg.toCharArray();		// put String as char one by one to char array
			
			for (int i = 2; i < arrayOfChar.length; i+=3)	// Read each third character from arrayOfChar 
				secretWord += arrayOfChar[i];
			
			// Way 2
//			int counter = 1;
//			while (br.ready()) {
//				if (counter == 3) {
//					secretWord += (char) br.read();
//					counter = 0;
//				} else {
//					br.read();
//				}
//				counter++;
//			}
			
		} finally {
			if(br != null)
				br.close();
		}
		return secretWord;
	}

	// #7
//	 * Create a second file CrazyTextModified.txt and it should be empty initially.
//	 * Write a program that would reads the text in CrazyText.txt
//	 * and output it to CrazyTextModified.txt with every vowel capitalize.
	public void readCrazyTextAndWrite() throws IOException {
		char[] vowels ={'a','e','i','o','u'};

		String readIn = System.getProperty("user.dir") + "\\CrazyText.txt";
		String writeOut = System.getProperty("user.dir") + "\\CrazyTextModified.txt";
		
		File readFile = new File(readIn);
		File writeFile = new File(writeOut);
		
		try {
			fr = new FileReader(readFile);
			br = new BufferedReader(fr);
			
			fw = new FileWriter(writeFile);
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw);
			
			while(br.ready()) {
				char c =(char)br.read();
                boolean isVowel = false;
                
                for(char vowel : vowels){
                    if(vowel==Character.toLowerCase(c)) {
                    	pw.write(Character.toUpperCase(c));
                    	isVowel = true;
                    	break;
                    }
                } 	// end forloop
                
                if(!isVowel)
                	pw.write(c);
			}		// end while
		}
		finally {
			if(pw != null)
				pw.close();
		}
	}
}
