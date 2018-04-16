package starter.specification

import org.junit.Before
import org.junit.ClassRule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.testatoo.bundle.html5.Div
import org.testatoo.core.component.Panel
import starter.WebDriverConfig

import static org.testatoo.core.Testatoo.*
import static org.testatoo.core.input.Key.RETURN

@RunWith(JUnit4)
class SearchPageTest {
    @ClassRule
    public static WebDriverConfig driver = new WebDriverConfig()

    @Before
    void setup() {
        visit 'http://www.qwant.com'
    }

    @Test
    void should_contain_expected_elements() {
        Panel resultPanel = $('.results-page') as Div

        searchField('What are you looking for?').should { be visible }
        resultPanel.should { be missing }

        type 'Testatoo'
        type RETURN

        resultPanel.should { be visible }
    }
}
