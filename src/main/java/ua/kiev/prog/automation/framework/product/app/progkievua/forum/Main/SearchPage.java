package ua.kiev.prog.automation.framework.product.app.progkievua.forum.Main;

import com.gargoylesoftware.htmlunit.Page;
import org.openqa.selenium.By;
import ua.kiev.prog.automation.framework.core.product.Component;
import ua.kiev.prog.automation.framework.core.product.component.object.PageObject;
import ua.kiev.prog.automation.framework.product.app.progkievua.Forum;
import ua.kiev.prog.automation.framework.product.app.progkievua.forum.blocks.MainMenuBlock;

public class SearchPage extends PageObject
{
    @Override
    protected Class<? extends Component> componentClass()
    {
        return Forum.class; // Привязываем к компоненту Forum
    }

    @Override
    protected By readyLocator()
    {
        return By.xpath("//li[@class='last']/a/span[text()='Поиск']");  // Локатор готовности страницы
    }

    final public MainMenuBlock mainMenu ()
    {
        return new MainMenuBlock ();
    }
}
