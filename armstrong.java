package Programs;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class armstrong {

	public static void main(String[] args) throws Exception 
	
		// TODO Auto-generated method stub
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter any number");
	int n=Integer.parseInt(br.readLine());
	int t=n;
	int sum=0;
	while(n>0)
	{
		int r=n%10;
		sum=sum+r*r*r;
		n=n/10;
	}
	if (sum==t)	
		System.out.println(t + " is armstrong number");
	else
		System.out.println(t + " is not armstrong number");
	}

}
