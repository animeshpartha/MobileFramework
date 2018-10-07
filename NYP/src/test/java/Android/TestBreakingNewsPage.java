package Android;

import BreakingNews.BreakingNewsPage;
import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBreakingNewsPage  extends Base {

 BreakingNewsPage breakingNewsPage;

@BeforeMethod
    public void setUp(){
    breakingNewsPage = new BreakingNewsPage();
}

@Test
    public void testNyLogoVisibility(){
    breakingNewsPage.validateLogo();
}

}
