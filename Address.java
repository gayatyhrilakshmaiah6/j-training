class Address{
String city,state,country;
public Emp(int id,String name,Address address){
this.city=city;
this.state=state;
this.country=country;
}
void display(){
System.out.println(id+" "+name);
System.out.println(address.city+""+address.state+"address.country);
}
public static void main(String args[]){
Address address1=new Address("palamaner",""Ap","India");
Address address2=new Address("chittor",""Ap","India");
Emp e1=new Emp(111,"gayi",address1);
Emp e2=new Emp(112,"venki",address2);
e1.display();
e2.display();
}
}

