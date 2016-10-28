import java.util.*;

class Facto1
{
int fact(int n)
{
int res;
if(n==1)
return 1;
res=fact(n-1)*n;
return res;
}

}

class Factorecu
{
public static void main(String... args)
{
System.out.println("enter a number");
Scanner S=new Scanner(System.in);
int n=S.nextInt();
Facto1 fe=new Facto1();
int res=fe.fact(n);
System.out.println(res);
}
}