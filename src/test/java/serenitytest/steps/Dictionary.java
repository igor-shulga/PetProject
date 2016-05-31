package serenitytest.steps;

import org.jbehave.core.annotations.*;

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

  /*  @Steps
    SkillsUpCoursesTest student;
    @Given("user can open courses '$coursename'")
    public void givenTheUserIsAtSkillsUpHomePage(String coursename){
        student.click_on_course_from_list(coursename);
    }
    @When("page opened '$pageTitle'")
    public void whenCoursePageOpened(String pageTitle){
        student.should_see_course_name(pageTitle);
    }
    @When("exepected coach '$coachName'")
    public void andWhenCoachNameFound(String coachName){
        student.should_see_coach_name(coachName);
    }
    @Then("its possible to submit application for his course")
    public void thenStudentCanSubmitApplication(){
        student.submit_application_for_course();

    }*/
  /*  @Then("fields at pop up shown as expected")
    public void andThenFiledsAtPopUpAsExpected() throws Exception {// not full
        student.pop_up_fields_as_expected();
    }*/


    @Steps
    SkillsUpCoursesTest student;

    @Given("user can open course '$course'")
    @Alias("user can open course <course>")
    public void givenTheUserIsAtSkillsUpHome(String course) {
        student.click_on_course_from_list(course);
    }

    @When("page opened '$pageTitle'")
    @Alias("page opened <pageTitle>")
    public void whenCoursePageOpened(String pageTitle) {
        student.should_see_course_name(pageTitle);
    }



    @Then("expected coach '$name'")
    @Alias("expected coach <name>")
    public void andWhenCoachNameFound(String name){
        student.should_see_coach_name(name);
    }
    @Then("its possible to submit application")
    public void thenStudentCanSubmitApplication(){
        student.submit_application_for_course();

    }

}
