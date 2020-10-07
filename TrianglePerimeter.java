import java.util.Scanner;
class TrianglePerimeter
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Sides of triangle: ");
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
if(a+b>c && b+c>a && a+c>b && a!=0 && b!=0 && c!=0)
System.out.println("Perimeter of triangle: " + (a+b+c));
else
System.out.println("The input is invalid");
}

}
