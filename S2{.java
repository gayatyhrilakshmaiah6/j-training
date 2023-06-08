class S2{
void m(S2 obj){
System.out.println("method is invoked");
}
void p(){
m(this);
}
public static void main(Strin args[]){
S2.s1=new S2();
s1.p();
}
}
