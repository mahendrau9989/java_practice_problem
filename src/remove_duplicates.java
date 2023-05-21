import java.util.*;
public class remove_duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String new_string="";
		for(int i=0;i<s.length();i++) {
			String ch=Character.toString(s.charAt(i));
			if(!new_string.contains(ch)) {
				new_string=new_string+ch;
			}
		}
		sc.close();
		System.out.print(new_string);
	}

}