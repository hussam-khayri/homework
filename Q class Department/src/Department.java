
publicclass Department
{
 String departmentName;
 //Creating Part-of relationship with Address class
 College departmentCollege; 
 Department(String departmentName, College departmentCollege){
     this.departmentName=departmentName;
     this.departmentCollege = departmentCollege;
 }
 public static void main(String args[]){
	      College college1 = new College("Computer Science and Information System College");
	       Department obj1 = new Department("CS", college1);
	       Department obj2 = new Department("IS", college1);
	       System.out.println(college1.name);
	       System.out.println("Name of the department is "+obj1.departmentCollege.name);
	       System.out.println("Name of the department is "+obj2.departmentName);
	       
	   }
	}
	