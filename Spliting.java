import java.util.*;
class Spliting
{
public static void main(String args[])
{
System.out.println("Enter a statement");
Scanner S=new Scanner(System.in);
String s1=S.nextLine();
String w[]=s1.split("\\s");
System.out.println(s1.length());

System.out.println("Even number strings");
for(int i=0;i<w.length;i++)
{
if(i%2==0)
{
System.out.println(w[i]);
}



}
}
}