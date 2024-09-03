import java.util.Scanner;

public class IT24100172Lab6Q2C {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int count = 1;
        String numbers = "";
	int sum=0;

        System.out.println("Please Enter 10 Numbers :");

        while (count <= 10) {
            System.out.print("Enter number" + " " + count + ":");
            int no = input.nextInt();
            numbers = numbers + no + " ";
            count=count+1;
	sum=sum+no;

        }
        System.out.println("The numbers you entered are :");
        System.out.println(numbers);
	System.out.println();

	System.out.println("Sum of the numbers: "+sum);
	System.out.println("Average of the numbers: "+sum/10.0);
    }
}