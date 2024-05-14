package demo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestCases {
    ChromeDriver driver;
    public TestCases()
    {
        System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void endTest()
    {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }

    
    public  void testCase01(){
        System.out.println("Start Test case: testCase01");
        driver.get("https://docs.google.com/forms/d/e/1FAIpQLSep9LTMntH5YqIXa5nkiPKSs283kdwitBBhXWyZdAS-e4CxBQ/viewform");
        System.out.println("end Test case: testCase01");
    }
    public  void testCase02() throws InterruptedException{
        System.out.println("Start Test case: testCase02");
        WebElement name = driver.findElement(By.xpath("(//input[@jsname='YPqjbf'])[1]"));
        Thread.sleep(3000);
        name.sendKeys("Jishnu K");
        System.out.println("End Test case: testCase02");

    }
    public  void testCase03() throws InterruptedException{
        System.out.println("Start Test case: testCase03");
    
    WebElement AnswerElement = driver.findElement(By.xpath("(//textarea[@aria-label='Your answer'])[1]"));
Thread.sleep(2000);
long epoch = System.currentTimeMillis()/1000; 
String epochstring =String.valueOf(epoch);
String answer ="I want to be the best QA Engineer!";  
String combined = answer+ "" +  epochstring;
Thread.sleep(2000);

AnswerElement.sendKeys(combined);
System.out.println(combined);
    System.out.println("End Test case: testCase03");
    }
    public  void testCase04() throws InterruptedException{
        System.out.println("Start Test case: testCase04");
        WebElement experience = driver.findElement(By.xpath("(//div[@class = 'AB7Lab Id5V1'])[1]"));
        Thread.sleep(3000);
        experience.click();
        
       

        System.out.println(" EndTest case: testCase04");


    }
    public  void testCase05() throws InterruptedException{
        System.out.println("Start Test case: testCase05");
        
        WebElement javaSelect = driver.findElement(By.xpath("(//div[@class='uHMk6b fsHoPb'])[1]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", javaSelect);
        if (!javaSelect.isSelected())
        Thread.sleep(3000);
        javaSelect.click();

        WebElement seleniumselect = driver.findElement(By.xpath("(//div[@class='uHMk6b fsHoPb'])[2]"));
        if (!seleniumselect.isSelected()) {
            Thread.sleep(3000);
            seleniumselect.click();    
        }
        WebElement Testngselect = driver.findElement(By.xpath("(//div[@class='uHMk6b fsHoPb'])[4]"));
        if (!Testngselect.isSelected()) {
            Thread.sleep(3000);
            Testngselect.click();    
        
    }
    System.out.println("End Test case: testCase05");
}
public  void testCase06() throws InterruptedException{
    System.out.println("Start Test case: testCase06");
    WebElement dropdown = driver.findElement(By.xpath("//div[@class='e2CuFe eU809d']"));
    Thread.sleep(3000);
    dropdown.click();
    List<WebElement> mrElements = driver.findElements(By.xpath("//div[@jsname='wQNmvb']"));
    Thread.sleep(3000);
for(WebElement mr:mrElements){
    Thread.sleep(3000);
    System.out.println("List"+mr.getText());
    if(mr.getText().contains("Mr")){
       Thread.sleep(3000);
        mr.click();
    }

}

   System.out.println("End Test case: testCase06");
}

public  void testCase07() throws InterruptedException{
    System.out.println("Start Test case: testCase07");
    LocalDate currDate = LocalDate.now();
    LocalDate DateMinusSevenDays = currDate.minusDays(7);

    DateTimeFormatter datechange = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    String formattedDate = DateMinusSevenDays.format(datechange);
    WebElement Date = driver.findElement(By.xpath("(//input[@type='date'])[1]"));
    Thread.sleep(3000);
    Date.sendKeys(formattedDate);
    Thread.sleep(3000);
    System.out.println("End Test case: testCase07");

}
public  void testCase08() throws InterruptedException{
    System.out.println("Start Test case: testCase08");
    LocalDateTime currTime = LocalDateTime.now();
    int currentHour = currTime.getHour(); 
    int currentMinute = currTime.getMinute();
    String formatehour = String.format("%02d", currentHour); 
            String formatmin = String.format("%02d", currentMinute);
    WebElement hour = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
    Thread.sleep(3000);
    hour.sendKeys(formatehour);
    WebElement Minute = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
    Thread.sleep(3000);
    Minute.sendKeys(formatmin);
    System.out.println("End Test case: testCase08");
    

}
public  void testCase09() throws InterruptedException{
    System.out.println("Start Test case: testCase09");
    WebElement submit = driver.findElement(By.xpath("(//span[@class='NPEfkd RveJvd snByac'])[1]"));
    submit.click();
    System.out.println("End Test case: testCase09");

}
public  void testCase10() throws InterruptedException{
    System.out.println("Start Test case: testCase10");
    WebElement successmsg = driver.findElement(By.xpath("//div[@class='RH5hzf RLS9Fe']"));
    Thread.sleep(3000);
successmsg.getText();
Thread.sleep(5000);
System.out.println("End Test case: testCase10");

}
}


