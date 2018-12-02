package readinglist;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServerWebTest2 {
	
//	@Value("${local.server.port}")
//    private int port;
	
//    @BeforeClass
//    public static void openBrowser() {
//		System.setProperty("webdriver.chrome.driver", "C:\\workspace\\WebDriver\\chromedriver_win32\\chromedriver.exe");
//		browser = new ChromeDriver();
////        browser = new FirefoxDriver();
////        browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//    }

//    @AfterClass
//    public static void closeBrowser() {
//        browser.quit();
//    }

//	@Test
//	public void addBookToEmptyList() throws InterruptedException {
//		WebDriver browser;
//
//		System.setProperty("webdriver.chrome.driver", "C:\\workspace\\WebDriver\\chromedriver_win32\\chromedriver.exe");
//		browser = new ChromeDriver();
//		
////        String baseUrl = "http://localhost:" + port;
//        String baseUrl = "http://www.wikipedia.org";
//
//        browser.get(baseUrl);
//		Thread.sleep(5000);
//		
//		WebElement searchBox;
//		searchBox = browser.findElement(By.id("searchInput"));
//		searchBox.sendKeys("Software");
//		searchBox.submit();
//		Thread.sleep(3000);
//
//////		WebElement search;
////		String search_contents = browser.findElement(By.name("search")).getText();
////		System.out.println("search_contents : " + search_contents);
////				
////		assertEquals("Software", search_contents  );
//
////		WebElement title;
////		title = browser.findElement(By.name("title"));
////		title.sendKeys("what is the justice?");
////		searchBox.submit();
//		
//
////        assertEquals("You have no books in your book list",
////                     browser.findElement(By.tagName("div")).getText());
//
//
////        browser.findElementByName("title").sendKeys("BOOK TITLE");
////        browser.findElementByName("author").sendKeys("BOOK AUTHOR");
////        browser.findElementByName("isbn").sendKeys("1234567890");
////        browser.findElementByName("description").sendKeys("DESCRIPTION");
////        browser.findElement("form").submit();
////
////        WebElement dl = browser.findElementByCssSelector("dt.bookHeadline");
////        assertEquals("BOOK TITLE by BOOK AUTHOR (ISBN: 1234567890)", dl.getText());
////        WebElement dt = browser.findElementByCssSelector("dd.bookDescription");
////        assertEquals("DESCRIPTION", dt.getText());
//
//	}
	
	
	@Test
	public void contextLoads() {
		Book book = new Book();
		book.setTitle("sample");
		assertEquals("sample", book.getTitle());		
	}

}
