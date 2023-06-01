import java.util.*;
public class palindrome_string {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		String name=s.nextLine();
		String rev="";
		for(int i=name.length()-1;i>=0;i--) {
			rev+=name.charAt(i);
		}
		if(name.equals(rev)) {
			System.out.println("The given String is palindrome");
		}
		else {
			System.out.println("The given String is Not palindrome");
		}
		
	}
}
