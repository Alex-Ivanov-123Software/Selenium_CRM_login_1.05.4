package element;

import org.openqa.selenium.WebElement;
import ru.yandex.qatools.htmlelements.element.TypifiedElement;

/**
 * Represents web page button control.
 *
 * @author Alexander Tolmachev starlight@yandex-team.ru
 *         Date: 14.08.12
 */
public class Button extends TypifiedElement {
    /**
     * Specifies wrapped {@link WebElement}.
     *
     * @param wrappedElement {@code WebElement} to wrap.
     */
    public Button(WebElement wrappedElement) {
        super(wrappedElement);
    }

    /**
     * Clicks the button.
     */
    public void click() {
        getWrappedElement().click();
    }
}
