package JavaClasses.day_55_abstraction.interface_demo;

public interface WebDriver {
    public abstract void get(String url);

    public abstract void findElement(String locator);

    void quit();                          //its automatically <public abstract>

    String getTitle();

}

