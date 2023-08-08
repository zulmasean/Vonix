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

WebUI.navigateToUrl('https://dev.vonix.id/kyc-process')

WebUI.click(findTestObject('Auth/EKYC/button_Continue on this web browser'))

WebUI.click(findTestObject('Auth/EKYC/button_Continue'))

WebUI.click(findTestObject('Auth/EKYC/button_Continue'))

WebUI.click(findTestObject('Auth/EKYC/button_Start Camera'))

WebUI.delay(5)

WebUI.click(findTestObject('Auth/EKYC/button_Capture'))

WebUI.click(findTestObject('Auth/EKYC/button_Retake'))

WebUI.click(findTestObject('Auth/EKYC/button_Capture'))

WebUI.click(findTestObject('Auth/EKYC/button_Retake'))

WebUI.click(findTestObject('Auth/EKYC/button_Capture'))

WebUI.click(findTestObject('Auth/EKYC/span_Upload'))

WebUI.delay(5)

WebUI.click(findTestObject('Auth/EKYC/button_Continue'))

WebUI.delay(5)

WebUI.click(findTestObject('Auth/EKYC/div_Record Personal Statement (24)_p-checkbox-box'))

WebUI.click(findTestObject('Auth/EKYC/button_Continue'))

WebUI.click(findTestObject('Auth/EKYC/button_Start Recording'))

WebUI.delay(5)

WebUI.click(findTestObject('Auth/EKYC/button_Stop Recording'))

WebUI.delay(5)

WebUI.click(findTestObject('Auth/EKYC/button_Continue_Recording'))

WebUI.click(findTestObject('Auth/EKYC/div_Occupation Information_p-checkbox-box'))

WebUI.click(findTestObject('Auth/EKYC/button_Continue'))

WebUI.setText(findTestObject('Auth/KYC/input_Address_vx-input'), 'Jalan')

WebUI.click(findTestObject('Auth/KYC/span_Select country'))

WebUI.setText(findTestObject('Auth/KYC/input__p-dropdown-filter p-inputtext p-component'), 'Indonesia')

WebUI.click(findTestObject('Auth/EKYC/div_Indonesia'))

WebUI.click(findTestObject('Auth/KYC/span_Select ProvinceState'))

WebUI.click(findTestObject('Auth/KYC/div_Aceh'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Auth/KYC/span_Select City'))

WebUI.click(findTestObject('Auth/KYC/div_Aceh Besar Regency'))

WebUI.click(findTestObject('Auth/KYC/div_Select Bank'))

WebUI.click(findTestObject('Auth/KYC/div_Anglomas International Bank'))

WebUI.setText(findTestObject('Auth/KYC/input_Bank Account Number_vx-input'), '1234556888')

WebUI.setText(findTestObject('Auth/KYC/input_Bank Account Holder_vx-input'), 'Zulma')

WebUI.setText(findTestObject('Auth/KYC/input_concat(Mother, , s Maiden Name)_vx-input'), 'Mamae')

WebUI.selectOptionByLabel(findTestObject('Auth/KYC/select_Select Income Source'), 'Parents', false)

WebUI.selectOptionByLabel(findTestObject('Auth/KYC/select_Select Transaction'), 'Life Necessities', false)

WebUI.selectOptionByLabel(findTestObject('Auth/KYC/select_Select Estimated Income'), '<= Rp 15 million', false)

WebUI.delay(3)

WebUI.click(findTestObject('Auth/KYC/button_Continue_Final'))

