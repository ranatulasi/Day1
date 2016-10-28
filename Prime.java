
import java.util.*;
class Prime
{
public static void main(String... args)
{
int i,count=0,n;
System.out.println("enter n value");
Scanner S=new Scanner(System.in);
n=S.nextInt();
for(i=2;i<=n;i++)
{
if(n%i==0)
count++;
}
if(count==1)
{
System.out.println("prime number");
}
else 
{
System.out.println("not prime number");
}
}
}
