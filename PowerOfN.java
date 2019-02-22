import java.util.Scanner;
class PowerOfN{
public static void main(String[] args){
Scanner Scan=new Scanner(System.in);

System.out.print("enter a value for N:");
int N=Scan.nextInt();

System.out.print("enter a value for k:");
int k=Scan.nextInt();
int r=1;
while(k!=0){
r*=N;
--k;
}
System.out.print("result: "+r);
}
}

