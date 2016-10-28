import java.util.*;
class Fibonacci
{
public static void main(String... ar)
{
System.out.println("Enter upto range of series");
Scanner S=new Scanner(System.in);
int n=S.nextInt();
int n1,n2,n3;
System.out.println("Fibonacci series:");
System.out.println(n1);
System.out.println(n2);
for(int i=2;i<=n;i++)
{
n3=n1+n2;
System.out.println(n3);

n1=n2;
n2=n3;
}
}
}