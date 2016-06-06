package serenitytest.steps.serenity;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.containsString;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import serenitytest.pages.OurTeamPage;
import serenitytest.pages.SkillsHomePage;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class EndUserSteps extends ScenarioSteps {
    SkillsHomePage homePage;
    OurTeamPage ourTeam;

    @Step
    public void open_Our_Team_page(){
        homePage.open();
        homePage.openOurTeamPage();

    }

    @Step
    public void our_team_page_opened(){
        assertTrue("incorrect page opened",ourTeam.pageHeaderIsOurTeam());
    }

    @Step
    public void user_should_see_coach_and_specification(String coach, String specification){

        assertTrue(coach +" is not the coach",ourTeam.coachNameIsPresent(coach));
        assertThat(ourTeam.getAllPositions(), hasItem(containsString(specification)));

    }




}