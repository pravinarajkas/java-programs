import java.util.Scanner;
class LeapYear{
public static void main(String[] args){
Scanner Scan=new Scanner(System.in);
System.out.print("enter a year:");

int year=Scan.nextInt();
if(year%4==0)
 if(year%100==0)
  if(year%400==0)
   System.out.println(year+" is a leap year");
  else
   System.out.println(year+" not a leap year");
 else
  System.out.println(year+" is a leap year");
else
System.out.println(year+" not a leap year");
}
}
