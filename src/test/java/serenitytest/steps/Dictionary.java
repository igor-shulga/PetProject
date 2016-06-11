package serenitytest.steps;

import org.eclipse.jetty.util.annotation.Name;
import org.jbehave.core.annotations.*;

import net.thucydides.core.annotations.Steps;
import serenitytest.steps.serenity.EndUserSteps;

public class Dictionary {

    @Steps
    EndUserSteps user;

    @Given("end user is on main page")
    public void endUserOpenHomePage() {
        user.open_home_page();
    }
    @When("our team page opened")
    public void endUserOpenOurTeamPage() {
        user.open_our_team_page();
    }

    @Then("user should see <coach> and <Coachspecialisation>")
    public void thenUserShouldSeeCoachAndPosition(@Named("coach") String coach, @Named("Coachspecialisation") String specialisation){
        user.should_see_coach_and_specification(coach, specialisation);
    }

    @When("user starts searching for <name> in english")
    public void endUserStartSerachingByName(@Named("name") String name){
        user.start_searching(name);
    }

    @Then("result page contain <titleResult> and <descriptionResult>")
    public void endUserAnalyzeTitleAndDecriptionOfResulset(@Named("titleResult") String titleResult, @Named("descriptionResult") String descriptionResult){
        user.get_result_list(titleResult,descriptionResult);
    }

    @When("user starts searching for name '$name'")
    public void startSearchingNameInRussian(String name){
        user.enters_russian_words(name);
    }

    @Then("result page should not contain name '$name'")
    public void checkResultPage(String name){
        user.check_resultSetNegative(name);
    }

    @When("I can select <course> from list of avaliable")
    public void openCourseFromTheLst(@Named("course") String course){
        user.open_course_page(course);
    }

    @Then("course page header contains name of <course>")
    public void checkPageHeader(@Named("course") String course){
        user.check_opened_page(course);
    }

    @Then("price <price> and group <size> as expected")
    public void checkGroupSizeAndPrice(@Named("price") String price, @Named("size") String size){
        user.check_course_description(price,size);
    }

    @Then("user opens personal coach with <searchName> page from the list")
    public void openCoachsPersonalPage(@Name("searchName") String searchName) {
        user.open_coach_personal_page(searchName);
    }

    @Then("user should see coach name <nameOnPage> and course name <courseName>")
    public void shouldSeeCoachNameAndCourse(@Named("nameOnPage") String nameOnPage, @Named("courseName") String courseName) {
        user.check_coach_name_and_course_name(nameOnPage, courseName);
    }

}
