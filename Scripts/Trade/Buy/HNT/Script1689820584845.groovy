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


WebUI.scrollToPosition(0, 100)

	def maxRetriess = 10

	for (int i = 1; i <= maxRetriess; i++) {
		try {
			WebUI.click(findTestObject('Trade/Page_Vonix (development)/img'))

			break
		}
		catch (Exception e) {
			Thread.sleep(1000)

			WebUI.refresh()
		}
	}
	
	WebUI.delay(2)

	def maxRetries = 10

	for (int i = 1; i <= maxRetries; i++) {
		try {
			WebUI.click(findTestObject('Trade/Page_Vonix/span_HNT'))

			break
		}
		catch (Exception e) {
			Thread.sleep(1000)

			WebUI.refresh()

			WebUI.click(findTestObject('Trade/Page_Vonix (development)/img'))
		}
	}
	WebUI.setText(findTestObject('Trade/Page_Vonix (development)/input'), input_HNT)
					
	WebUI.click(findTestObject('Trade/Page_Vonix (development)/div_Top Up_p-checkbox-box'))
					
	WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_BUY'))
					
	WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Confirm to Buy'))
					
	WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Make another transaction'), FailureHandling.CONTINUE_ON_FAILURE)

//def skipTestCase = NULL
//def inputCondisi = input_HNT
//
//if (inputCondisi != inputCondisi) {
//	
//	WebUI.scrollToPosition(0, 100)
//	
//		def maxRetriess = 10
//	
//		for (int i = 1; i <= maxRetriess; i++) {
//			try {
//				WebUI.click(findTestObject('Trade/Page_Vonix (development)/img'))
//	
//				break
//			}
//			catch (Exception e) {
//				Thread.sleep(1000)
//	
//				WebUI.refresh()
//			}
//		}
//		
//		WebUI.delay(2)
//	
//		def maxRetries = 10
//	
//		for (int i = 1; i <= maxRetries; i++) {
//			try {
//				WebUI.click(findTestObject('Trade/Page_Vonix/span_HNT'))
//	
//				break
//			}
//			catch (Exception e) {
//				Thread.sleep(1000)
//	
//				WebUI.refresh()
//	
//				WebUI.click(findTestObject('Trade/Page_Vonix (development)/img'))
//			}
//		}
//		
//		WebUI.setText(findTestObject('Trade/Page_Vonix (development)/input'), input_HNT)
//	
//		WebUI.click(findTestObject('Trade/Page_Vonix (development)/div_Top Up_p-checkbox-box'))
//	
//		WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_BUY'))
//	
//		WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Confirm to Buy'))
//	
//		WebUI.click(findTestObject('Trade/Page_Vonix (development)/button_Make another transaction'))
//    
//} else {
//	
//	KeywordUtil.markFailed('Skipping this test case as per condition.') // Find the element you want to click
//	// If the click succeeds, break out of the loop
//	// Wait for a short moment before retrying (optional)
//	// Wait for 1 second (you can adjust this value as needed)
//	// Refresh element
//	//WebUI.click(findTestObject('Trade/Page_Vonix (development)/img'))
//	// Find the element you want to click (for example, a button with id="myButton")
//	// If the click succeeds, break out of the loop
//	// Wait for a short moment before retrying (optional)
//	// Wait for 1 second (you can adjust this value as needed)
//	// Refresh element
//	// Click again img
//	//WebUI.click(findTestObject('Trade/Page_Vonix/span_HNT'))
//}

