package starter.component

import org.testatoo.bundle.html5.Div
import org.testatoo.core.CssIdentifier

import static org.testatoo.core.Testatoo.getConfig

@CssIdentifier('div.ribbon-knowledge--container')
class Ribbon extends Div {
    @Override
    String title() {
        config.evaluator.eval(this.id(), "it.find('a.ribbon_info__title').text()")
    }
}
