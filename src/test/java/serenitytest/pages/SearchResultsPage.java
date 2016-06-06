package serenitytest.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SearchResultsPage extends PageObject {
    private By resultTitle = By.xpath(".//*[@id='xsltsearch_results']/div[position()>0]/p[1]/a");
    private By resultDescription = By.xpath(".//*[@id='xsltsearch_results']/div[position()>0]/p[2]");


    public List<String> resultListTitles() {
        List resultListTitles = new ArrayList();
        List<WebElementFacade> element = findAll(resultTitle);
        for (WebElement i : element) {
            resultListTitles.add(i.getText());
        }
        return resultListTitles;
    }

    public List<String> resultListDescriptions() {
        List resultListDescription = new ArrayList();
        List<WebElementFacade> element = findAll(resultDescription);
        for (WebElement i : element) {
            resultListDescription.add(i.getText());
        }
        return resultListDescription;
    }

    public boolean nameIsNotFound(String name) {
        try {
            find(resultTitle).getText().contains(name);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
    /*
   public String getCoachName(String name) {
        List<WebElementFacade> element = findAll(resultTitle);
        for (WebElement i : element) {
            if (i.getAttribute("text").contains(name)) {
                coachName = i.getAttribute("text");
                break;
            }
        }
        return coachName;}
     */

}
