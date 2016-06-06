package serenitytest.pages;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OurTeamPage extends PageObject{
    private By headerPage = By.className("greenHeader");
    private By coachNames = new By.ByClassName("name");
    private By coachPosition = new By.ByClassName("position");
    private By teamList = By.className("pagelem-after-greenHeader pagelem");
    private boolean coachFound;

    public List<String> getAllCoachList() {
        List listOfCoachNames = new ArrayList();
        List<WebElementFacade> element = findAll(coachNames);
        for (WebElement i : element) {
            listOfCoachNames.add(i.getText());
        }
        return listOfCoachNames;
    }

    public List<String> getAllPositions() {
        List listOfCoachPositions = new ArrayList();
        List<WebElementFacade> element = findAll(coachPosition);
        for (WebElement i : element) {
            listOfCoachPositions.add(i.getText());
        }
        return listOfCoachPositions;
    }


    public boolean coachNameIsPresent(String name) {

        List<WebElementFacade> element = findAll(coachNames);
        for (WebElement i : element) {
            if (i.getText().contains(name)){
                return  coachFound = true;
            }
        }
        return coachFound;
    }

    public boolean pageHeaderIsOurTeam(){

        return find(headerPage).getText().contains("Наша команда");}
}

