package gui.model;

public class Gnome 
{
	private String name;
	
	public Gnome()
	{
		this.name = "Gerome the Gnome";
	}
	
	public Gnome(String name)
	{
		this.name = name;
	}
	
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}

}
