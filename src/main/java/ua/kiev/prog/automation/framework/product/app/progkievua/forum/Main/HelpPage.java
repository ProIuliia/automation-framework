package ua.kiev.prog.automation.framework.product.app.progkievua.forum.Main;

import org.openqa.selenium.By;
import ua.kiev.prog.automation.framework.core.product.Component;
import ua.kiev.prog.automation.framework.core.product.component.object.PageObject;
import ua.kiev.prog.automation.framework.product.app.progkievua.Forum;
import ua.kiev.prog.automation.framework.product.app.progkievua.forum.blocks.MainMenuBlock;

public class HelpPage extends PageObject
{
    @Override
    protected Class<? extends Component> componentClass()
    {
        return Forum.class; // Привязываем к компоненту Forum
    }

    @Override
    protected By readyLocator()
    {
        return By.xpath("//li[@class='last']/a/span[text()='Помощь']");  // Локатор готовности страницы
    }

    final public MainMenuBlock mainMenu ()
    {
        return new MainMenuBlock ();
    }

}
