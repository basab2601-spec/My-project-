package day3;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Playwright;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class Parabank {

		public static void main( String[] args)
		{
			Playwright playwright = Playwright.create();
			Browser browser = playwright.chromium().launch(new LaunchOptions().setHeadless(false));
			Page page = browser.newPage();
			page.navigate("https://parabank.parasoft.com/parabank/index.htm;jsessionid=53A6C599C267A6BC21FC8FB61659826E");
			//page.locator("#Experience the difference");
			page.locator("text=Register").click();
			//assertThat(page).hasURL("https://parabank.parasoft.com/parabank/register.htm;jsessionid=046C74FC306211AB7152A3873F877C99");
			page.locator("//input[@id='customer.firstName']").fill("Basab");
			page.locator("//input[@id='customer.lastName']").fill("Roy");
			page.locator("//input[@id='customer.address.street']").fill("street 26");
			page.locator("//input[@id='customer.address.city']").fill("Korea");
			page.locator("//input[@id='customer.address.state']").fill("Seoul");
			page.locator("//input[@id='customer.address.zipCode']").fill("675");
			page.locator("//input[@id='customer.phoneNumber']").fill("9593930898");
			page.locator("//input[@id='customer.ssn']").fill("890");
			page.locator("//input[@id='customer.username']").fill("Basab2601");
			page.locator("//input[@id='customer.password']").fill("BasabRoy26**");
			page.locator("//input[@id='repeatedPassword']").fill("BasabRoy26**");
			page.locator("//input[@value='Register']").click(); 
			
			if(page.locator("text=Welcome Basab26").isVisible())
			{
				System.out.println("Successfully registered");
			}
			else {
				System.out.print("Not registered");
			}
			
			//assertThat(page.locator("text=Your account was created successfully. You are now logged in.")).isVisible();
			/*page.locator("//input[@name='username']").fill("Basab26");
			page.locator("//input[@name='password']").fill("BasabRoy26**");
			page.locator("//input[@value='Log In']").click();
			assertThat(page.locator("#overviewAccountsApp")).isVisible();
			browser.close();*/			
		}
}
