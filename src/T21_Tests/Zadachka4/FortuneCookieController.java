package T21_Tests.Zadachka4;

public class FortuneCookieController {

    private final FortuneCookieFactory fortuneCookieFactory;

    public FortuneCookieController(FortuneCookieFactory fortuneCookieFactory) {
        this.fortuneCookieFactory = fortuneCookieFactory;
    }

    public FortuneCookie tellFortune() {
        return this.fortuneCookieFactory.bakeFortuneCookie();
    }
}
