import java.util.*;
public class prime {
	static boolean checkprime(int num) {
		int st=0;
		boolean s=false;
		if(num==1 || num==0) {
			s=false;
		}
		else {
			for(int i=2;i<=num/2;i++) {
				if(num%i==0) {
					st=1;
					break;
				}
			}
			if(st==0) {
				s=true;
			}
		}
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		for(int i=0;i<=number;i++) {
			if(checkprime(i)) {
				System.out.println("Prime"+" "+i);
			}
		}
		s.close();
	}

}
