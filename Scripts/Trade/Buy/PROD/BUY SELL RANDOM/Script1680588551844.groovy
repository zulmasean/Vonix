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

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/VX_Login/Page_Vonix (development)/button_Login'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/p_Trade'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/a_Easy Trade'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/p_Select Coin'))

WebUI.delay(2)

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

WebUI.comment('SOLANA COIN')

WebUI.comment('BUY STEP 1')

WebUI.scrollToPosition(0, 100)

WebUI.click(findTestObject('Trade/Page_Vonix (development)/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_Solana'))

WebUI.setText(findTestObject('Trade/Page_Vonix (development)/input'), '0.3')

WebUI.click(findTestObject('Trade/Page_Vonix (development)/div_Top Up_p-checkbox-box'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_BUY'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Confirm to Buy'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Make another transaction'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_Solana'))

WebUI.setText(findTestObject('Trade/Page_Vonix (development)/input'), '0.31')

WebUI.click(findTestObject('Trade/Page_Vonix (development)/div_Top Up_p-checkbox-box'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_BUY'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Confirm to Buy'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Make another transaction'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_Solana'))

WebUI.setText(findTestObject('Trade/Page_Vonix (development)/input'), '0.33')

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

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_Solana'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/button_(selected 0)_slider-stop-whole'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/div_(selected 100)_p-checkbox-box'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/button_SELL'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/button_Confirm to Sell'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Make another transaction'))

WebUI.comment('BUY STEP 2')

WebUI.scrollToPosition(0, 100)

WebUI.click(findTestObject('Trade/Page_Vonix (development)/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_Solana'))

WebUI.setText(findTestObject('Trade/Page_Vonix (development)/input'), '0.36')

WebUI.click(findTestObject('Trade/Page_Vonix (development)/div_Top Up_p-checkbox-box'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_BUY'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Confirm to Buy'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Make another transaction'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_Solana'))

WebUI.setText(findTestObject('Trade/Page_Vonix (development)/input'), '0.37')

WebUI.click(findTestObject('Trade/Page_Vonix (development)/div_Top Up_p-checkbox-box'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_BUY'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Confirm to Buy'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Make another transaction'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_Solana'))

WebUI.setText(findTestObject('Trade/Page_Vonix (development)/input'), '0.38')

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

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_Solana'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Top Up_slider-stop-half'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/div_(selected 100)_p-checkbox-box'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/button_SELL'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/button_Confirm to Sell'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Make another transaction'))

WebUI.comment('BUY STEP 3')

WebUI.scrollToPosition(0, 100)

WebUI.click(findTestObject('Trade/Page_Vonix (development)/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_Solana'))

WebUI.setText(findTestObject('Trade/Page_Vonix (development)/input'), '0.39')

WebUI.click(findTestObject('Trade/Page_Vonix (development)/div_Top Up_p-checkbox-box'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_BUY'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Confirm to Buy'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Make another transaction'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_Solana'))

WebUI.setText(findTestObject('Trade/Page_Vonix (development)/input'), '0.36')

WebUI.click(findTestObject('Trade/Page_Vonix (development)/div_Top Up_p-checkbox-box'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_BUY'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Confirm to Buy'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Make another transaction'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_Solana'))

WebUI.setText(findTestObject('Trade/Page_Vonix (development)/input'), '0.40')

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

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_Solana'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/button_(selected 0)_slider-stop-whole'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/div_(selected 100)_p-checkbox-box'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/button_SELL'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/button_Confirm to Sell'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Make another transaction'))

WebUI.comment('POLYGON COIN')

WebUI.comment('BUY STEP 1')

WebUI.scrollToPosition(0, 100)

WebUI.click(findTestObject('Trade/Page_Vonix (development)/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_Polygon'))

WebUI.setText(findTestObject('Trade/Page_Vonix (development)/input'), '1.108')

WebUI.click(findTestObject('Trade/Page_Vonix (development)/div_Top Up_p-checkbox-box'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_BUY'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Confirm to Buy'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Make another transaction'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_Polygon'))

WebUI.setText(findTestObject('Trade/Page_Vonix (development)/input'), '1.108')

WebUI.click(findTestObject('Trade/Page_Vonix (development)/div_Top Up_p-checkbox-box'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_BUY'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Confirm to Buy'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Make another transaction'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_Polygon'))

