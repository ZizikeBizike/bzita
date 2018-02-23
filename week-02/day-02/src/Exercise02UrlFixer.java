public class Exercise02UrlFixer {

    public static void main(String... args){

        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crutial component, find out what it is and insert it too!
        // Try to solve it more than once using different String functions!
        // It should be : "https://www.reddit.com/r/nevertellmetheodds"

        String url = "https//www.reddit.com/r/nevertellmethebots";

        url = url.replace ("bots", "odds");
        String toAdd = ":";
        url = url.substring(0, 5) + toAdd + url.substring(5);

        System.out.println(url);

        //Easier version:

        String url2 = "https//www.reddit.com/r/nevertellmethebots";

        url2 = url2.replace ("ps//", "ps://");
        url2 = url2.replace ("bots", "odds");

        System.out.println(url2);
    }
}
