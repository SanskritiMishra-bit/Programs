package Programs;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class stringpallindrome {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any string");
		boolean flag= true;
		String s= br.readLine();
		String string = s ;
		string= string.toLowerCase();
		for (int i=0;i<string.length();i++) {
			if (string.charAt(i)!=string.charAt(string.length()-i-1)) {
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println("GIVEN STRING IS PALLINDROME");
		else
			System.out.println("GIEN STRING IS NOT PALLINDROME");
	}}