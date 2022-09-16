import java.util.Scanner;

class Summ {
 void add(int x, float y) {
	 System.out.println("integer sum="+(x+y));
}
 void add(float x, int y) {
	 System.out.println("decimal sum="+(x+y));
 }
 
}
public class methodoverloading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Summ s=new Summ();
		System.out.println("enter two values");
		int a=sc.nextInt();
		float b=sc.nextFloat();
		s.add(a,b);
		float c=sc.nextFloat();
		int d=sc.nextInt();
		s.add(c,d);

	}

}
