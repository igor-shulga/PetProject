package serenitytest.steps.serenity;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.containsString;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import serenitytest.pages.OurTeamPage;
import serenitytest.pages.SearchResultsPage;
import serenitytest.pages.SkillsHomePage;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class EndUserSteps extends ScenarioSteps {
    SkillsHomePage homePage;
    OurTeamPage ourTeam;
    SearchResultsPage search;

    @Step
    public void open_home_page() {
        homePage.open();
    }

    @Step
    public void open_our_team_page() {
        homePage.openOurTeamPage();
        assertTrue("incorrect page opened", ourTeam.pageHeaderIsOurTeam());
    }

    @Step
    public void should_see_coach_and_specification(String coach, String specification) {
        assertTrue(coach +" is not the coach",ourTeam.coachNameIsPresent(coach));
        assertThat("Coach position not found", ourTeam.getAllPositions(), hasItem(containsString(specification)));
    }

    @Step
    public void start_searching(String name) {
        homePage.enterWordsAndStartSearch(name);
    }

    @Step
    public void get_result_list(String name, String courseName) {
        assertThat(name + " not found", search.resultListTitles(), hasItem(containsString(name)));
        assertThat(courseName + " not found", search.resultListDescriptions(), hasItem(containsString(courseName)));
    }

    @Step
    public void enters_russian_words(String name) {
        homePage.enterWordsAndStartSearch(name);
        assertFalse(search.nameIsNotFound(name));
    }



}