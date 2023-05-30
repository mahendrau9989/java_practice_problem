import java.util.*;
public class fibbonaci {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the N : ");
		int N=s.nextInt();
        int n1=0,n2=1;
        System.out.print(n1+" "+n2);
        int n3=0,i=2;
        while(i<N){
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
            i++;
        }
        s.close();
	}
}
