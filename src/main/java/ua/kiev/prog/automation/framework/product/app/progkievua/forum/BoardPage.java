package ua.kiev.prog.automation.framework.product.app.progkievua.forum;

import org.openqa.selenium.By;
import ua.kiev.prog.automation.framework.core.product.Component;
import ua.kiev.prog.automation.framework.core.product.component.object.PageObject;
import ua.kiev.prog.automation.framework.product.app.progkievua.Forum;

public class BoardPage extends PageObject
{

    @Override
    protected Class<? extends Component> componentClass()
    {
        return Forum.class; // Привязываем к компоненту Forum
    }

    @Override
    protected By readyLocator()
    {
        return By.xpath("//table[@class='table_grid']");  // Локатор готовности страницы
    }

    private By _goToTopicPage = By.xpath("//*[@id=\"msg_30305\"]/a");

    final public TopicPage goTopicPage ()
    {
        // Нажимаем ссылку "QA Automation (10.08.2017)", локатор определён в приватном свойстве _goToTopicPage
        this.component().session().driver().findElement(_goToTopicPage).click();
        // Возвращаем объект страницы входа
        return new TopicPage();
    }
}

