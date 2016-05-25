package serenitytest.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class SkillsCoursesPage extends PageObject {
    private By pageHeader = By.className("greenHeader");
    private By coachName = By.className("name");
    private By popUp = By.id("u11508");
    private By applicationButton = By.className("button");
    private String foundName;


    public String CoachName(String name) {
        List<WebElementFacade> allFields = findAll(coachName);
        for(WebElementFacade i : allFields){
            if(i.getText().contains(name)){
                foundName = i.getText();
                break;
            }
        }
        return foundName;
    }

    public List<String> getAllCoaches(){
        List<WebElementFacade> allFields = findAll(coachName);
        return allFields.stream().map(WebElement::getText).collect(toList());
    }


    public String CoachCourse() {
        return find(pageHeader).getText();
    }

    public void clickSubmitApplicationButton(){
        find(applicationButton).click();
    }

    public void switchToPopUp() throws Exception {
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("document.getElementById('u11508').focus();");
    }

    public boolean popUpShown(){
        return find(popUp).isDisplayed();
    }

}
