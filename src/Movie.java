class HitMovie{
	String Movie;
	int Numberofartists;
	double Ratings;
	byte Mbno ;
	double collectionsfirstweek;
	float  Remuneration;
}
public class Movie {

	public static void main(String[] args) {
		HitMovie name=new HitMovie();
		
		name.Movie="Sarkaru Varri Paata";
		name.Numberofartists=24;
		name.Ratings=3.0;
		name.Mbno=27;
		name.collectionsfirstweek=65;
		name.Remuneration=50;
		
		System.out.println("Movie="+name.Movie);
		System.out.println("actors no="+name.Numberofartists);
	    System.out.println("Movie Ratings="+name.Ratings);
	    System.out.println("Mahesh babu acting movie number="+name.Mbno);
	    System.out.println("First week collections Cr="+name.collectionsfirstweek);
	    System.out.println("movie Remuneration cr="+name.Remuneration);

	}

}
