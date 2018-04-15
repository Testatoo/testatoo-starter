package starter.features.steps

import starter.WebDriverConfig
import cucumber.api.groovy.EN
import cucumber.api.groovy.Hooks

this.metaClass.mixin(Hooks)
this.metaClass.mixin(EN)

WebDriverConfig driver = new WebDriverConfig()

Before() {
    driver.before()
}

After() {
    driver.after()
}