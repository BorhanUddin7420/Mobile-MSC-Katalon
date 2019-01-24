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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.msccruises.co.uk/en-gb/Homepage.aspx')

//WebUI.click(findTestObject('Object Repository/Page_MSC Cruises Holidays to the Ca/img_Children_qs_arrow'))
//
//WebUI.click(findTestObject('Object Repository/Page_MSC Cruises Holidays to the Ca/div_'))
//
//WebUI.click(findTestObject('Object Repository/Page_MSC Cruises Holidays to the Ca/div_'))
//
//WebUI.click(findTestObject('Object Repository/Page_MSC Cruises Holidays to the Ca/img_-_qs_arrow'))
//
//WebUI.click(findTestObject('Object Repository/Page_MSC Cruises Holidays to the Ca/th_Clear_next'))
//
//WebUI.click(findTestObject('Object Repository/Page_MSC Cruises Holidays to the Ca/span_Feb'))
WebUI.click(findTestObject('Page_MSC Cruises Holidays to the Ca/PassMenu'))

WebUI.waitForElementVisible(findTestObject('Page_MSC Cruises Holidays to the Ca/PassPlusAdultsPass'), 5)

WebUI.click(findTestObject('Page_MSC Cruises Holidays to the Ca/PassPlusAdultsPass'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_MSC Cruises Holidays to the Ca/PassPlusAdultsPass'))

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_MSC Cruises Holidays to the Ca/DonePassenger'))

