class Student{
int rollno;
String name;
static String name="MTIET";
Student(int r.String n){
rollno=r;
name=n;
}
void display()
{
System.out.println(rollno+" "+name+" "+college);
}
}
public class TestStaticVariable1{
public static void main(String args[]);
Student s1=new Student(111,"gayathri");
Student s2=new Student(112,"revathi");
Student.college="LAKSHMIKANTH REDDY";
s1.display();
s2.display();
}
}



