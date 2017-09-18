package ua.kiev.prog.automation.framework.product.app.progkievua.forum;

import org.openqa.selenium.By;
import ua.kiev.prog.automation.framework.core.product.Component;
import ua.kiev.prog.automation.framework.core.product.component.object.PageObject;
import ua.kiev.prog.automation.framework.product.app.progkievua.Forum;

public class OpenKievUser extends PageObject {
    @Override
    protected
    Class<? extends Component> componentClass() {
        return Forum.class;
    }

    @Override
    protected
    By readyLocator() {
        return By.xpath("//*[@id=\"profileview\"]/div[1]/h3/span");
    }

    private By _seestats = By.xpath("//*[@id=\"infolinks\"]/a[2]");

    public SeeStatistics seeStatistics ()
    {
        this.component().session().driver().findElement(_seestats).click();
        return new SeeStatistics();
    }
}
