import java.lang.module.FindException;
import java.util.Scanner;

public class MethodsProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Task 1
        /*System.out.println("Hello, and Welcome to your automatic numbers finder 🤖");
        System.out.println("Please input your three numbers:");
        int numb1 = scanner.nextInt();
        int numb2 = scanner.nextInt();
        int numb3 = scanner.nextInt();
        scanner.nextLine();


        System.out.println("The smallest of your numbers is....:");
        System.out.println(lowest(numb1, numb2, numb3));
         */

        //Task 2
        /*System.out.println("What number would you like to give me?");
        int number = scanner.nextInt();
        scanner.nextLine();

        isNumberPositive(number);
         */

        //Task 3
        /*System.out.println("Hello 😁");
        System.out.println("What is your favorite word? 😊");
        String word = scanner.nextLine();

        System.out.println("The middle letter in your favorite word is:...");
        System.out.println(whatIsMiddleChar(word));
         */


        //Task 4
        /*System.out.println("Hello again 😁");
        System.out.println("Let's find the area of your triangle?");
        System.out.println("How long is the sides?");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();

        System.out.println("The area of your triangle is:...");
        System.out.println(area(side1, side2, side3));
         */


        //Task 5
        System.out.println("Please write your password");
        String password = scanner.nextLine();

        if (isPasswordValid(password)) {
            System.out.println("Congraz, your password is valid!");
        } else {
            System.out.println("You shall NOT PASS!");
        }


    }


    //Task 1 Method
    /*public static int lowest(int numb1, int numb2, int numb3) {
        return Math.min(Math.min(numb1, numb2), numb3);
    }
     */

    //Task 2 Method
    /*public static int isNumberPositive(int positiveNegativeOrZero) {

        if (positiveNegativeOrZero > 0) {
            System.out.println("Your number is positive, congraz 👍");
        } else if (positiveNegativeOrZero < 0) {
            System.out.println("Your number is negative mate, sorry 😟");
        } else{
            System.out.println("Your number i neither positive or negative 🤔");
        }
        return 68;
    }
     */

    //Task 3 Method
    /*public static String whatIsMiddleChar(String word) {
        int length = word.length();
        int middle = length / 2;
        System.out.println(word.charAt(middle));


        return "";
         }
     */


    //Task 4 Method
    /*public static double area(double side1, double side2, double side3) {
        double areal = 0;
        double s = (side1 + side2 + side3) / 2;
        areal = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        return areal;
    }
     */


    //Task 5 Method
    public static boolean isPasswordValid(String password) {

        if (password.length() < 8) {
            return false;
        }

            for (int i = 0; i < password.length(); i++) {
                if (!Character.isLetterOrDigit(password.charAt(i))) {
                    return false;
                } else {
                    if (Character.isLetterOrDigit(password.charAt(i))) {

                    }
                    if (password.contains("secret")) {
                        return false;
                    } else {

                    }
                    if (password.charAt(0) == '-') {
                        return false;

                    } else {

                    }

                }


            }
        return true;
    }
}

