package starter.features

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith

@RunWith(Cucumber)
@CucumberOptions(
        plugin = ['pretty', 'html:target/html', 'json:target/cucumber.json'],
        strict = true,
        features=['src/test/resources/starter/features'],
        glue=['src/test/groovy/starter/features/steps']
)
class Glue {}
