package serenitytest.steps;

import org.jbehave.core.annotations.*;

import net.thucydides.core.annotations.Steps;
import serenitytest.steps.serenity.EndUserSteps;
import serenitytest.steps.serenity.SkillsUpCoursesTest;

public class Dictionary {

    @Steps
    EndUserSteps endUser;

    @Given("end user is on main page")
    public void endUserOpenOurTeamPage(){
        endUser.open_Our_Team_page();
    }
    @When("our team page opened")
    public void weAreOnOurTempage(){
    endUser.our_team_page_opened();
    }
    @Then("user should see <coach> and <Coachspecialisation>")
    public void thenUserShouldSeeCoachAndPosition(@Named("coach") String coach, @Named("Coachspecialisation") String specialisation){
    endUser.user_should_see_coach_and_specification(coach,specialisation);
    }




}
