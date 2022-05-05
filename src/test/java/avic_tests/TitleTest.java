package avic_tests;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TitleTest extends BaseTest{

    private final String title = "AVIC™ - удобный интернет-магазин бытовой техники и электроники в Украине. | Avic";

    @Test
    public void checkTitle(){
        Assert.assertEquals(getHomePage().getTitle(), title);
    }
}
