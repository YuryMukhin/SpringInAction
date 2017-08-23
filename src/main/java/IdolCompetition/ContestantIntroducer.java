package IdolCompetition;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * Created by ymukhin on 8/23/2017.
 */
@Aspect
public class ContestantIntroducer {
    @DeclareParents(
            value = "IdolCompetition.Performer+",
            defaultImpl = GraciousContestant.class
    )
    public static Contestant contestant;
}
