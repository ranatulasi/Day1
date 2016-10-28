//Even number series and odd number series.
import java.util.*;
class Eveodd
{
public static void main(String... args)
{
System.out.println("Enter k value ");
//This is scanner class for taking input.s
Scanner S=new Scanner(System.in);
int k= S.nextInt();
System.out.println("Even number series upto=" +k);
//This loop for the even number series
for(int i=1;i<=k;i++)
{
if(i%2==0)
{
System.out.println(i);
}
}
//This loop for the odd number series
System.out.println("odd number series upto=" +k);
for(int j=1;j<=k;j++)
{
if(j%2!=0)
{
System.out.println(j);
}
}
}
}
