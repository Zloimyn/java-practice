package T21_Tests.Zadachka4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static java.util.Collections.singletonList;

public class FortuneCookieControllerTest {

    private static FortuneCookieController badFactoru;
    private static FortuneCookieController goodFactoru;

    @BeforeAll
    static void WW(){
        FortuneConfig goodConfig = new FortuneConfig(true);
        FortuneCookieFactory goodFactory = new FortuneCookieFactory(goodConfig, singletonList("positive"), singletonList("negative"));
        goodFactoru = new FortuneCookieController(goodFactory);

        FortuneConfig badConfig = new FortuneConfig(false);
        FortuneCookieFactory badFactory = new FortuneCookieFactory(badConfig, singletonList("positive"), singletonList("negative"));
        badFactoru = new FortuneCookieController(badFactory);
    }

    @Test
    public void shouldReturnPositiveFortune (){
        Assertions.assertEquals("positive",goodFactoru.tellFortune().getFortuneText());
    }

    @Test
    public void shouldReturnNegativeFortune (){
        Assertions.assertEquals("negative", badFactoru.tellFortune().getFortuneText());
    }
}
