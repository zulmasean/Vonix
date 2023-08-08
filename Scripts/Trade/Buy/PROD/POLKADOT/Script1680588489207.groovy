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

WebUI.comment('POLKADOT COIN')

WebUI.comment('BUY STEP 1')

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_Polkadot'))

WebUI.setText(findTestObject('Trade/Page_Vonix (development)/input'), '0.65')

WebUI.click(findTestObject('Trade/Page_Vonix (development)/div_Top Up_p-checkbox-box'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_BUY'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Confirm to Buy'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Make another transaction'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_Polkadot'))

WebUI.setText(findTestObject('Trade/Page_Vonix (development)/input'), '0.66')

WebUI.click(findTestObject('Trade/Page_Vonix (development)/div_Top Up_p-checkbox-box'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_BUY'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Confirm to Buy'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Make another transaction'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_Polkadot'))

WebUI.setText(findTestObject('Trade/Page_Vonix (development)/input'), '0.67')

WebUI.click(findTestObject('Trade/Page_Vonix (development)/div_Top Up_p-checkbox-box'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_BUY'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Confirm to Buy'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Make another transaction'))

WebUI.comment('SELL STEP 1')

WebUI.delay(5)

WebUI.refresh()

WebUI.scrollToPosition(0, 100)

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/span_SELL'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/img'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_Polkadot'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/button_(selected 0)_slider-stop-whole'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/div_(selected 100)_p-checkbox-box'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/button_SELL'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/button_Confirm to Sell'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Make another transaction'))

WebUI.comment('BUY STEP 2')

WebUI.scrollToPosition(0, 100)

WebUI.click(findTestObject('Trade/Page_Vonix (development)/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_Polkadot'))

WebUI.setText(findTestObject('Trade/Page_Vonix (development)/input'), '0.68')

WebUI.click(findTestObject('Trade/Page_Vonix (development)/div_Top Up_p-checkbox-box'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_BUY'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Confirm to Buy'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Make another transaction'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_Polkadot'))

WebUI.setText(findTestObject('Trade/Page_Vonix (development)/input'), '0.69')

WebUI.click(findTestObject('Trade/Page_Vonix (development)/div_Top Up_p-checkbox-box'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_BUY'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Confirm to Buy'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Make another transaction'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_Polkadot'))

WebUI.setText(findTestObject('Trade/Page_Vonix (development)/input'), '0.65')

WebUI.click(findTestObject('Trade/Page_Vonix (development)/div_Top Up_p-checkbox-box'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_BUY'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Confirm to Buy'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Make another transaction'))

WebUI.comment('SELL STEP 2')

WebUI.delay(5)

WebUI.refresh()

WebUI.scrollToPosition(0, 100)

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/span_SELL'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/img'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_Polkadot'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Top Up_slider-stop-half'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/div_(selected 100)_p-checkbox-box'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/button_SELL'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/button_Confirm to Sell'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Make another transaction'))

WebUI.comment('BUY STEP 3')

WebUI.scrollToPosition(0, 100)

WebUI.click(findTestObject('Trade/Page_Vonix (development)/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_Polkadot'))

WebUI.setText(findTestObject('Trade/Page_Vonix (development)/input'), '0.65')

WebUI.click(findTestObject('Trade/Page_Vonix (development)/div_Top Up_p-checkbox-box'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_BUY'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Confirm to Buy'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Make another transaction'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_Polkadot'))

WebUI.setText(findTestObject('Trade/Page_Vonix (development)/input'), '0.65')

WebUI.click(findTestObject('Trade/Page_Vonix (development)/div_Top Up_p-checkbox-box'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_BUY'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Confirm to Buy'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Make another transaction'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_Polkadot'))

WebUI.setText(findTestObject('Trade/Page_Vonix (development)/input'), '0.65')

WebUI.click(findTestObject('Trade/Page_Vonix (development)/div_Top Up_p-checkbox-box'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_BUY'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Confirm to Buy'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Make another transaction'))

WebUI.comment('SELL STEP 3')

WebUI.delay(5)

WebUI.refresh()

WebUI.scrollToPosition(0, 100)

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/span_SELL'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/img'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_Polkadot'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/button_(selected 0)_slider-stop-whole'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/div_(selected 100)_p-checkbox-box'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/button_SELL'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/button_Confirm to Sell'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Make another transaction'))

