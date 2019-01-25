import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Open Chrome Browser on Android Mobile'
WebUI.openBrowser('')

'User navigate to Website MSC UK'
WebUI.navigateToUrl('https://www.msccruises.co.uk/en-gb/Homepage.aspx')

'User Click Passenger menu to select number of passengers'
WebUI.click(findTestObject('Page_MSC Cruises Holidays to the Ca/PassMenu'))

'Wait for page load'
WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

'Verify that user on Passengers Page'
WebUI.verifyTextPresent('Passengers', false)

'User click Pluc icon to add one more passengers'
WebUI.click(findTestObject('Page_MSC Cruises Holidays to the Ca/PassPlusAdultsPass'))

'Wait for page load'
WebUI.delay(3)

'User click Pluc icon to add one more passengers'
WebUI.click(findTestObject('Page_MSC Cruises Holidays to the Ca/PassPlusAdultsPass'))

'Wait for page load'
WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

'User Click done Button\r\n'
WebUI.click(findTestObject('Page_MSC Cruises Holidays to the Ca/DonePassenger'))

'Verify 4 adults passengers added successfully'
WebUI.verifyTextPresent('4 Adults', false)

