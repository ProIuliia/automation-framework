package ua.kiev.prog.automation.framework.product.app.progkievua.forum;

import org.openqa.selenium.By;
import ua.kiev.prog.automation.framework.core.product.Component;
import ua.kiev.prog.automation.framework.core.product.component.object.PageObject;
import ua.kiev.prog.automation.framework.product.app.progkievua.Forum;
import ua.kiev.prog.automation.framework.product.app.progkievua.forum.blocks.MainMenuBlock;

/**
 * ////////////////////////////////////////////////////////// *
 * Automation Framework                                       *
 * Automation Course for https://prog.kiev.ua/                *
 * ---------------------------------------------------------- *
 * Created by Yurii Voronenko                                 *
 * Email: yurii.voronenko@gmail.com                           *
 * ////////////////////////////////////////////////////////// *
 */
public class MainPageLoggedIn  extends PageObject
{

    /**
     * Этот метод должен возвращать класс компонета для объекта страницы
     * Определяет к какому компоненту привязан этот объект страницы
     *
     * @return Class
     */
    @Override
    protected Class<? extends Component> componentClass()
    {
        return Forum.class;
    }

    /**
     * Єтот метод должен возвращать локатор готовности страницы
     *
     * @return By - locator
     */
    @Override
    protected By readyLocator()
    {
        return By.xpath("//div[@id='boardindex_table']");
    }

    private By _usernameText = By.xpath("//div[@class='user_block']//a[contains(@href,'?action=profile')]/span");
    private By _goToBoardPage = By.xpath("//*[@id=\"board_25\"]/td[2]/a");
    private By _users = By.xpath("//*[@id=\"button_mlist\"]/a");

    final public String getUsername ()
    {
        return this.component().session().driver().findElement(_usernameText).getText();

    }

    final public BoardPage openBoardPage ()
    {
        // Нажимаем ссылку "QA Automation", локатор определён в приватном свойстве _goToBoardPage
        this.component().session().driver().findElement(_goToBoardPage).click();
        // Возвращаем объект страницы входа
        return new BoardPage();
    }

    public UserListPage openUsers ()
    {
        this.component().session().driver().findElement(_users).click();
        return new UserListPage ();
    }

    final public MainMenuBlock mainMenu ()
    {
        return new MainMenuBlock ();
    }

}


