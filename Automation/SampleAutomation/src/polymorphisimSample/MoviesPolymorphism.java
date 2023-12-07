package polymorphisimSample;

abstract class Movies
{
	abstract void MoviesName();
}
class AdventureMovies extends Movies
{
	String a="Life of pie";
	void MoviesName()
	{
		System.out.println("AdventureMovies: "+a);
	}
}
class ComedyMovies extends Movies
{
	String b="Phir Hera Pheri";
	void MoviesName()
	{
		System.out.println("ComedyMovies: "+b);
	}
}
class MythologicalMovies extends Movies
{
	String c="Kantara";
	void MoviesName()
	{
		System.out.println("MythologicalMovies: "+c);
	}
}


public class MoviesPolymorphism {

	public static void main(String[] args) {
		
		AdventureMovies	advMov=new AdventureMovies();
		ComedyMovies 	ComMov=new ComedyMovies();
		MythologicalMovies	MytMov=new MythologicalMovies();
		
		advMov.MoviesName();
		ComMov.MoviesName();
		MytMov.MoviesName();
		
	}

}
