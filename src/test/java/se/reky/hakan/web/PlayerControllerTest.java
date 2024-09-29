package se.reky.hakan.web;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

@Disabled
public class PlayerControllerTest {

    private WebDriver webDriver;

    private String url = "http://localhost:8080/players";


    @BeforeAll
    public static void init(){
        WebDriverManager.chromedriver().setup();

    }

    @BeforeEach
    public void setDriver(){
        webDriver = new ChromeDriver();

        webDriver.get(url);
    }



    @Test
    public void numOfPlayersShouldBeTwo() {

        WebElement nrOfPlayers = webDriver.findElement(By.tagName("ul"));
        int nrOfPlayersInt = nrOfPlayers.findElements(By.tagName("li")).size();
        Assertions.assertEquals( nrOfPlayersInt, 2);

    }

    @Test
    public void playerNameIsDisplayedTest(){

        WebElement playerName = webDriver.findElement(By.tagName("li"));
        Assertions.assertTrue(playerName.isDisplayed());

    }

    @Test
    public void correctTitleTest(){

        String title = webDriver.getTitle();
        Assertions.assertEquals(title, "Players List");
    }

    @Test
    public void correctButtonTextTest(){


        WebElement buttonText = webDriver.findElement(By.tagName("button"));

        Assertions.assertEquals(buttonText.getText(),"Logga in");
    }


}
