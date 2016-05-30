package serenitytest.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import net.thucydides.core.annotations.Steps;
import serenitytest.steps.serenity.EndUserSteps;
import serenitytest.steps.serenity.SkillsUpCoursesTest;

public class Dictionary {

    @Steps
    EndUserSteps endUser;


    @Given("the user is on the Wikionary home page")
    public void givenTheUserIsOnTheWikionaryHomePage() {
        endUser.is_the_home_page();
    }

    @When("the user looks up the definition of the word '$word'")
    public void whenTheUserLooksUpTheDefinitionOf(String word) {
        endUser.looks_for(word);
    }

    @Then("they should see the definition '$definition'")
    public void thenTheyShouldSeeADefinitionContainingTheWords(String definition) {
        endUser.should_see_definition(definition);
    }

    @Steps
    SkillsUpCoursesTest coursesTest;
    @Given("user can open courses '$coursename'")
    public void givenTheUserIsAtSkillsUpHomePage(String coursename){
        coursesTest.click_on_course_from_list(coursename);
    }
    @When("page opened '$pageTitle'")
    public void whenCoursePageOpened(String pageTitle){
        coursesTest.should_see_course_name(pageTitle);
    }
    @Then("exepected coach '$coachName'")
    public void thenCoachNameFound(String coachName){
        coursesTest.should_see_coach_name(coachName);
    }
}
