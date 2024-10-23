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


WebUI.openBrowser('https://opensource-demo.orangehrmlive.com/')

WebUI.maximizeWindow()

for(def i = 1; i <= findTestData("Test Data/OrangeHRM").getRowNumbers(); i++) {

	WebUI.setText(findTestObject('OrangeHRM_Manual_OR/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), findTestData("Test Data/OrangeHRM").getValue(1, i))
	
	WebUI.setText(findTestObject('OrangeHRM_Manual_OR/Page_OrangeHRM/input_Username_txtPassword'), findTestData("Test Data/OrangeHRM").getValue(2, i))

}

WebUI.closeBrowser()
