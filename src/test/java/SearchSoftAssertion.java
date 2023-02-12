import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SearchSoftAssertion {

    @Test
    void
    findOnTheSoftAssertionsPageSampleCodeForJUnit5() {
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $("#wiki-pages-filter").setValue("SoftAssertions");
        $("#wiki-pages-box").$(byText("SoftAssertions")).click();
        $("div#wiki-body").shouldHave(text("3. Using JUnit5 extend test class:"));
    }
}
