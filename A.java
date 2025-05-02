package Programs;
	import java.io.*;
	public class A{
	
	        static boolean perfect(int num)
	        {
	            int sum = 0;
	            for(int i=1; i<num; i++)
	            {
	                if(num%i==0)
	                {
	                    sum = sum+i;
	                }
	            }
	            if(sum==num)
	                return true;
	            else
	                return false;
	        }
	        public static void main(String[] args) throws Exception
	        {
	            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	            System.out.println("enter the value for n");
	            int n = Integer.parseInt(br.readLine());
	            for(int i=1; i<=n; i++)
	            {
	                if(perfect(i))
	                    System.out.println(i);
	            }
	        }


	} 