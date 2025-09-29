
/** ****************************************************
 * In the following code the soliloquy is analyzed character by character to determine the vowels,
 * spaces and letters used. Fill in the code that computes the number of spaces, vowels, and
 * consonants.
 ***************************************************** */
public class Problem_3 {

    public static void main(String[] args) {
        String text = "To be or not to be, that is the question;"
                + "Whether tis nobler in the mind to suffer"
                + " the slings and arrows of outrageous fortune,"
                + " or to take arms against a sea of troubles,"
                + " and by opposing end them?";
        text = text.toLowerCase();
        int spaces = 0, vowels = 0, not_letters = 0, consonants = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                spaces++;
            } else if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u') {
                vowels++;
            } else if ((33 <= text.charAt(i) && text.charAt(i) <= 63) || (91 <= text.charAt(i) && text.charAt(i) <= 96)
                        || (123 <= text.charAt(i) && text.charAt(i) <= 126))/* Define non-letter characters */ {
                not_letters++;
            } else {
                consonants++;
            }
        }
        System.out.println("The text contained vowels: " + vowels);
        System.out.println("The text contained consonants: " + consonants);
        System.out.println("The text contained spaces: " + spaces);
        System.out.println("The text contained non-letter characters: " + not_letters);
    }
}
