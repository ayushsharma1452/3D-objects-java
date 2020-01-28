

public class Facet {

private Point3D  normal =new Point3D(0,0,0);
private Point3D v1;
private Point3D v2;
private Point3D v3;

public Facet(Point3D v1, Point3D v2, Point3D v3)    // parameterized constructor 
{  
	
	this.v1=v1;
	this.v2=v2;
	this.v3=v3;
	normal = Point3D.calcNormal(v1,v2,v3) ;
}

public String toString()          // output
{
	return "\nfacet normal "+normal+" outer loop\n  vertex "+ v1 +"  vertex "+ v2 +"  vertex "+ v3 +" endloop\nendfacet ";
     	
    
}
}
