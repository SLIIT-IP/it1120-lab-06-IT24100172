import java.util.Scanner;

public class IT24100172Lab6Q3 {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        double sumOfSquares=0.0,rms;
        int count = 0;
        int number;
	
        System.out.println("Enter positive integers (terminate input with -99):");

        while (true) {
            System.out.print("Enter a number: ");
            number = input.nextInt();

            if (number == -99) {
                break;
            }
            
            if (number < 0) {
                System.out.println("Invalid input. Please enter positive integer or -99 to terminate.");
                continue;
            }

            sumOfSquares = sumOfSquares+Math.pow(number, 2);
            count=count+1;
        }


            rms = Math.sqrt(sumOfSquares / count);
            System.out.println("The Root Mean Square (RMS) is: " + rms);
    }
}

