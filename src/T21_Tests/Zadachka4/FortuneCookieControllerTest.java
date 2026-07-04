package T21_Tests.Zadachka4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static java.util.Collections.singletonList;

public class FortuneCookieControllerTest {

    private static FortuneCookieController  goodFactoru;
    private static FortuneCookieController  badFactory;

    static FortuneCookieController createController(boolean isPositive){
        FortuneConfig Config = new FortuneConfig(isPositive);
        FortuneCookieFactory  Factory = new FortuneCookieFactory(Config, singletonList("positive"), singletonList("negative"));
        return new FortuneCookieController(Factory);
    }

    @BeforeAll
    static void WW(){
        goodFactoru = createController(true);
        badFactory = createController(false);
    }

    @Test
    public void shouldReturnPositiveFortune (){
        Assertions.assertEquals("positive",goodFactoru.tellFortune().getFortuneText());
    }

    @Test
    public void shouldReturnNegativeFortune (){
        createController(false);
        Assertions.assertEquals("negative", badFactory.tellFortune().getFortuneText());
    }
}
