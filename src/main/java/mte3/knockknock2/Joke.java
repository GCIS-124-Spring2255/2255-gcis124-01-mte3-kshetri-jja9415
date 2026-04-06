// Exam: 2255 GCIS 124, Mid Term Exam #3, Question 3
// Filename: Joke.java (inside knockknock2 package)

package mte3.knockknock2;

public class Joke {
    private final String setup;
    private final String punchline;

    public Joke(String setup, String punchline) {
        this.setup = setup;
        this.punchline = punchline;
    }
    public String getSetup() {
        return setup;
    }
    public String getPunchline() {
        return punchline;
    }
    // isResponseValid() method
    public boolean isResponseValid(String response) {    return response.equals(setup + " who?");    }

} // Joke { } class closed

