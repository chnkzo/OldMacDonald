class Cow implements Animal 
{     
     //your code here
	protected String myType;
	protected String mySound;
	public Cow(String type, String sound)
	{
		myType = type;
		mySound = sound;
	}
	public Cow()
	{
		myType = "unkown";
		mySound = "unkown";
	}
	public String getSound()
	{
		return mySound;
	}
	public String getType()
	{
		return myType;
	}
}