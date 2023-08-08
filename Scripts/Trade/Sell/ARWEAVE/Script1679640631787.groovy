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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://dev.vonix.id/login')

WebUI.setText(findTestObject('Object Repository/VX_Login/Page_Vonix (development)/input_Email_email'), 'basis@btcmod.com')

WebUI.setEncryptedText(findTestObject('Object Repository/VX_Login/Page_Vonix (development)/input_Password_password'), 'XmUHGyNsHMcN81HiJ04wCA==')

WebUI.click(findTestObject('Object Repository/VX_Login/Page_Vonix (development)/div_Forgot password_p-checkbox-box'))

WebUI.click(findTestObject('Object Repository/VX_Login/Page_Vonix (development)/button_Login'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/p_Trade'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/a_Easy Trade'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/span_SELL'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/div_BitcoinBTC  USDT'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_Arweave'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/button_(selected 0)_slider-stop-whole'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/div_(selected 100)_p-checkbox-box'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/button_SELL'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/button_Confirm to Sell'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/button_Transaction History'))

WebUI.closeBrowser()

