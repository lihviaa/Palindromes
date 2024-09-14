# Palindrome Checker

## Overview
This project consists of two Java classes:

1. **`Palindrome`**: A class that provides methods to check if a given string is a palindrome.
2. **`PalindromeTest`**: A class with a main method to interactively test if user-provided strings are palindromes.


## Classes 

### `Palindrome`
This class includes methods to handle and verify palindromes.

- **Constructor**
  - **`Palindrome()`**: Initializes an empy string for `text`.
  - **`Palindrome(String text)`**: Initializes `text`with a given string.
- **Methods**
  - **`getText()`**: Returns the current text.
  - **`setText(String text)`**: Sets the text if the new text is not null.
  - **`verify(String text)`**: Checks if the given string is a palindrome.
  - **`normalizeText(String text)`**: Normalizes the text by removing diacritics, non-alphanumeric characters, and converting it to lowercase.
  
### `PalindromeTest`
This class provides a command-line interface to test if strings are palindromes.

**Functionality**

- Prompts the user to enter a string.
- Checks if the string is a palindrome using the Palindrome class.
- Displays whether the string is a palindrome.
- Allows the user to exit the program by typing "exit".

## How to Run

1. Compile the Java files:
   ```
   javac Palindrome.java PalindromeTest.java
   ```
2. Run the PalindromeTest class:
   ```
   java PalindromeTest
   ```
3. Follow the prompts to enter a string or type "exit" to close the program.
   
## Example
Here is an example of how to use the Palindrome Checker:

## Notes
- The **`Palindrome`** class normalizes input text by removing diacritics and non-alphanumeric characters and converting it to lowercase to ensure accurate palindrome checks.
- The **`PalindromeTest`** class uses `Scanner` to read input from the user and displays results on the command line.
