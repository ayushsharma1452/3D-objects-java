
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class StlCurves {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		List<Curve> list = new ArrayList<>();
		
		list.add(new ConeCurve() );
		list.add(new MonkeySaddle() );
		list.add(new HalfSphere(20.0) );
		list.add(new MyCurve() );
		
		CreateStlCurve curve = new CreateStlCurve();
			
		Solid solid;
		String name;
		Path path;
		
		System.out.println("1 ConeCurve\r\n" + 
				"2 MonkeySaddle\r\n" + 
				"3 HalfSphere20.0\r\n" +
				"4 MyCurve"
				);
		
		System.out.print("Which curve number do you want? ");
		int choice = input.nextInt();
		
		if (choice >= 1 && choice <= list.size())
		{
			curve.createMatrix(list.get(choice - 1));
			solid = curve.createSolid(list.get(choice - 1).getName());
			
			name = "c:\\temp\\"+list.get(choice - 1).getName()+".stl";
			path = Paths.get(name);
			
			try {
				solid.toTextFile(path);
			} catch (IOException e) {
				
				e.printStackTrace();
			}	
			
			System.out.println(name + " has been created");
		}
		
		
		
		else
			System.out.println("Invalid Number, No Curve Created");
		
		
		
		
	}
	
}