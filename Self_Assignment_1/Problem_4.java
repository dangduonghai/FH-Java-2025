import java.util.Arrays;

/** ****************************************************
Write a program that sets up a String variable with the soliloquy in the previous question, 
extracts the words from the text and sorts them into alphabetical order. You may define 
'words' however you wish (within reason), but provide your definition with your solution. You 
can use the sorting method of your choice. The simplest one is the bubble sort, which works 
as follows: 
•	Starting with the first element in the array compare successive elements (0 and 1, 1 
and 2, 2 and 3, and so on). 
•	If the first element of any pair is greater than the second, interchange the two 
elements. 
•	Repeat the process for the whole array until no interchanges are necessary. The array 
elements will now be in ascending order.  
•	Run the program once you have written your code. Turn in your code, and the output 
produced when the code runs.  
 ***************************************************** */
public class Problem_4 {

    public static void main(String[] args) {
        String text = "To be or not to be, that is the question;"
                + "Whether tis nobler in the mind to suffer"
                + " the slings and arrows of outrageous fortune,"
                + " or to take arms against a sea of troubles,"
                + " and by opposing end them?";
        text = text.replaceAll(" ", "");
        text = text.toLowerCase();

        char[] chars = text.toCharArray();

        Arrays.sort(chars);

        String sorted = new String(chars);
        System.out.println(sorted);
    }
}
