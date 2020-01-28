

public class Point3D {


private double x;
private double y;
private double z;

public Point3D(double x, double y, double z)   // parameterized constructor
{
	this.x=x;
	this.y=y;
	this.z=z;
}
   public String toString()           //output
   {
	   return x + " " + y + " " + z + "\n";
   }
   
   public static Point3D calcNormal(Point3D v1, Point3D v2, Point3D v3)
   {
	   {
			double x1 = v1.x , y1 = v1.y , z1 = v1.z;
			double x2 = v2.x , y2 = v2.y , z2 = v2.z;
			double x3 = v3.x , y3 = v3.y , z3 = v3.z;
			
			double a1 = x2 - x1; 
		    double b1 = y2 - y1; 
		    double c1 = z2 - z1; 
		    double a2 = x3 - x1; 
		    double b2 = y3 - y1; 
		    double c2 = z3 - z1;
		    
		    double a = b1 * c2 - b2 * c1; 
		    double b = a2 * c1 - a1 * c2; 
		    double c = a1 * b2 - b1 * a2;
			
		    double vector = (a * a) + (b * b) + (c * c) ;
			double root = java.lang.Math.sqrt(vector);
			
			double normalx = a/root;
			double normaly = b/root;
			double normalz = c/root;
			
			Point3D nor = new Point3D(normalx, normaly , normalz);
			
			return nor;
		}
	   
   }
public double getX() {
	// TODO Auto-generated method stub
	return x;
}

public double getY() {
	// TODO Auto-generated method stub
	return y;
}

public double getZ() {
	// TODO Auto-generated method stub
	return z;
}

}
