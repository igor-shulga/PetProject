package serenitytest.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RegistrationPopUp extends PageObject {
    private By popUpFields = By.className("header");


    public List<String> expectedFields() {
        List<String> expectedNames = new ArrayList<String>();
        expectedNames.add("Имя");
        expectedNames.add("Фамилия");
        expectedNames.add("Электронная почта");
        expectedNames.add("Телефон");

        return expectedNames;
    }

    public List<String> getAllFields (){

        List<WebElementFacade> allFields = find(By.id("formholder2980")).thenFindAll(popUpFields);
        List<String> fieldNames = new ArrayList<String>();
        for (WebElementFacade i: allFields){
            fieldNames.add (i.getText());
        }
        return fieldNames;
    }

    public String getFieldName(String name) {

        Map<String, String> Map = new HashMap<String, String>();
        for (int i = 0; i < 4; i++) {
            Map.put(expectedFields().get(i), getAllFields().get(i) );
        }

        for (String key : Map.keySet()) {
            return Map.get(name);
        }

        return Map.get(name);
    }

}