WebUI.setText(findTestObject('Trade/Page_Vonix (development)/input'), '1.108')

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

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_Polygon'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/button_(selected 0)_slider-stop-whole'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/div_(selected 100)_p-checkbox-box'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/button_SELL'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/button_Confirm to Sell'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Make another transaction'))

WebUI.comment('BUY STEP 2')

WebUI.scrollToPosition(0, 100)

WebUI.click(findTestObject('Trade/Page_Vonix (development)/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_Polygon'))

WebUI.setText(findTestObject('Trade/Page_Vonix (development)/input'), '1.108')

WebUI.click(findTestObject('Trade/Page_Vonix (development)/div_Top Up_p-checkbox-box'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_BUY'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Confirm to Buy'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Make another transaction'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_Polygon'))

WebUI.setText(findTestObject('Trade/Page_Vonix (development)/input'), '1.108')

WebUI.click(findTestObject('Trade/Page_Vonix (development)/div_Top Up_p-checkbox-box'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_BUY'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Confirm to Buy'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Make another transaction'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_Polygon'))

WebUI.setText(findTestObject('Trade/Page_Vonix (development)/input'), '1.108')

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

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_Polygon'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Top Up_slider-stop-half'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/div_(selected 100)_p-checkbox-box'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/button_SELL'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/button_Confirm to Sell'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Make another transaction'))

WebUI.comment('BUY STEP 3')

WebUI.scrollToPosition(0, 100)

WebUI.click(findTestObject('Trade/Page_Vonix (development)/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_Polygon'))

WebUI.setText(findTestObject('Trade/Page_Vonix (development)/input'), '1.108')

WebUI.click(findTestObject('Trade/Page_Vonix (development)/div_Top Up_p-checkbox-box'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_BUY'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Confirm to Buy'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Make another transaction'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_Polygon'))

WebUI.setText(findTestObject('Trade/Page_Vonix (development)/input'), '1.108')

WebUI.click(findTestObject('Trade/Page_Vonix (development)/div_Top Up_p-checkbox-box'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_BUY'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Confirm to Buy'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Make another transaction'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_Polygon'))

WebUI.setText(findTestObject('Trade/Page_Vonix (development)/input'), '1.108')

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

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_Polygon'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/button_(selected 0)_slider-stop-whole'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/div_(selected 100)_p-checkbox-box'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/button_SELL'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/button_Confirm to Sell'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Make another transaction'))

WebUI.comment('XRP COIN')

WebUI.comment('BUY STEP 1')

WebUI.scrollToPosition(0, 100)

WebUI.click(findTestObject('Trade/Page_Vonix (development)/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_XRP'))

WebUI.setText(findTestObject('Trade/Page_Vonix (development)/input'), '0.5')

WebUI.click(findTestObject('Trade/Page_Vonix (development)/div_Top Up_p-checkbox-box'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_BUY'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Confirm to Buy'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Make another transaction'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_XRP'))

WebUI.setText(findTestObject('Trade/Page_Vonix (development)/input'), '0.5')

WebUI.click(findTestObject('Trade/Page_Vonix (development)/div_Top Up_p-checkbox-box'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_BUY'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Confirm to Buy'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Make another transaction'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_XRP'))

WebUI.setText(findTestObject('Trade/Page_Vonix (development)/input'), '0.5')

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

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_XRP'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/button_(selected 0)_slider-stop-whole'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/div_(selected 100)_p-checkbox-box'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/button_SELL'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/button_Confirm to Sell'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Make another transaction'))

WebUI.comment('BUY STEP 2')

WebUI.scrollToPosition(0, 100)

WebUI.click(findTestObject('Trade/Page_Vonix (development)/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_XRP'))

WebUI.setText(findTestObject('Trade/Page_Vonix (development)/input'), '0.5')

WebUI.click(findTestObject('Trade/Page_Vonix (development)/div_Top Up_p-checkbox-box'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_BUY'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Confirm to Buy'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Make another transaction'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_XRP'))

WebUI.setText(findTestObject('Trade/Page_Vonix (development)/input'), '0.5')

WebUI.click(findTestObject('Trade/Page_Vonix (development)/div_Top Up_p-checkbox-box'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_BUY'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Confirm to Buy'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Make another transaction'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_XRP'))

WebUI.setText(findTestObject('Trade/Page_Vonix (development)/input'), '0.5')

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

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_XRP'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Top Up_slider-stop-half'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/div_(selected 100)_p-checkbox-box'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/button_SELL'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/button_Confirm to Sell'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Make another transaction'))

