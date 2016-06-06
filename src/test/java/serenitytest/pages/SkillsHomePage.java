package serenitytest.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

@DefaultUrl("http://skillsup.ua/")
public class SkillsHomePage extends PageObject {
    private By training = By.xpath(".//*[@id='menu1078']/a");
    private By courses = By.xpath(".//*[@id='menu1078']/ul/li[1]");
    private By coursesList = By.xpath(".//*[@id='subMenuSubNodes1189']/li[position()>0]/a");

    private By aboutUs = By.xpath(".//*[@id='menu3039']/a");
    private By ourTeam = By.xpath(".//*[@id='menu3039']/ul/li[1]/a");


    public void openCoursesList() {
        WebElementFacade hoverOnTraining = find(training);
        WebElementFacade hoverOnCourses = find(courses);
        Actions openCoursesList = new Actions(getDriver());
        openCoursesList.moveToElement(hoverOnTraining).perform();
        openCoursesList.moveToElement(hoverOnCourses).perform();
    }
    public void openOurTeamPage(){
        WebElementFacade hoverElement = find(aboutUs);
        WebElementFacade clickElement = find(ourTeam);
        Actions openTeamPage = new Actions(getDriver());
        openTeamPage.moveToElement(hoverElement).perform();
        openTeamPage.moveToElement(clickElement).click().perform();

    }


    
    public void openCoursePage(String courseName) {

        List<WebElementFacade> element = findAll(coursesList);

        for (WebElementFacade i: element){

            if(i.getAttribute("text").contains(courseName)){
                i.click();
                break;
            }
        }

    }


}
