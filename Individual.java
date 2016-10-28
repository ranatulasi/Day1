import java.util.*;
class Individual
{
public static void main(String... args)
{
System.out.println("Enter a number");
Scanner S=new Scanner(System.in);
int n=S.nextInt();
int sum=0,r;
while(n!=0)
{
r=n%10;
sum=sum+r;
n=n/10;
}
System.out.println(sum);
}
}