WebUI.comment('BUY STEP 3')

WebUI.scrollToPosition(0, 100)

WebUI.click(findTestObject('Trade/Page_Vonix (development)/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_XRP'))

WebUI.setText(findTestObject('Trade/Page_Vonix (development)/input'), '0.5')

WebUI.click(findTestObject('Trade/Page_Vonix (development)/div_Top Up_p-checkbox-box'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_BUY'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Confirm to Buy'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Make another transaction'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_XRP'))

WebUI.setText(findTestObject('Trade/Page_Vonix (development)/input'), '0.5')

WebUI.click(findTestObject('Trade/Page_Vonix (development)/div_Top Up_p-checkbox-box'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_BUY'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Confirm to Buy'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Make another transaction'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_XRP'))

WebUI.setText(findTestObject('Trade/Page_Vonix (development)/input'), '0.5')

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

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_XRP'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/button_(selected 0)_slider-stop-whole'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/div_(selected 100)_p-checkbox-box'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/button_SELL'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/button_Confirm to Sell'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Make another transaction'))

WebUI.comment('THE GRAPH')

WebUI.comment('BUY STEP 1')

WebUI.scrollToPosition(0, 100)

WebUI.click(findTestObject('Trade/Page_Vonix (development)/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_The Graph'))

WebUI.setText(findTestObject('Trade/Page_Vonix (development)/input'), '0.2')

WebUI.click(findTestObject('Trade/Page_Vonix (development)/div_Top Up_p-checkbox-box'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_BUY'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Confirm to Buy'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Make another transaction'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_The Graph'))

WebUI.setText(findTestObject('Trade/Page_Vonix (development)/input'), '0.2')

WebUI.click(findTestObject('Trade/Page_Vonix (development)/div_Top Up_p-checkbox-box'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_BUY'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Confirm to Buy'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Make another transaction'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_The Graph'))

WebUI.setText(findTestObject('Trade/Page_Vonix (development)/input'), '0.2')

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

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_The Graph'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/button_(selected 0)_slider-stop-whole'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/div_(selected 100)_p-checkbox-box'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/button_SELL'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/button_Confirm to Sell'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Make another transaction'))

WebUI.comment('BUY STEP 2')

WebUI.scrollToPosition(0, 100)

WebUI.click(findTestObject('Trade/Page_Vonix (development)/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_The Graph'))

WebUI.setText(findTestObject('Trade/Page_Vonix (development)/input'), '0.2')

WebUI.click(findTestObject('Trade/Page_Vonix (development)/div_Top Up_p-checkbox-box'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_BUY'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Confirm to Buy'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Make another transaction'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_The Graph'))

WebUI.setText(findTestObject('Trade/Page_Vonix (development)/input'), '0.2')

WebUI.click(findTestObject('Trade/Page_Vonix (development)/div_Top Up_p-checkbox-box'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_BUY'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Confirm to Buy'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Make another transaction'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_The Graph'))

WebUI.setText(findTestObject('Trade/Page_Vonix (development)/input'), '0.2')

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

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_The Graph'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Top Up_slider-stop-half'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/div_(selected 100)_p-checkbox-box'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/button_SELL'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/button_Confirm to Sell'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Make another transaction'))

WebUI.comment('BUY STEP 3')

WebUI.scrollToPosition(0, 100)

WebUI.click(findTestObject('Trade/Page_Vonix (development)/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_The Graph'))

WebUI.setText(findTestObject('Trade/Page_Vonix (development)/input'), '0.2')

WebUI.click(findTestObject('Trade/Page_Vonix (development)/div_Top Up_p-checkbox-box'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_BUY'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Confirm to Buy'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Make another transaction'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_The Graph'))

WebUI.setText(findTestObject('Trade/Page_Vonix (development)/input'), '0.2')

WebUI.click(findTestObject('Trade/Page_Vonix (development)/div_Top Up_p-checkbox-box'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_BUY'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Confirm to Buy'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Make another transaction'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_The Graph'))

WebUI.setText(findTestObject('Trade/Page_Vonix (development)/input'), '0.2')

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

WebUI.click(findTestObject('Trade/Page_Vonix (development)/span_The Graph'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/button_(selected 0)_slider-stop-whole'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/div_(selected 100)_p-checkbox-box'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/button_SELL'))

WebUI.click(findTestObject('Trade/Sell/Page_Vonix (development)/button_Confirm to Sell'))

WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Make another transaction'))

