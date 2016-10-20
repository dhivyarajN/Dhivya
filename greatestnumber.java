import.java.util.Scanner;
public class Greatest Number{
public static void main(String args[]){
int a,b,c;
Scanner s= new Scanner(System.in)
System.out.println("enter three number);
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();
if(a>=b&&a>=c)||(b>=a&&b>=c)||(c>=a&&c>=b)
{
System.out.println("largest number",+a,+b,+c);
else
System.out.println("not");
}}}
