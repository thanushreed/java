//prgm to find sum and average of 3 nos
import java.util.Scanner;
class Sumavg
{
public static void main(String[] args)
{
int a,b,c,sum;
float avg;
Scanner s=new Scanner(System.in);
System.out.println("Enter 3 numbers: ");
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();

sum=a+b+c;
avg=(float)sum/3;

System.out.println("The sum of 3 nos is :"+sum);
System.out.println("The Average of 3 nos is: "+avg);
}
}