import java.util.Scanner;
class InputDayNumber1{
{
Scanner scob=new Scanner(System.in);
int dn;
dn=scob.nextInt();
switch(dn){
case 0:System.out.println("JANUARY");break;
case 1:System.out.println("FEBUARY");break;
case 2:System.out.println("MARCH");break;
case 3:System.out.println("APRIL");break;
case 4:System.out.println("MAY");break;
case 5:System.out.println("JUNE");break;
case 6:System.out.println("JULY");break;
case 7:System.out.println("AUGUST");break;
case 8:System.out.println("SEPTEMBER");break;
case 9:System.out.println("OCTOBER");break;
case 10:System.out.println("NOVEMBER");break;
case 11:System.out.println("DECEMBER");break;
default:System.out.println("INVALID");
}
}
}