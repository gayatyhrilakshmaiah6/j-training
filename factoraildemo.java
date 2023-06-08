import java.util.Scanner;
 public class factoraildemo
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
int res=1;
System.out.println("Enter the positive number:");
n=sc.nextInt();
for(int i=1;i<=n;i++)
{
res=res*i;
}
System.out.println("factorial "+res);
}
}

