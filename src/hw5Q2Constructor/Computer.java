package hw5Q2Constructor;

/*2) Create a package name "hw5Q2Constructor" in your Home Work project. Inside the package, a) Create a class "Computer". Declare some variable -- brand, model, operating system, price, madeInUSA, grade (grade as char). Declare default constructor and one parameterized constructor. Use only one System.out.println() in each constructor. b) Create another class ComputerTest. Create object from Computer class, as many as you want under main method. Initialize all the constructors. I want in console, the first outcome as -> This is from default Constructor of Computer class. Second outcome as-> My Brand: Apple, Model: MacBook Air, Operating system: MacOS Mojave, Price: 800$, Grade: A and Made in USA? Ans: false. I want the third outcome in console for your configuration. (Assume you are a Windows user even you are not). Organize your code. Push in the github. Paste your github link below.
50 points
*/
public class Computer {

	public String Brand;
	public String model;
	public String opertaingSystem;
	public int price;
	public boolean madeInUsa;
	public char grade;

	public Computer() {
		System.out.println("This is from default Constructor of Computer class");

	}
	

	public Computer(String Brand,String model,String opertaingSystem,int price,boolean madeInUsa,char grade) {
  System.out.println("My Brand: "+ Brand + "\nmodel:"+ model + "\noperating System: "+opertaingSystem+"\nprice:"+price+"\nmadeInUsa:"+madeInUsa+"\ngrade:"+grade);
	}

}
