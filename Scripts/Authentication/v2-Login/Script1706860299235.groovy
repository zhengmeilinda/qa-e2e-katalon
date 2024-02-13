import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.exception.StepFailedException as StepFailedException
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

WebUI.openBrowser(GlobalVariable.v2_staging2)

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('Object Repository/Relative XPath/elementById',[('element'):'username']), 15)

WebUI.verifyElementPresent(findTestObject('Object Repository/Relative XPath/elementById',[('element'):'password']), 15)

WebUI.setText(findTestObject('Object Repository/Relative XPath/elementById',[('element'):'username']), "m.zheng+stg2@sleekflow.io")

WebUI.setText(findTestObject('Object Repository/Relative XPath/elementById',[('element'):'password']), "NRSrh4z4tud5af4")

WebUI.verifyElementPresent(findTestObject('Object Repository/Relative XPath/elementButtonByTextIndex',[('element'):'Sign in',('index'):1]), 15)

WebUI.click(findTestObject('Object Repository/Relative XPath/elementButtonByTextIndex',[('element'):'Sign in',('index'):1]))

//Verify that user has been logged in successfully
WebUI.verifyElementPresent(findTestObject('Object Repository/Relative XPath/elementByText',[('element'):"meilindaa staging2"]), 15)

