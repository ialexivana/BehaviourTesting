package com.bda.app.pages;

import ch.lambdaj.function.convert.Converter;
import com.bda.app.pages.objects.HomePageOR;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static ch.lambdaj.Lambda.convert;

public class HomePage extends BasePage implements HomePageOR {

    /**
     * To strings.
     *
     * @return the converter
     */
    private Converter<WebElement, String> toStrings() {
        return new Converter<WebElement, String>() {
            public String convert(WebElement from) {
                return from.getText();
            }
        };
    }

    /**
     * Clicks on the left menu row where name.
     * @param  name
     */
    public void clickLeftMenuRowWhereName(String name) {
        WebElementFacade menuList = find(By.xpath("//*[@id=\"menu_st\"]"));
        List<WebElement> results = menuList
                .findElements(By.tagName("li"));

        results.stream().filter(v -> v.getText().equals(name)).findFirst().get().click();
    }
}
