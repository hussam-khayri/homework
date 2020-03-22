
public class Instructors {

}

class Instructors
{
String instructorsName;
College instructorsCollege;
Instructors(String instructorsName, College instructorsCollege){
this.instructorsName=instructorsName;
this.instructorsCollege = instructorsCollege;
}
public static void main(String args[]) {
College college1 = new College("Computer Science and Information System College");
Instructors obj1 = new Instructors("Mohammed and Kalied", college1);
Instructors obj2 = new Instructors("Ali and Naif", college1);
System.out.println(college1.name);
System.out.println(" Name of the instructors is"+obj1.instructorsCollege.name);
System.out.println(" Name of the instructors is"+obj2.instructorsName);
}
}