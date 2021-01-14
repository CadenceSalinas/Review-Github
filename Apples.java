//reference class
class Apple
{
	//instance variable
	private String type;
	private double size;
	private boolean isTart;

	//constructors
	public Apple()
	{
		type = null;
		size = 0;
		isTart = false;
	}

	//toString
	public String toString()
	{
		String output = "Type " + type +
										"\nSize (inches diameter) " + size +
										"\nIs it tart? " + isTart;
		return output;
	}
}