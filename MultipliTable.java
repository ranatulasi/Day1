import java.util.*;
public class MultipliTable
{
public static void main(String... args)
{
Scanner S=new Scanner(System.in);
System.out.println("enter table value");
int n=S.nextInt();
System.out.println("Enter how many multipliers");
int k=S.nextInt();
int i=1;
int r;
/*do
{
 r=n*i;
System.out.println( +n+ "*" +i+ "=" +r);
i++;
}while(i<=k);*/

/*for(int i=1;i<=k;i++)
{
int r=0;
r=n*i;
System.out.println( +n+ "*" +i+ "=" +r);}*/
while(i<=k)
{
r=n*i;
System.out.println( +n+ "*" +i+ "=" +r);
i++;
}
}
}
