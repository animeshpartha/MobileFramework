package BreakingNews;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class BreakingNewsPage extends Base {

    public BreakingNewsPage(){
        PageFactory.initElements(ad,this);
    }

    @FindBy(id = "br.com.golmobile.nypost:id/logo_header")
    WebElement nyPostLogo;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Menu\"]")
    WebElement hamBurger;

    public void validateLogo(){
        boolean isLogovisible = nyPostLogo.isDisplayed();
        Assert.assertTrue(isLogovisible);
    }


}
