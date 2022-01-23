package hw5Q3Constructor;
/* Create a package name "hw5Q3Constructor" in your Home Work project. Inside the package, a) Create a class "Student". Declare some variable -- stName, stID, sex, isProgrammer(as boolean), grade (as float). Declare default constructor and only one parameterized constructor. Use only one System.out.println() in parameterized constructor to declare the above variables. Create another class StudentTest. Create object as many as you want under the main method. Initialize constructors. I want the first outcome in the console as --> This is from default Constructor of Student class. in the next line, The second outcome -- > Student Name: <your name>, ID: <your id>, Sex: <your sex in char>, Grade = 3.976 and Java Programmer? Ans: true. Organize the code. Push in the github. Paste your github link below.*/




public class Student {
	
	public String stName;
	public int stId;
	public char sex;
	public boolean isProgrammer;
	public float grade;       
	
	
	// Default Constructor Declared Here :
	 public Student() {
		 System.out.println("This is from default Constructor from Student class");
		 
		 
		 
	 }
	 


	 // Parameterized Constructor Declared here:
	 
	 public Student(String stName, int stId,char sex,boolean isProgrammer,float grade) {
		 System.out.println("Student Name:"+ stName + "\nID:"+stId + "\nSex:"+sex +"\nGrade:" +grade);

	
}

	


}
	
	
	
	
	


