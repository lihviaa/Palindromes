import java.util.Scanner;

class PalindromeTest {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in,"CP850");
    Palindrome palindrome = new Palindrome();
    String input = "";

    while(input.equals("exit") != true){
      
      System.out.println("\nEnter a string to check if it's a palindrome OR exit:");
      input = scanner.nextLine();

      if(input.equals("exit")){
        System.out.println("\nGoodbye! Thanks for using the Palindrome Checker!");
        break;
      }
      palindrome.setText(input);
      boolean isPalindrome = palindrome.verify(input);
       // Display the result
      if (isPalindrome) {
        System.out.println("\n\"" + input + "\" is a palindrome.");
      } else {
        System.out.println("\n\"" + input + "\" is not a palindrome.");
      }
      
    }
    scanner.close();
  }
}