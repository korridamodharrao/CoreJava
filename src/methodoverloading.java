import java.util.Scanner;

public class methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
class Sum{
			void add(int x, int y){
				System.out.println("integrr sum="+(x+y));
			}
			void add(float x, float y) {
				System.out.println("decimal sum="+(x+y));
			}
		}
		public class methodoverloading1 {

			public static void main(String[] args) {
				// TODO Auto-generated method stub

				Scanner sc=new Scanner(System.in);
				Sum s=new Sum();
				System.out.println("enter two values");
				int a=sc.nextInt();
				int b=sc.nextInt();
				s.add(a, b);
				float c=sc.nextFloat();
				float d=sc.nextFloat();
				s.add(c, d);
				
			}

		}

