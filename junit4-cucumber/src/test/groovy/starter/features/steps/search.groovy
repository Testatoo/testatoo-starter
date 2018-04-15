package starter.features.steps

import cucumber.api.groovy.EN
import cucumber.api.groovy.Hooks

import static org.testatoo.core.Testatoo.*
import static starter.component.Factory.*
import static org.testatoo.core.input.Key.RETURN

this.metaClass.mixin(Hooks)
this.metaClass.mixin(EN)

Given(~/^I visit the search engine QWant at '(.*)'$/) { String url ->
   visit url
}

When(~/^I search for '(.*)'$/) { search ->
   fill searchField('What are you looking for?') with search
   type RETURN
}

Then(~/^I can see the Groovy website available in the ribbon panel$/) { ->
    ribbon().should {
        be visible
        have title('Groovy (programming language)')
    }
}