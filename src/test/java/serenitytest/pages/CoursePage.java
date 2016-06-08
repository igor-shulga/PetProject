package serenitytest.pages;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class CoursePage extends PageObject {

    private By pageHeader = By.className("greenHeader");
    private By courseDescription = By.xpath(".//*[@id='page_position_content']/div[3]/div/div/div[1]/div/p[position()>6]");
    private By allCoaches = By.className("coach-data-multiple");
    private By coachName = By.className("name");
    private String foundName;

    public Boolean checkCourseName(String name) {
        return find(pageHeader).getText().contains(name);
    }

    public List<String> getCourseDescriptions() {
        List<String> descriptionList = new ArrayList();
        List<WebElementFacade> element = findAll(courseDescription);
        for (WebElement i : element) {
            descriptionList.add(i.getText());
        }
        return descriptionList;
    }


    public String getCoachName(String name) {

        //List<WebElementFacade> allFields = find(allCoaches).thenFindAll(coachName);
        List<WebElementFacade> allFields = findAll(coachName); // needs to be clarified, cuz when I'm using findAll by class name it returns null

        for (WebElement i : allFields) {
            if (i.getText().equals(name)) {
                foundName = i.getText();
                break;
            }
        }
        return foundName;
    }

}
