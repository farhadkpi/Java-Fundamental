import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		try {
		App aClass = new App();
		code cClass= new code();
		Scanner myObj = new Scanner(System.in);
		float amount;
		
		cClass.selectMode();
		for (int i=0;i<100;i++)
		{
		System.out.println("\nDo you want to continue press Y");
		if(myObj.nextLine().equals("Y"))
		{
			cClass.selectMode();
			continue;
		}
		else if(myObj.nextLine().equals("N"))
		{
			break;
		}
		}
		
		}
		catch(Exception e)
		{
			System.out.println("It is used for custom error handling which could be more understandable for the user.");
		}
	}
	
}
