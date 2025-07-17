package org.orangeHRM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest extends BasePage{

    protected BasePage basePage;
    protected LoginPage loginPage;
    protected HomePage homePage;
    protected PimPage pimPage;
    protected AddEmployeePage addEmployeePage;
    protected SearchEmpPage searchEmpPage;
    protected EmployeeDetailsPage employeeDetailsPage;

    protected WebDriver driver;
    protected String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

    @BeforeClass (groups = "search")
    public void setUpEnv(){

        basePage = new BasePage();
        loginPage = new LoginPage();
        homePage = new HomePage();
        pimPage = new PimPage();
        addEmployeePage = new AddEmployeePage();
        searchEmpPage = new SearchEmpPage();
        employeeDetailsPage = new EmployeeDetailsPage();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        setDriver(driver);

    }

//    @AfterClass
//    public void tearDown() throws Exception{
//
//        quitDriver(5000);
//
//    }

}
