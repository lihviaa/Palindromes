import java.text.Normalizer;

public class Palindrome {
  private String text; // Variable to store the text

    // Default constructor initializes text to an empty string
    public Palindrome() {
        text = "";
    }

    // Constructor that initializes text with a given string
    public Palindrome(String text) {
        this.text = text;
    }

    // Getter method to return the current text
    public String getText() {
        return text;
    }

    // Setter method to update the text, only if the new text is not null
    public void setText(String text) {
        if (text != null) {
            this.text = text;
        }
    }

    // Method to verify if a given string is a palindrome
    public boolean verify(String text) {
        if (text == null || text.isEmpty()) {
            return false;
        }

        // Normalize and preprocess the text
        text = normalizeText(text);
        
        int i = 0; // Start index
        int j = text.length() - 1; // End index

        // Loop to compare characters from both ends of the string
        while (i <= j) {
            if (text.charAt(i) != text.charAt(j)) {
                return false; // Characters do not match
            }
            i++; // Move start index forward
            j--; // Move end index backward
        }

        return true; // The string is a palindrome
    }

    // Normalize text by removing non-alphanumeric characters and converting to lowercase
    private String normalizeText(String text) {
        text = Normalizer.normalize(text, Normalizer.Form.NFD);
        text = text.replaceAll("[\\p{M}\\s]", ""); // Remove diacritics and whitespace
        text = text.replaceAll("[^a-zA-Z0-9]", ""); // Remove non-alphanumeric characters
        return text.toLowerCase(); // Convert to lowercase
    }
}