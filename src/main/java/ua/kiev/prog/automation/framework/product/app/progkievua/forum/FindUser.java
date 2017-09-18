package ua.kiev.prog.automation.framework.product.app.progkievua.forum;

import org.openqa.selenium.By;
import ua.kiev.prog.automation.framework.core.product.Component;
import ua.kiev.prog.automation.framework.core.product.component.object.PageObject;
import ua.kiev.prog.automation.framework.product.app.progkievua.Forum;

public class FindUser extends PageObject {
    @Override
    protected
    Class<? extends Component> componentClass() {
        return Forum.class;
    }

    @Override
    protected
    By readyLocator() {
        return By.xpath("//*[@id=\"mlist\"]/table/thead/tr/th[2]/a");
    }

    private By _kievusers = By.xpath("//*[text()='20kiev']");

    public OpenKievUser openKiev ()
    {
        this.component().session().driver().findElement(_kievusers).click();
        return new OpenKievUser ();
    }
}
