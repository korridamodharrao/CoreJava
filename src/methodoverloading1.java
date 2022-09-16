import java.util.Scanner;

class Summm{
	void add(int x, int y){
		System.out.println("integrr sum="+(x+y));
	}
	void add(int x, int y, int z) {
		System.out.println("decimal sum="+(x+y+z));
	}
}
public class methodoverloading1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		Summm s=new Summm();
		System.out.println("enter two values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		s.add(a, b);
		int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
		s.add(c, d,e);
		
	}

}
