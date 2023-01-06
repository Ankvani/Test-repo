public class Palindrome {

	public static void main(String[] args) {
		        int sum=0,n=454,temp,r;
		        temp=n;
		        while(n>0)
		        {
		            r=n%10;
		            sum=(sum*10)+r;
		            n=n/10;
		        }
		        if(sum==temp)
		        {
		            System.out.println("Number is palindrome"+sum);
		        }
		        else
		        {
		            System.out.println("Number is not palindrome"+sum);
		        }

		    }
		}
