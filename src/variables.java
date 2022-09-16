class Student {
	
	int id;
	float marks;
	static String college;	
}
class Employee{
	int empid;
	double salary;	
}
public class variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student R=new Student();
        R.id=112;
        R.marks=78.4f;
       Student.college="MIST";
        
        System.out.println("Student id is " + R.id);
        System.out.println("Student marks are " + R.marks);
        System.out.println("Student college is " + Student.college);
        
    Employee P =new Employee();
    P.empid=17645;
    P.salary=87656;
    
    System.out.println("Employee empid is "+P.empid);  
    System.out.println("Employee salary is "+P.salary);
	}

	}