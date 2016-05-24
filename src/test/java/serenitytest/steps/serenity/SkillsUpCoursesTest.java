package serenitytest.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import serenitytest.pages.SkillsCoursesPage;
import serenitytest.pages.SkillsHomePage;

import static org.junit.Assert.assertEquals;


public class SkillsUpCoursesTest extends ScenarioSteps  {
SkillsCoursesPage coursesPage;
SkillsHomePage homePage;

    @Step
    public void click_on_course_from_list(String courseName){
        homePage.openCoursesList();
        homePage.openCoursePage(courseName);
    }

    @Step
    public void should_see_course_name(String courseName){
    assertEquals("Course has wrong name", "Test Automation (Автоматизация тестирования ПО)", coursesPage.CoachCourse());
        //tst
    }
}
