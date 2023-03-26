package patterns;
import java.util.Scanner;

public class ReverseCharPattern {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i =1;
		while(i<=n){
			int p = n;
			int j=1;
			while(j<=i) {
				System.out.print((char)(p+64));
				j++;
				p--;
			}
			System.out.println();
			i++;
		}
	}

}
