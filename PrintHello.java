import java.util.Scanner;
class PrintHello{
public static void main(String[] args){
Scanner Scan= new Scanner(System.in);
System.out.print("enter the value of N:");
int N=Scan.nextInt();
int x=1;
while(x<=N){
System.out.println("hello!");
x++;
}
}
}
