package IdolCompetition;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created by ymukhin on 8/18/2017.
 */
public class Volunteer implements Thinker{
    private String thoughts;

    public String getThoughts() {
        return thoughts;
    }

    public void thinkOfSmth(String thoughts) {
        this.thoughts += thoughts;
    }
}
