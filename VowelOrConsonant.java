import java.util.Scanner;

class VowelOrConsonant{

public static void main(String[] args){

Scanner Scan=new Scanner(System.in);
System.out.print(" enter a string: ");
char ch=Scan.next().toLowerCase().charAt(0);

if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
System.out.print(ch+" is vowel");
else
System.out.print(ch+" is consonant");

}
}
