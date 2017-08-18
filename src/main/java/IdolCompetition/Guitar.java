package IdolCompetition;

import org.springframework.stereotype.Component;

/**
 * Created by ymukhin on 8/2/2017.
 */

@Component
@StringedInstrument
@Strummed
public class Guitar implements Instrument {

    public Guitar() {

    }

    public void play() {
        System.out.println("guitar");
    }
}
