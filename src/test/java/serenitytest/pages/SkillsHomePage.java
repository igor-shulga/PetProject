package serenitytest.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleContains;

@DefaultUrl("http://skillsup.ua/")
public class SkillsHomePage extends PageObject {


    private By aboutUs = By.xpath(".//*[@id='menu3039']/a");
    private By ourTeam = By.xpath(".//*[@id='menu3039']/ul/li[1]/a");
    private By searchField = By.id("u5016-2");
    private By training = By.xpath(".//*[@id='menu1078']/a");
    private By courses = By.xpath(".//*[@id='menu1078']/ul/li[1]");
    private By coursesList = By.xpath(".//*[@id='subMenuSubNodes1189']/li[position()>0]/a");



    public void openOurTeamPage(){
        WebElementFacade hoverElement = find(aboutUs);
        WebElementFacade clickElement = find(ourTeam);
        Actions openTeamPage = new Actions(getDriver());
        openTeamPage.moveToElement(hoverElement).perform();
        openTeamPage.moveToElement(clickElement).click().perform();

    }

    public void enterWordsAndStartSearch(String keyword) {
        WebElementFacade search = find(searchField);
        search.sendKeys(keyword, Keys.ENTER);
        waitFor(titleContains("Поиск - SkillsUp"));
    }

    public void openCoursesList() {
        WebElementFacade hoverOnTraining = find(training);
        WebElementFacade hoverOnCourses = find(courses);
        Actions openCoursesList = new Actions(getDriver());
        openCoursesList.moveToElement(hoverOnTraining).perform();
        openCoursesList.moveToElement(hoverOnCourses).perform();
    }

    public void openCoursePage(String courseName) {

        List<WebElementFacade> element = findAll(coursesList);

        for (WebElementFacade i : element) {

            if (i.getAttribute("text").contains(courseName)) {
                i.click();
                break;
            }
        }

    }

}
