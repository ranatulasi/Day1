import java.util.*;
class Palindrome
{
public static void main(String... args)
{
System.out.println("enter n value");
Scanner S=new Scanner(System.in);
int n=S.nextInt();
int m,sum=0,r;
m=n;
while(n!=0)
{
r=n%10;
sum=sum*10+r;
n=n/10;
}
if(m==sum)
{
System.out.println("Given number is palindrome");
}
else
{
System.out.println("Given number is not plaindrome");
}
}
}