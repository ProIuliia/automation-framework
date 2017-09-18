package ua.kiev.prog.automation.framework.product.test;

import ua.kiev.prog.automation.framework.core.Test;
import ua.kiev.prog.automation.framework.core.product.Component;
import ua.kiev.prog.automation.framework.product.app.progkievua.Forum;
import ua.kiev.prog.automation.framework.product.app.progkievua.forum.*;

/**
 * ////////////////////////////////////////////////////////// *
 * Automation Framework                                       *
 * Automation Course for https://prog.kiev.ua/                *
 * ---------------------------------------------------------- *
 * Created by Yurii Voronenko                                 *
 * Email: yurii.voronenko@gmail.com                           *
 * ////////////////////////////////////////////////////////// *
 */
public class LoginTest extends Test
{

    @Override
    public String name()
    {
        return "Login to forum test";
    }

    @Override
    public void beforeTest()
    {
        // Вывод в консоль
        System.out.println("TEST: " + this.name() + " | PHASE: BEFORE RUN");
    }

    @Override
    public void test()
    {
        // Вывод в консоль
        System.out.println("TEST: " + this.name() + " | PHASE: TEST");

        // Получаем главную страницу
        MainPage mainPage   = Component.getSingleton(Forum.class).mainPage();
        // Переходим на страницу логина
        LoginPage loginPage = mainPage.getLoginPage();
        // Заходим на форум
        MainPageLoggedIn dashboard = loginPage.login("Iuliia", "Pro070982");
        // Подтверждаем что вход осуществлен
        this.assertSuccess(dashboard, "Login");
        // Выводим в консоль имя пользователя на форуме
        System.out.println("Name: " + dashboard.getUsername());
        // Home work
        // Заходим на BoardPage
        BoardPage boardPage = dashboard.openBoardPage();
        dashboard.mainMenu().openHelpPage().mainMenu().openSearchPage().mainMenu().openProfilePage().mainMenu().openUserPage();
        // Переходим на TopicPage = 'QA Automation (10.08.2017)'
        // TopicPage topic = boardPage.goTopicPage();
        // topic.printAllAuthors();
        // dashboard.openUsers().openUser().seeStatistics();
        // dashboard.openUsers().printUsers();

        // TODO домашнее задание
        // dashboard.openQAAutomation().openTopic().printAllAuthors(); (вариант с названиями методов преподавателя)
        // dashboard.openBoardPage().goTopicPage().printAllAuthors(); (вариант с моими названиями)

        // Ждём 10 сек, с перехватом исключения на прерывание выполнения потока и игнорируем его
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) { /* Игнорируем */ }

    }

    @Override
    public void afterTest()
    {
        // Вывод в консоль
        System.out.println("TEST: " + this.name() + " | PHASE: AFTER RUN");
    }
}
