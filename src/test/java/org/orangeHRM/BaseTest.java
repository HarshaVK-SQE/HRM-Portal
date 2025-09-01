package org.orangeHRM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.util.Properties;

public class BaseTest extends BasePage{

    protected BasePage basePage;
    protected LoginPage loginPage;
    protected HomePage homePage;
    protected PimPage pimPage;
    protected AddEmployeePage addEmployeePage;
    protected SearchEmpPage searchEmpPage;
    protected EmployeeDetailsPage employeeDetailsPage;

    Properties properties = new Properties();

    protected WebDriver driver;
    protected String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

    @BeforeClass (groups = "search")
    public void setUpEnv() throws Exception{

        basePage = new BasePage();
        loginPage = new LoginPage();
        homePage = new HomePage();
        pimPage = new PimPage();
        addEmployeePage = new AddEmployeePage();
        searchEmpPage = new SearchEmpPage();
        employeeDetailsPage = new EmployeeDetailsPage();
        FileInputStream ips = new FileInputStream("C://Users//Harsha Vardhan//IdeaProjects//OrangeHRM_Job//src//config.properties");

        properties.load(ips);


        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        setDriver(driver);

    }

   @AfterClass
   public void tearDown() throws Exception{

       quitDriver(5000);

   }

    @DataProvider (name="userDetails")
    public Object[][] getUserDetails(){
        return new Object[][]
                {
                        {"Admin","admin123"},
                };
    }

}
