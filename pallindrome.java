package Programs;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class pallindrome {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any number");
		int n=Integer.parseInt(br.readLine());
		int r,sum=0,t;    
		  t=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(t==sum)    
		   System.out.println(t + " is palindrome number ");    
		  else    
		   System.out.println(t + " is not palindrome");

	}

}
