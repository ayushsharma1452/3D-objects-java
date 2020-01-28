


import java.io.IOException;
	import java.nio.charset.Charset;
	import java.nio.file.Files;
	import java.nio.file.Path;
	import java.util.ArrayList;
	import java.util.List;

	public class Solid {


		private String name;

		private ArrayList<Facet> facets=new ArrayList<>();
		
		public Solid()
		{
		this.name="Empty";	
		}
		
		public Solid(String name)        //parameterized constructor
		{
			this.name=name;                 // gets the name
		}
		
		public boolean addFacet(Facet facet)
		{

			facets.add(facet);
			return true;
			
		}
		
		
		public boolean addFacet(Point3D... vertex)
		{
			if(vertex.length < 3)
			{
			return false;	
			}
			
			else 
		{
				for(int i=1; i<vertex.length-1; i++)
				{
					Facet f = new Facet(vertex[0],vertex[i],vertex[i+1]);
					facets.add(f);
				}
				return true;
			}
			
			
			
			}
		
		
		
		
		public void toTextFile(Path path ) throws IOException
		{
			List<String> message = new ArrayList<>();
			message.add(toString());
			
			Files.write(path, message, Charset.forName("UTF-8"));
			
		}
		
		public String toString()     // output
		{
			String output= "";
		
			for(Facet a : facets)
				output += a;
			
			return "solid "+ name +output+"\nendsolid "+name;     // output format 
		}


	}



