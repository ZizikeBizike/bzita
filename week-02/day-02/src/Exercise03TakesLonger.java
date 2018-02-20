public class Exercise03TakesLonger {

    public static void main(String... args){
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)

        quote = quote.replace("It you", "It always takes longer than you");
        System.out.println(quote);


        String quote2 = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
        String substring1 = quote2.substring(0, 20);
        String substring2 = quote2.substring(20);
        String toAdd = " always takes longer than";
        quote2 = substring1 + toAdd + substring2;
        System.out.println(quote2);
    }
}
