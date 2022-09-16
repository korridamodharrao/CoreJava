
class datavariables {

		byte b;
		short s;
		int i;
		long l;
		float f;
		double d;
		boolean b1;
		boolean b2;
		char c; 
}
public class datatypes{
public static void main(String[] args) {
	datavariables xyz=new datavariables();
	xyz.b=50;
	xyz.s=250;
	xyz.i=2147483647;
	xyz.l=8187080311l;
	xyz.f=3.14f;
	xyz.d=88.765;
	xyz.b1=true;
	xyz.b2=false;
	xyz.c='5'&'$';
	
System.out.println("byte range="+xyz.b);
System.out.println("short range="+xyz.s);
System.out.println("int range="+xyz.i);
System.out.println("lomg range="+xyz.l);
System.out.println("float range="+xyz.f);
System.out.println("double range="+xyz.d);
System.out.println("boolean="+xyz.b1);
System.out.println("boolean="+xyz.b2);
System.out.println("char="+xyz.c);
	}

}
