import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.*;

public class App {
	
	//Access Modifier
	private String userName;
	private String profession;
	public float interest;

	
	//Getter Setter for private keyword
    public String getName() {
        return this.userName;
    }
    public String setName(String userName) {
        return this.userName= userName;
    }
    
    public String getProfession() {
        return this.profession;
    }
    public String setProfession(String profession) {
        return this.profession= profession;
    }
    public String selectBank(String name)
    { 	
    	return name;
    }
    public void userInfo(String user)
    {
    	 ArrayList<String> alist=new ArrayList<String>();  
    	 alist.add("Steve");
         alist.add("Tim");
         alist.add("Tom");
         alist.add("Herry");
         alist.add("Loba");
         alist.add("Pimp");
         alist.add("Harry");
         alist.add(user);
         System.out.print(alist);
    }
    public float LoanInterest(String bank, float principal, float time)
    {
    	if(bank.equals("Habib"))
    	{
    		interest = (float) (principal * 1.22 * time);
    		return interest;
    	}
    	else if(bank.equals("Habib Metro"))
    	{
    		interest = (float) (principal * 1.83 * time);
    		return interest;
    	}
    	else if(bank.equals("Al Habib"))
    	{
    		interest = (float) (principal * 2.62 * time);
    		return interest;
    	} 
    	else 
    	{
    		return 0;
    	}
    }
   public float totalAmount(float amount)
   {
	   return amount * interest;
   }
   
   public float LoanInterest(String bank, float p, float t, float r, float n)
   {
   	if(bank.equals("Habib"))
   	{
   		interest = (float) (p * Math.pow(1 + (r / n), n * t));
   		return interest;
   	}
   	else if(bank.equals("Habib Metro"))
   	{
   		interest = (float) (p * Math.pow(1 + (r / n), n * t));
   		return interest;
   	}
   	else if(bank.equals("Al Habib"))
   	{
   		interest = (float) (p * Math.pow(1 + (r / n), n * t));
   		return interest;
   	} 
   	else 
   	{
   		return 1;
   	}
   }
  public float compoundAmount(float amount, float p)
  {
	   return amount - p;
  }
  void carLoan(double carLoan, double loanLength, double interest, double downPayment)
  {
	  if(carLoan <=0 )
	  {
		  System.out.println("Value should be more than 0");
	  }
	  else 
	  {
		  int remainingBalance = (int) (carLoan - downPayment);
		  int months = (int) (loanLength * 12);
		  int monthlyBalance = remainingBalance / months;
		  int interst = (int) (monthlyBalance * interest / 100);
		  int monthlyPayment = (int) (monthlyBalance + interst);
		  System.out.println("Monthly Payment for Car loan "+ monthlyPayment);
	  }
  }
  void countryCode()
  {
	  HashMap<String, String> code = new HashMap<>();
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter country Code?");
		String cod = myObj.nextLine();

	  
	  code.put("pk", "Pakistan");
	  code.put("in", "India");
	  code.put("ch", "China");
	  code.put("ca", "Canada");
	  code.put("us", "USA");
	  code.put("uk", "United Kingdom");
	  code.put("au", "Australia");
	  code.put("fr", "France");
	  code.put("de", "Germany");
	  code.put("ru", "Russia");
    	   System.out.println("Country is "+code.get(cod));
  }
  void regex()
  {
	  Scanner sc = new Scanner(System.in);
      System.out.println("Enter your Email to verify the email?");
      String mail = sc.next();
      String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
      boolean result = mail.matches(regex);
      if(result) {
         System.out.println("Email address is right");
      } else {
         System.out.println("Email address is wrong");
      }
   
  }
  public void userArray()
  {
	  ArrayList<String> user = new ArrayList<String>();
	  Scanner myObj = new Scanner(System.in);
	  System.out.println("Enter length which will be shown in ArrayList?");
	  int l = myObj.nextInt();
	  for(int i=0;i<l;i++)
	  {
		  user.add(myObj.next());
	  }
	  System.out.println(user);
  } 
  public void userinfo()
  {
	  Scanner myObj = new Scanner(System.in);
	  HashMap<String, String> name=new HashMap<>();

	  for(int i=0;i<2;i++)
	  {
		  System.out.println("Enter User Name and Profession");
		  String userName = setName(myObj.nextLine());
		  String profession = setProfession(myObj.nextLine());
		
		  name.put(userName,profession);
	  }
	  System.out.println("User Info is -> "+ name);
  }	  
	
}
class code extends App
{
	code()
	{
		 System.out.println("This block is for constructor !");
	}
	void countryCode()
	  {
		  HashMap<String, String> code = new HashMap<>();
			Scanner myObj = new Scanner(System.in);
			System.out.println("Enter country Code?");
			String cod = myObj.nextLine();

		  
		  code.put("pk", "Pakistan");
		  code.put("in", "India");
		  code.put("ch", "China");
		  code.put("ca", "Canada");
		  code.put("us", "USA");
		  code.put("uk", "United Kingdom");
		  code.put("au", "Australia");
		  code.put("fr", "France");
		  code.put("de", "Germany");
		  code.put("ru", "Russia");
		  code.put("bn", "Bangladesh");
	    	   System.out.println("Country is "+code.get(cod));
	  }
	
	  double selectMode()
	  {
		  Scanner myObj = new Scanner(System.in);
		  System.out.println("Select mode? \n A. Simple Interest \n B. Compound Interest \n C. Car Loan \n D. Add users in List \n E. Email Regex \n F. Check country Code \n G. Check Overriding Code \n H. User Information \n I. Abstraction concept \n J. Polymorphism concept");
		  String select = myObj.nextLine();
		  if(select.equals("A"))
	  		{
				System.out.println("Enter your Bank Name?");
				String bankName = selectBank(myObj.nextLine());
				System.out.println("Loan Interest "+LoanInterest(bankName,2, 20));
				System.out.println("Total amount after Interest "+totalAmount(2));
	  		}
			else if(select.equals("B"))
			{
				System.out.println("Enter your Bank Name?");
				String bankName = selectBank(myObj.nextLine());
				System.out.println("Compound Interest "+ LoanInterest(bankName,2, 2,2, 3));
				System.out.println("Total amount after Compound "+compoundAmount(45,2));
			}
			else if(select.equals("C"))
			{
				carLoan(2400000, 24, 0.10, 600000);
			}
			else if(select.equals("D"))
			{
				userArray();
			}
			else if(select.equals("E"))
			{
				regex();
			}
			else if(select.equals("F"))
			{
				App a= new App();
				a.countryCode();
			}
			else if(select.equals("G"))
			{
				code c= new code();
				System.out.println("Overriding concept !!!");
				c.countryCode();
			}
			else if(select.equals("H"))
			{
				userinfo();
			}
			else if(select.equals("I"))
			{
				Honda absHonda = new Honda();
				absHonda.speed();
			}
			else if(select.equals("J"))
			{
				App poly = new code();
				poly.countryCode();
			}
		return 0;	  
	  }
	  }
abstract class Car
{  
	  abstract void speed();  
}  
class Honda extends Car 
{
	public void speed()
	{
		int speed;
		int distance = 5000 , time = 100;
		speed = distance / time;
		System.out.println("Speed "+speed);
		
	}
}

