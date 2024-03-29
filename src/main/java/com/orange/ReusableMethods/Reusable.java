package com.orange.ReusableMethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.orange.Browser.BrowserConfiguration;

public class Reusable extends BrowserConfiguration {
    WebElement e=null;
    
    protected void Click(By element)
    {
        d.findElement(element).click();; 
    }

    protected void EnterText(By element,String text)
    {
        d.findElement(element).sendKeys(text);
    }

    protected boolean ElementFound(By element)
    {
        boolean result=d.findElement(element).isDisplayed();
        return result;
    }

    protected void ImplicitWait(int delay)
    {
        d.manage().timeouts().implicitlyWait(Duration.ofSeconds(delay));
    }

    void ExplicitWait(By element,int delay)
    {
        WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(delay));
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    protected void DropdownOption(By element,String option)
    {
        List<WebElement> elements=d.findElements(element);

        for (WebElement webElement : elements) {
            if(webElement.getText().equalsIgnoreCase(option))
            {
                webElement.click();
                break;
            }
        }
    }
}
