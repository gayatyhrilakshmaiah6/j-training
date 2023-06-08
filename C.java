class C{
C(){
this(5);
System.out.println("hello c");
}
C(int x){
System.out.println(x);
}
}
class TestThis6{
public static void main(String args[]){
C c=new C(10);
}
}
