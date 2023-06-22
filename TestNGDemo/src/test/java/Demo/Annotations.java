package Demo;

import org.testng.annotations.*;

import java.sql.SQLOutput;

public class Annotations {
    @Test
    public void login(){
        System.out.println("user can login.");
    }
    @Test
    public void logout(){
        System.out.println("user can logout");
    }
    @BeforeMethod
    public void EveryMethod(){
        System.out.println("Before every method");
    }
    @AfterMethod
    public void AMethod(){
        System.out.println("After every method");
    }
    @BeforeClass
    public void cClass(){
        System.out.println("Before a class");
    }
    @AfterClass
    public void Dclass(){
        System.out.println("After a Class");
    }
    @BeforeTest
    public void Testa(){
        System.out.println("Before every Test");
    }
    @AfterTest
    public void TestB(){
        System.out.println("After every Test");
    }
    @BeforeSuite
    public void suitea(){
        System.out.println("Before a suite");
    }
    @AfterSuite
    public void Suitb(){
        System.out.println("After a suite");
    }

}
