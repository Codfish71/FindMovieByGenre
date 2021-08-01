package movieClientServer;

public class MovieEntity {
	private String name;
	private float rating;
	private String[] genre;

	MovieEntity(String name,float rating,String[] genre)
	{
		this.name = name;
		this.rating = rating;
		this.genre = genre;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	public void setRating(float rating)
	{
		this.rating = rating;
	}
	public float getRating()
	{
		return this.rating;
	}
	public void setGenre(String[] genre)
	{
		this.genre = genre;
	}
	public String[] getGenre()
	{
		return this.genre;
	}
}
