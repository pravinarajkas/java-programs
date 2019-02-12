import java.util.Scanner;
class SumFirstKArray{
public static void main(String[] args){
Scanner Scan=new Scanner(System.in);
System.out.print("enter a value for N:");
int N = Scan.nextInt();

System.out.print("enter a value for K:");
int K = Scan.nextInt();

int arr[]=new int[N];
int sum=0;

for(int i=0;i<N;i++){
int temp=Scan.nextInt();
arr[i]=temp;
}

for(int j=0;j<K;j++){
sum=sum+arr[j];
}
System.out.println("output: "+sum);

}
}
