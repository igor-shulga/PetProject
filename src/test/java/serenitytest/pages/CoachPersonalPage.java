package serenitytest.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class CoachPersonalPage extends PageObject {

    private By personalPageHeader = By.className("greenHeader");
    private By personalPageDescription = By.className("text");

    public String getCoachNameFromPage(){
        return find(personalPageHeader).getText();}

    public String getCoachCourseFromPage(){
        return find(personalPageDescription).getText();
    }

}
