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

WebUI.setText(findTestObject('Object Repository/Relative XPath/elementById',[('element'):"username"]), "m.zheng+admin2@sleekflow.io")

WebUI.setText(findTestObject('Object Repository/Relative XPath/elementById',[('element'):'password']), "NRSrh4z4tud5af4")

WebUI.click(findTestObject('Object Repository/Relative XPath/elementButtonByTextIndex',[('element'):'Sign in',('index'):2]))

WebUI.delay(300)

WebUI.click(findTestObject('Object Repository/Relative XPath/elementByDivText',[('element'):"Contacts"]))

WebUI.click(findTestObject('Object Repository/Relative XPath/elementBySpanText',[('element'):"Contacts"]))

WebUI.setText(findTestObject('Object Repository/Relative XPath/elementByPlaceholder',[('element'):"Search name, number, or email"]), "Meilinda Zheng")

WebUI.click(findTestObject('Object Repository/Relative XPath/elementButtonByTextIndex',[('element'):"Search",('index'):1]))

WebUI.verifyElementPresent(findTestObject('Object Repository/Relative XPath/elementByClassText',[('class'):"field-major",('text'):"Meilinda Zheng"]), 15)












