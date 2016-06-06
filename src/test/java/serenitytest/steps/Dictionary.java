package serenitytest.steps;

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




}
