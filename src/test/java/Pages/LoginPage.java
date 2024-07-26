package Pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://t24uat3mig6test.lpbank.com.vn/BrowserWeb/servlet/BrowserServlet")
public class LoginPage extends PageObject {

    public static Target USERNAME_TEXTBOX = Target.the("username textbox").located(By.xpath("//*[@class = 'input_user']"));

    public static Target PASSWORD_TEXTBOX = Target.the("password textbox").located(By.xpath("//*[@class=\"input_box\"]"));

    public static Target LOGIN_BUTTON = Target.the("login button").located(By.xpath("//*[@class = 'sign_in']"));
}
