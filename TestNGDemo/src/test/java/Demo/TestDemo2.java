package Demo;

import org.testng.annotations.Test;

public class TestDemo2 {
    @Test(priority = 1)
    public void register(){
        System.out.println("user can register here....!");
    }
    @Test(priority = 2,invocationCount = 3)
    public void login(){
        System.out.println("user can login here...!");
    }
    @Test(priority = 3,description = "search test")
    public void search(){
        System.out.println("user can search product Here....!");
    }
    @Test(priority = 4,enabled = false)
    public void AddToCart(){
        System.out.println("user can add their fav product to cart...!");
        System.out.println();
    }
}
