import java.util.Scanner;

public class IT24100172Lab6Q2B {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int count = 1;
        String numbers = "";

        System.out.println("Please Enter 10 Numbers :");

        while (count <= 10) {
            System.out.print("Enter number" + " " + count + ":");
            int no = input.nextInt();
            numbers = numbers + no + " ";
            count=count+1;

        }
	System.out.println();
        System.out.println("The numbers you entered are :");
        System.out.println(numbers);
    }
}