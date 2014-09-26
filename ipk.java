import java.util.Scanner;
public class ipk{
public static void main (String[]args){
	double tot=0,totn=0,ipk=0,jums=0,jumn=0;
	String p;
	int po;
Scanner input=new Scanner (System.in);
System.out.print(" Nama	: ");
String nm=input.nextLine();
Scanner inp=new Scanner (System.in);
System.out.print(" NIM	: ");
String m=inp.nextLine();
System.out.println("=================================");
Scanner input1=new Scanner (System.in);
	int i=1;
	float n,jum;
System.out.print("Banyak Mata Kuliah yang diambil : ");
n=input1.nextFloat();
while (i<=n){
System.out.println(" ");
System.out.println(" DATA ke -"+i);
Scanner input2=new Scanner(System.in);
System.out.print("Mata Kuliah	: ");
String mk=input2.nextLine();
Scanner input3=new Scanner (System.in);
System.out.print("SKS			: ");
int sk=input3.nextInt();
Scanner input4=new Scanner (System.in);
System.out.print("Nilai			: ");
double nil=input4.nextDouble();
if (nil>=80){
p="A";
po=4;}
else if (nil>=70){
p="B";
po=3;}
else if(nil>=55){
p="C";
po=2;}
else if(nil>=50){
p="D";
po=2;}
else{
p="E";
po=1;}
System.out.println("Predikat	:"+p);
tot = po*sk;
System.out.println("Total Nilai	:"+tot);
totn +=tot;
jums +=sk;
jumn +=nil;
i++;}
}
}
