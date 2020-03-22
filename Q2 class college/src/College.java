

class College
{
   String name;
   
   College(String name)
   {
     
       this.name = name;
   }
}
class Student
{
   int studentID;
   String studentName;
   //Creating Part-of relationship with College class
   College studentCollege; 

   Student(int studentID, String studentName, College studentCollege){
       this.studentID=studentID;
       this.studentName=studentName;
       this.studentCollege = studentCollege;
   }
   
  public static void main(String args[]){
      College college1 = new College("Computer Science and Information System College");
      College college2 = new College("Medicine College");
 
       Student obj1 = new Student(4321234, "Mohammed", college1);
       Student obj2 = new Student(4123456, "Saleh", college2);
 
       System.out.print(obj1.studentID+",");
       System.out.println(obj1.studentName);
       System.out.print(obj1.studentCollege.name+",");
       System.out.println(obj2.studentID);
       System.out.println(obj2.studentName);
       System.out.print(obj2.studentCollege.name);
   }
}
