import java.util.*;
class Armstrong
{
public static void main(String... args)
{
int r, sum=0,m;
int res=0;
System.out.println("enter a number for finding armstrong or not");
Scanner S=new Scanner(System.in);
int n=S.nextInt();
 int z = (int)(Math.log10(n)+1);
m=n;
while(n!=0)
{
r=n%10;
res=(int) Math.pow(r,z);
sum=sum+res;
n=n/10;
}

System.out.println(sum);
if(sum==m)
{
System.out.println("Given number is Armstrong number");
}
else 
{
System.out.println("Given number is not a Armstrong number");
}
}
}

