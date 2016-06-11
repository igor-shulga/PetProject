package serenitytest.steps.serenity;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.containsString;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import serenitytest.pages.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class EndUserSteps extends ScenarioSteps {
    SkillsHomePage homePage;
    OurTeamPage ourTeam;
    SearchResultsPage search;
    CoursePage coursePage;
    CoachPersonalPage personalPage;

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
    public void get_result_list(String titleResults, String description ) {
        assertThat(titleResults+" not found", search.resultListTitles(), hasItem(containsString(titleResults)));
        assertThat(description + " not found", search.resultListDescriptions(), hasItem(containsString(description)));
    }

    @Step
    public void enters_russian_words(String name) { // not found
        homePage.enterWordsAndStartSearch(name);
    }

    @Step
    public void check_resultSetNegative(String name){
        assertFalse(search.nameIsNotFound(name));
    }

    @Step
    public void open_course_page(String courseName){
        homePage.openCoursesList();
        homePage.openCoursePage(courseName);
    }

    @Step
    public void check_opened_page(String name){
        assertTrue("incorrect page opened", coursePage.checkCourseName(name));
    }

    @Step
    public void check_course_description( String price,String groupSize){
        coursePage.getCourseDescriptions();
        assertThat(price+" incorrect", coursePage.getCourseDescriptions(), hasItem(containsString(price)));
        assertThat(groupSize+" incorrect", coursePage.getCourseDescriptions(), hasItem(containsString(groupSize)));
    }

    @Step
    public void open_coach_personal_page(String coachName) {
        ourTeam.openCoachPersonalPage(coachName);
    }

    public void check_coach_name_and_course_name(String coachName, String courseName) {

        assertEquals(coachName + " incorrect", coachName, personalPage.getCoachNameFromPage());
        assertTrue(courseName + " incorrect", personalPage.getCoachCourseFromPage().contains(courseName));


    }
}