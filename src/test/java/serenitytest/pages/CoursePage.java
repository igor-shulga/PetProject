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


}
