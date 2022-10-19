package utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

    @Override
    public void onStart(ITestContext argument){
        System.out.println("onStart Tum testlerden once 1 kere calisir ==> "+argument.getName());

    }
    @Override
    public void onFinish(ITestContext argument){
        System.out.println("tum testlerden sonra bir sefer calisir ==> "+argument.getName());

    }
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("onTestStart her bir testten once bir kere calisir ==> " + result.getName());

    }


    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess - PASS olan Method sayisi kadar, ve PASS edilen methodlardan SONRA bir kez calisir => "+result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped skipp edilen methodlardan sonra bir kere calisir ==> " + result.getName());

    }
    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure - Failed edilen Method sayisi kadar, ve Failed edilen methodlardan SONRA bir kez calisir => "+result.getName());
    }


    }
