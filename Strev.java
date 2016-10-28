import java.util.*;
class Strev
{
public static void main(String... args)
{
System.out.println("Enter a string");
Scanner S=new Scanner(System.in);
String a=S.next();
String rev="",m;
m=a;
for(int i=0;i<a.length();i++)
{
rev+=a.charAt(i);
}
if(m.equals(rev))
{
System.out.println("given string is palindrome");
}else
{
System.out.println("given string not  a palindrome");
}
}
}
