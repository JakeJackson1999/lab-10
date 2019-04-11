import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Oval extends Shape
{
	private int diameter1;
	private int diameter2;
	private Point upperLeft;
	
	public Oval(Point pointUL, int d1, int d2, Color color, boolean filled) {
		super(color, filled);
		diameter1 = d1;
		diameter2 = d2;
		upperLeft = pointUL;// TODO Auto-generated constructor stub
	}
	
	public int getDiameter1()
	{
		return diameter1;
	}
	
	public int getDiameter2()
	{
		return diameter2;
	}
	
	public void draw(Graphics graphics) 
	{
		graphics.drawOval(upperLeft.x, upperLeft.y, diameter1, diameter2);
	}
	
}
