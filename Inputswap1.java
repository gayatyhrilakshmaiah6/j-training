import java.util.Scanner;
class InputSwap1{

public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
System.out.println("Enter a number:");
int num1,num2,num3;
num1=scob.nextInt();//5
num2=scob.nextInt();//7
num3=scob.nextInt();//6
int temp;
temp=num1;//temp=5
num1=num2;//num1=7
num2=num3;//num2=5
num3=temp;//num3=6
System.out.println(num1+"\n"+num2+"\n"num3);
}
}
