import java.util.Scanner;
class OddOrEven{
public static void main(String[] args){
Scanner Scan=new Scanner(System.in);
System.out.print(" enter a number: ");
int a =Scan.nextInt();
if (a%2==0)
System.out.println(a+ " is even number");
else
System.out.println(a+ " is odd number");
}
}
