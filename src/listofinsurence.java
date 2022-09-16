class lifeinsurence{
	void greetingcustomer() {
		System.out.println("Hello welcome to ICICI insurence office");
	}
	void fillform() {
		System.out.println("policy no:5353,name= k murthi");
		
	}
	void submitproof(String hospitalization, String address) {
		System.out.println("hospital datails="+hospitalization+" and addres="+address);
	}
	String claimform() {
		return "claimform";	
	}
	String deposite(int amount) {
		System.out.println("insurence value="+amount);
		return "insurence seccesfull";
	}
	
}
public class listofinsurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		lifeinsurence ICICI=new lifeinsurence();
		
		ICICI.greetingcustomer();
		ICICI.fillform();
		ICICI.submitproof("hospitalization no:12345","address:hyd");
		System.out.println("Bank given="+ICICI.claimform());
		System.out.println(" insurence="+ICICI.deposite(100000));
		
	}
	
	

}
