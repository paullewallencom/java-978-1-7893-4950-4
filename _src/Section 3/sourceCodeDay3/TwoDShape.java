package packt.shape;

public abstract class TwoDShape
{
	private int xPos;
	private int yPos;
	
	public TwoDShape( int x, int y)
	{
		xPos = x;
		yPos = y;
	}

	public int getXPos()
	{
		return xPos;
	}

	public void setXPos(int xPos)
	{
		this.xPos = xPos;
	}

	public int getYPos()
	{
		return yPos;
	}

	public void setYPos(int yPos)
	{
		this.yPos = yPos;
	}
	 //INSANE but useful ????
	public abstract double calculateArea( );
	//{
	//	return 0.0;
	//}
	public abstract double calculatePerimeter( );
	//{
	//	return 0.0;
	//}

	public String toString()
	{
		return "TwoDShape [xPos=" + xPos + 
				", yPos=" + yPos + "]";
	}
	
}






