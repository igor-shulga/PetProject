package serenitytest.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class CoachPersonalPage extends PageObject {

    private By skillsUpTeam = new By.ByClassName("name");
    private By personalPageHeader = By.className("greenHeader");
    private By personalPageDescription = By.className("text");

    public void openCoachPersonalPage(String coachName){
        List<WebElementFacade> element = findAll(skillsUpTeam);
        for (WebElement i : element){
            if (i.getText().contains(coachName)){
                i.click();
                break;
            }
        }
    }

    public String getCoachNameFromPage(){
        return find(personalPageHeader).getText();}

    public String getCoachCourseFromPage(){
        return find(personalPageDescription).getText();
    }

}
