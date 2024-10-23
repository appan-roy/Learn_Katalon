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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(url)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/CURA Healthcare Services/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.setText(findTestObject('Object Repository/CURA Healthcare Services/Page_CURA Healthcare Service/input_Username_username'), 
    username)

WebUI.setText(findTestObject('Object Repository/CURA Healthcare Services/Page_CURA Healthcare Service/input_Password_password'), 
    password)

WebUI.click(findTestObject('Object Repository/CURA Healthcare Services/Page_CURA Healthcare Service/button_Login'))

WebUI.selectOptionByValue(findTestObject('Object Repository/CURA Healthcare Services/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center        _5b4107'), 
    'Seoul CURA Healthcare Center', true)

WebUI.click(findTestObject('Object Repository/CURA Healthcare Services/Page_CURA Healthcare Service/input_Apply for hospital readmission_hospit_63901f'))

WebUI.click(findTestObject('Object Repository/CURA Healthcare Services/Page_CURA Healthcare Service/input_Medicaid_programs'))

WebUI.setText(findTestObject('Object Repository/CURA Healthcare Services/Page_CURA Healthcare Service/input_Visit Date (Required)_visit_date'), 
    '01/12/2019')

WebUI.setText(findTestObject('Object Repository/CURA Healthcare Services/Page_CURA Healthcare Service/textarea_Comment_comment'), 
    'Please book an appointment.')

WebUI.click(findTestObject('Object Repository/CURA Healthcare Services/Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/CURA Healthcare Services/Page_CURA Healthcare Service/a_Go to Homepage'))

WebUI.delay(2)

WebUI.closeBrowser()

