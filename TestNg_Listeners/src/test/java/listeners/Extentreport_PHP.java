package listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extentreport_PHP {
    
    
static ExtentReports extent;
 

    public static ExtentReports CreateTest()
    
    {
    
        ExtentSparkReporter reporter = new ExtentSparkReporter("./ExtentReport.html");
        
        reporter.config().setReportName("PHP_Travels");
        
        reporter.config().setDocumentTitle("To Save the timesheet");
        
        extent = new ExtentReports();


        extent.attachReporter(reporter);
        
        extent.setSystemInfo("Test Engineer", "Vigneshwar K");
        
        return extent;
        

 

}
}





	

