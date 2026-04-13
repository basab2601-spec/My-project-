package day3;
import com.microsoft.playwright.*;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import static com.microsoft.playwirght.assertions.PlaywrightAssertions.assertThat;

public class ParabankLogin01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new LaunchOptions().setHeadless(false));
		Page page= browser.newPage();
		page.navigate("https://parabank.parasoft.com/parabank/index.htm");
		page.locator("//input[@name='username']").fill("Basab2601");
		page.locator("//input[@name='password']").fill("BasabRoy26**");
		page.locator("//input[@value='Log In']").click();
		if((page.locator(".smallText")).isVisible())
		{
			System.out.println("Logged in");
		}
		else
		{
			System.out.println("not Logged in");
		}
		
    }

}
