package oops;
public class Display {
	public static void main(String[] args) {	
		Cube c=new Cube(5);
		Line l=new Line(100);
		Rectangle r=new Rectangle(5,12);
		c.draw();
		l.draw();
		r.draw();
	}
}