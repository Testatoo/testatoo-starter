package starter.specification

import io.github.bonigarcia.SeleniumExtension
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.openqa.selenium.chrome.ChromeDriver
import org.testatoo.bundle.html5.Div
import org.testatoo.core.component.Panel
import org.testatoo.evaluator.webdriver.WebDriverEvaluator

import static org.testatoo.core.Testatoo.*
import static org.testatoo.core.input.Key.RETURN

@ExtendWith(SeleniumExtension.class)
class SearchPageTest {

    SearchPageTest(ChromeDriver driver) {
        config.evaluator = new WebDriverEvaluator(driver)
    }

    @BeforeEach
    void setup() {
        visit 'http://www.qwant.com'
    }

    @Test
    void should_contains_expected_elements() {
        Panel resultPanel = $('.results-page') as Div

        searchField 'What are you looking for?' should { be visible }
        resultPanel.should { be missing }

        type 'Testatoo'
        type RETURN

        resultPanel.should { be visible }
    }
}
