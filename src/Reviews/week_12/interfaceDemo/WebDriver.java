package week_12.interfaceDemo;

public interface WebDriver {

    //these are all abstract methods with no Return or with return
    public abstract void get (String url);
    void findElement(String locator);
    void quite();
    String getTitle();




}
