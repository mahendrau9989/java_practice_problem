import java.util.*;
public class palindrome_number {

	public static void main(String[] args) {
		System.out.print("Enter the Number to check palindrome : ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int num=n;
		int rev=0;
		while(n>0) {
			int r=n%10;
			rev=rev*10+r;
			n/=10;
		}
		if(rev==num) {
			System.out.println("Given Number "+num+" is Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
		s.close();
	}

}
