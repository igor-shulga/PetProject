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
import static org.junit.Assert.assertTrue;


public class SkillsUpCoursesTest extends ScenarioSteps  {
SkillsCoursesPage coursesPage;
SkillsHomePage homePage;
RegistrationPopUp popUp;



    @Step
    public void click_on_course_from_list(String courseName){
        homePage.open();
        homePage.openCoursesList();
        homePage.openCoursePage(courseName);
    }

    @Step
    public void should_see_course_name(String courseName){
    assertEquals("Course has wrong name", courseName, coursesPage.getName());
    }

    @Step
    public void should_see_coach_name(String coachName){
        System.out.println(coursesPage.getCoachName(coachName));
        assertEquals("Артем Карпов", coursesPage.getCoachName(coachName));
    }

    @Step
    public void submit_application_for_course(){
        coursesPage.clickSubmitApplicationButton();
    }

    @Step
    public void pop_up_opened() throws Exception {
        coursesPage.switchToPopUp();
    assertTrue("Application pop up not shown",coursesPage.popUpShown());
    }

    @Step
    public void pop_up_fields_as_expected(){
        assertEquals("Имя is not field name", "Имя", popUp.getFieldName("Имя"));
        assertEquals("Фамилия is not field name", "Фамилия", popUp.getFieldName("Фамилия"));
        assertEquals("Электронная почта is not field name", "Электронная почта", popUp.getFieldName("Электронная почта"));
        assertEquals("Телефон is not field name", "Телефон", popUp.getFieldName("Телефон"));

    }
}
