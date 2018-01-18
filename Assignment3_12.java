import java.util.Scanner;

public class Assignment312 {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a three digit integer");
        int input = scan.nextInt();
        while(input<100 || input>999){
            System.out.println("That's not a three digit integer, enter a three digit integer");
            input = scan.nextInt();
        }
        String inputText = Integer.toString(input);
        int flip = Character.getNumericValue(inputText.charAt(0))    +
                   Character.getNumericValue(inputText.charAt(1))*10 +
                   Character.getNumericValue(inputText.charAt(2))*100;
        if(flip == input){
            System.out.println("That number is a palindrome");
        }
        else{
            System.out.println("That number is not a palindrome");
        }
    }
}