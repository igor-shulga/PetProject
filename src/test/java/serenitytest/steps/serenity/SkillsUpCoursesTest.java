package serenitytest.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import serenitytest.pages.SkillsHomePage;

import static org.hamcrest.Matchers.hasItem;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;


public class SkillsUpCoursesTest extends ScenarioSteps  {
SkillsCoursesPage coursesPage;
SkillsHomePage homePage;
RegistrationPopUp popUp;



    @Step
    public void click_on_course_from_list(String course){
        homePage.open();
        homePage.openCoursesList();
        homePage.openCoursePage(course);
    }

    @Step
    public void should_see_course_name(String pageTitle){
    assertEquals("Course has wrong name", pageTitle, coursesPage.getName());
    }

    @Step
    public void should_see_coach_name(String coachName){
        assertEquals("Артем Карпов", coursesPage.getCoachName(coachName));
    }

    @Step
    public void submit_application_for_course(){
        coursesPage.clickSubmitApplicationButton();
        assertTrue("Application pop up not shown",coursesPage.popUpShown());
    }


    @Step
    public void pop_up_fields_as_expected() throws Exception {
        coursesPage.switchToPopUp();
        assertEquals("Имя is not field name", "Имя", popUp.getFieldName("Имя"));
        assertEquals("Фамилия is not field name", "Фамилия", popUp.getFieldName("Фамилия"));
        assertEquals("Электронная почта is not field name", "Электронная почта", popUp.getFieldName("Электронная почта"));
        assertEquals("Телефон is not field name", "Телефон", popUp.getFieldName("Телефон"));

    }
}
