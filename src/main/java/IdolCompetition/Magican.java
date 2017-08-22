package IdolCompetition;

/**
 * Created by ymukhin on 5/15/2017.
 */
public class Magican implements MindReader {
    private String thoughts;

    public String getThoughts() {
        //System.out.println(thoughts);
        return thoughts;
    }

    public void interceptThoughts(String thoughts) {
        System.out.println("Intercepting volunteer's thoughts");
        this.thoughts = thoughts;
    }
}
