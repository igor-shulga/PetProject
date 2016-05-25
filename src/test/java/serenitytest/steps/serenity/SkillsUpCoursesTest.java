package serenitytest.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import serenitytest.pages.RegistrationPopUp;
import serenitytest.pages.SkillsCoursesPage;
import serenitytest.pages.SkillsHomePage;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


public class SkillsUpCoursesTest extends ScenarioSteps  {
SkillsCoursesPage coursesPage;
SkillsHomePage homePage;
RegistrationPopUp popUp;

    @Step
    public void click_on_course_from_list(String courseName){
        homePage.openCoursesList();
        homePage.openCoursePage(courseName);
    }

    @Step
    public void should_see_course_name(String courseName){
    assertEquals("Course has wrong name", "Test Automation (Автоматизация тестирования ПО)", coursesPage.CoachCourse());
    }

    @Step
    public void should_see_coach_name(String coachName){
        assertThat(coursesPage.getAllCoaches(), hasItem(containsString(coachName)));
    }

    @Step
    public void submit_application_for_course(){

    }

    @Step
    public void correct_submit_pop_up_opened(){

    }
}
