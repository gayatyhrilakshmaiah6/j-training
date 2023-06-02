import java.util.Scanner;
class InputDayNumberIf
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int dn;
dn=scob.nextInt();
if(dn=0){System.out.println("SUNDAY");}
else if(dn=1){system.out.println("MONDAY");}
else if(dn=2){system.out.println("TUESDAY");}
else if(dn=3){system.out.println("WEDNESDAY");}
else if(dn=4){system.out.println("THURSDAY");}
else if(dn=5){system.out.println("FRIDAY");}
else if(dn=6){system.out.println("SATURDAY");}
else{System.out.println("INVALID");}
}
}
}