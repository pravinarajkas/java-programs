import java.util.Scanner;
class Greatest{
public static void main(String[] args){
Scanner Scan=new Scanner(System.in);
System.out.print("enter the three numbers:");
int a=Scan.nextInt();
int b=Scan.nextInt();
int c=Scan.nextInt();
if ( a>b && a>c)
System.out.print(a+" is greatest");
else if (b>c)
System.out.print(b+" is greatest");
else
System.out.print(c+" is greatest");
}
}
