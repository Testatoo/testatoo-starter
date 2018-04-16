package starter.component

import static org.testatoo.core.Testatoo.$

class Factory {
    static Ribbon ribbon() {
        $('div.ribbon-knowledge--container') as Ribbon
    }
}
