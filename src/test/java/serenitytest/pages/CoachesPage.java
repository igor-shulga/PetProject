package serenitytest.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

@DefaultUrl("http://skillsup.ua/")
public class CoachesPage extends PageObject {

    private By aboutUs = By.xpath(".//*[@id='menu3039']/a");
    private By ourTeam = By.xpath(".//*[@id='menu3039']/ul/li[1]/a");
    private By skillsUpTeam = new By.ByClassName("name");// or "member" if data with position needed

    public void openOurTeamPage() {

        WebElementFacade hoverElement = find(aboutUs);
        WebElementFacade clickElement = find(ourTeam);
        Actions openTeamPage = new Actions(getDriver());
        openTeamPage.moveToElement(hoverElement).perform();
        openTeamPage.moveToElement(clickElement).click().perform();
    }

}
