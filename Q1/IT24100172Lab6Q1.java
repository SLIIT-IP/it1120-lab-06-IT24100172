import java.util.Scanner;
public class IT24100172Lab6Q1{
public static void main(String[] args){

double number,square,sqroot;
Scanner sc=new Scanner(System.in);

System.out.println("enter a number");
number=sc.nextDouble();
square=number*number;               //find square
sqroot=Math.sqrt(number);      //find squareroot


System.out.println("The suare of"+ " " +number+" " +"is :" +" " +square);
System.out.println("The squareroot of"+ " "+number+" " +"is :" +" " +sqroot);


}
}