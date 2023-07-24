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

WebUI.openBrowser(GlobalVariable.v1_url)

WebUI.verifyElementPresent(findTestObject('Object Repository/Relative XPath/elementById',[('element'):'username']), 15)

WebUI.verifyElementPresent(findTestObject('Object Repository/Relative XPath/elementById',[('element'):'password']), 15)

WebUI.setText(findTestObject('Object Repository/Relative XPath/elementById',[('element'):'username']), email)

WebUI.setText(findTestObject('Object Repository/Relative XPath/elementById',[('element'):'password']), password)

WebUI.click(findTestObject('Object Repository/Relative XPath/elementButtonByTextIndex',[('element'):'Sign in',('index'):2]))

switch(test_type) {
	case 'positive':
		successLogin()
	break
	case 'negative':
		failedLogin()
	break
}

def successLogin() {
	WebUI.verifyElementPresent(findTestObject('Object Repository/Relative XPath/elementByLabelText',[('element'):"Meilinda Admin 2"]), 15)
}

def failedLogin() {
	WebUI.verifyElementPresent(findTestObject('Object Repository/Relative XPath/elementSpanById',[('element'):"error-element-password"]), 15)
	
}


