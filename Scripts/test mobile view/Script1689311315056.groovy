import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.maybank2u.com.my/home/m2u/common/login.do')

WebUI.setViewPortSize(390, 844)

WebUI.click(findTestObject('Object Repository/Page_Maybank2u/header_icon'))

WebUI.scrollToElement(findTestObject('Page_Maybank2u/span_MALAYSIA'), 0)

WebUI.click(findTestObject('Page_Maybank2u/span_MALAYSIA'))

WebUI.click(findTestObject('Object Repository/Page_Maybank2u/img'))

WebUI.switchToWindowTitle('Maybank2u | Maybank Malaysia')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Maybank2u/banner'), 0)

WebUI.closeBrowser()

