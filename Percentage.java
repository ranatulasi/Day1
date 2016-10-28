import java.text.DecimalFormat;
import java.util.*;
class Percentage
{
public static void main(String... args)
{
System.out.println("enter a string");
Scanner s=new Scanner(System.in);
String s1=s.nextLine();

int totalcha=s1.length();
int upcasech=0;
int lwcasech=0;
int digits=0;
int others=0;
for(int i=0;i<totalcha;i++)
{
char ch=s1.charAt(i);
if(Character.isUpperCase(ch))
{
upcasech++;
}else if(Character.isLowerCase(ch))
{
lwcasech++;
}else if(Character.isDigit(ch))
{
digits++;
}else
{others++;
}
}
double upercen=(upcasech*100.0)/totalcha;
double lowper=(lwcasech*100.0)/totalcha;
double digiper=(digits*100.0)/totalcha;
double othper=(others*100.0)/totalcha;
DecimalFormat formater=new DecimalFormat("##.#");
System.out.println(formater.format(upercen)+"%");
System.out.println(formater.format(lowper)+"%");
System.out.println(formater.format(digiper)+"%");
System.out.println(formater.format(othper)+"%");
}
}