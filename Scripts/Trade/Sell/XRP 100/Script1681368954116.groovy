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

WebUI.delay(5)

WebUI.refresh()

WebUI.scrollToPosition(0, 100)

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/span_SELL'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/img'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_XRP'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/button_(selected 0)_slider-stop-whole'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/div_(selected 100)_p-checkbox-box'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/button_SELL'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/button_Confirm to Sell'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Make another transaction'))

