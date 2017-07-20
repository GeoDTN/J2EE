package collpkg;

public class Gatto {
	public String Nm;
	public int Id;
	
	// costruttore
	public Gatto(int i, String s)
	{
		Id = i;
		Nm = s;
	}
	
	// restituisce l  identificativo unico
	public int getId()
	{
		return Id;
	}
		
	// restituisce il nome
	public String getName()
	{
		return Nm;
	}
}
