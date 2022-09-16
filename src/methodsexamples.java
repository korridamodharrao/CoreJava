class railwaystation{
	void inqury() {
		System.out.println("rail timmings");
	}
	void Counter(String string) {
		System.out.println("given the money");
	}
	String choicetimings() {
		System.out.println();
		return "timings";
	}
	String Collectingticket() {
		System.out.println("amount given="+150);
		return "tacking ticket";
	}
}
public class methodsexamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		railwaystation rw=new railwaystation();
		rw.inqury();
		rw.Counter("given the money="+150);
System.out.println("timings="+rw.choicetimings());
System.out.println("ticket="+rw.Collectingticket());
	}
	

}
