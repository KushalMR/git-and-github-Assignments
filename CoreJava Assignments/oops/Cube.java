package oops;
public class Cube {
    int a;
    Cube(int a){
    	this.a=a;
   }
    public void draw() {
    	int area=a*a;
    	System.out.println("Area of Cube : "+area);
    }
}
