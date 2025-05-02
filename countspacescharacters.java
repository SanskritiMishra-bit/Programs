package Programs;
import java.io.*;
import java.io.FileReader;
import java.io.IOException;

public class countspacescharacters {

	public static void main(String args[])throws Exception {
		// TODO Auto-generated method stub
		String fileName=("C:\\Users\\HP\\OneDrive\\Desktop\\zeta.txt");
		int digitCount=0;
		int spaceCount=0;
		int characterCount=0;
		
		try(BufferedReader reader=new BufferedReader(new FileReader(fileName))) {
			int c;
			while((c=reader.read())!=-1) {
				char ch=(char)c;
				if(Character.isDigit(ch)) {
					digitCount++;
				}
				else
					if(Character.isWhitespace(ch)) {
					spaceCount++;
				}
				characterCount++;
			}
		}
		catch(IOException e) {
			System.out.println("An error occurred while reading the file");
			e.printStackTrace();
		}
		System.out.println("Digits:"+digitCount);
		System.out.println("Spaces:"+spaceCount);
		System.out.println("Characters:"+characterCount);
		
		

	}
}

