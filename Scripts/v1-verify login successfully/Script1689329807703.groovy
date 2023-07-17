import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('reusable function/launch application'), [('baseUrl') : 'https://sso-staging.sleekflow.io/u/login?state=hKFo2SBLcEU5YmhFa003M3J1eFJwZmxvUmtPRGlyNDhPVFdyaKFur3VuaXZlcnNhbC1sb2dpbqN0aWTZIFhXSkN4Y1VJeWJmUXY5djk2WW5vb2s4bTBpZ0ZrQWNJo2NpZNkgMm1MbDI5TG5Jdk9KUE5mbWFocE44OTJ0REtSeVJTZVk&ui_locales=en-US'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('reusable function/login'), [('username') : 'j.llk@sleekflow.io', ('password') : 'Hihi12345.'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('sleekflow_v1/Page_Log in  sleekflow-client-web-app/top_nav'), 0)

WebUI.callTestCase(findTestCase('reusable function/tear down'), [:], FailureHandling.STOP_ON_FAILURE)

