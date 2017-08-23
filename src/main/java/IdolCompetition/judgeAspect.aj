package IdolCompetition;

import org.aspectj.weaver.AjAttribute;

/**
 * Created by ymukhin on 8/23/2017.
 */
public aspect judgeAspect {
    public judgeAspect() {
    }

    pointcut performance() : execution(* perform(..));

    after() returning() : performance() {
        System.out.println(criticismEngine.getCriticismEngine());
    }

    private CriticismEngine criticismEngine;

    public void setCriticismEngine(CriticismEngine criticismEngine){
        this.criticismEngine = criticismEngine;
    }
}
