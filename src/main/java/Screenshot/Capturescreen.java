package Screenshot;

import Browser.browser;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;

public class Capturescreen extends browser
{
    public static void screenShot(int i )throws Exception
    {
        try
        {
            TakesScreenshot scrShot = ((TakesScreenshot)driver);
            File Src= scrShot.getScreenshotAs(OutputType.FILE);
            String filePath = System.getProperty("user.dir")+"//target//screenshot//screenshot"+i+".png";
            File des = new File(filePath);
            FileUtils.copyFile(Src,des);
            System.out.println("Printscreen");
        }
        catch(Exception e)
        {

        }
    }

}
