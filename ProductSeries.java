import java.util.*;
class ProductSeries
{
public static void main(string args[])
{
Scanner sc=new Scanner(System.in);
int num;
int res=1;
System.out.println("Enter any positive integer:");
num=sc.nextInt();
for(i=1;i<=num;i++)
{ res*=i;       }
System.out.println("Factorial:"+res);
}
}
