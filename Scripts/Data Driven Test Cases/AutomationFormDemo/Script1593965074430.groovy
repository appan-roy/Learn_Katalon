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
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell
import org.apache.poi.xssf.usermodel.XSSFCellStyle
import org.apache.poi.xssf.usermodel.XSSFRow
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.toolsqa.com/automation-practice-form/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Tools QA/Page_Demo Form for practicing Selenium Automation/a_ACCEPT'))

for(def i = 1; i <= findTestData("Test Data/ToolsQA").getRowNumbers(); i++)

{

	WebUI.setText(findTestObject('Object Repository/Tools QA/Page_Demo Form for practicing Selenium Automation/input_First name_firstname'), 
	    findTestData("Test Data/ToolsQA").getValue(1, i))
	
	WebUI.setText(findTestObject('Object Repository/Tools QA/Page_Demo Form for practicing Selenium Automation/input_Last name_lastname'), 
	    findTestData("Test Data/ToolsQA").getValue(2, i))
	
	if(findTestData("Test Data/ToolsQA").getValue(3, i) == 'Male')
	{
		WebUI.click(findTestObject('Object Repository/Tools QA/Page_Demo Form for practicing Selenium Automation/input_Sex_sex'))
	}
	
	else if(findTestData("Test Data/ToolsQA").getValue(3, i) == 'Female')
	{
		WebUI.click(findTestObject('Object Repository/Tools QA/Page_Demo Form for practicing Selenium Automation/input_Sex_sex_1'))
	}
	
	WebUI.takeScreenshot('E:\\Softwares\\My PC Apps\\Katalon Studio\\Workspace\\LearnKatalon\\Screenshots\\'+findTestData("Test Data/ToolsQA").getValue(1, i)+'_'+findTestData("Test Data/ToolsQA").getValue(2, i)+'_1'+'.png')
	
	if(findTestData("Test Data/ToolsQA").getValue(4, i) == '1')
	{
		WebUI.click(findTestObject('Object Repository/Tools QA/Page_Demo Form for practicing Selenium Automation/input_Years of Experience_exp'))
	}
	
	else if(findTestData("Test Data/ToolsQA").getValue(4, i) == '2')
	{
		WebUI.click(findTestObject('Object Repository/Tools QA/Page_Demo Form for practicing Selenium Automation/input_Years of Experience_exp_1'))
	}
	
	else if(findTestData("Test Data/ToolsQA").getValue(4, i) == '3')
	{
		WebUI.click(findTestObject('Object Repository/Tools QA/Page_Demo Form for practicing Selenium Automation/input_Years of Experience_exp_1_2'))
	}
	
	else if(findTestData("Test Data/ToolsQA").getValue(4, i) == '4')
	{
		WebUI.click(findTestObject('Object Repository/Tools QA/Page_Demo Form for practicing Selenium Automation/input_Years of Experience_exp_1_2_3'))
	}
	
	else if(findTestData("Test Data/ToolsQA").getValue(4, i) == '5')
	{
		WebUI.click(findTestObject('Object Repository/Tools QA/Page_Demo Form for practicing Selenium Automation/input_Years of Experience_exp_1_2_3_4'))
	}
	
	else if(findTestData("Test Data/ToolsQA").getValue(4, i) == '6')
	{
		WebUI.click(findTestObject('Object Repository/Tools QA/Page_Demo Form for practicing Selenium Automation/input_Years of Experience_exp_1_2_3_4_5'))
	}
	
	else if(findTestData("Test Data/ToolsQA").getValue(4, i) == '7')
	{
		WebUI.click(findTestObject('Object Repository/Tools QA/Page_Demo Form for practicing Selenium Automation/input_Years of Experience_exp_1_2_3_4_5_6'))
	}

	WebUI.setText(findTestObject('Object Repository/Tools QA/Page_Demo Form for practicing Selenium Automation/input_Years of Experience_datepicker'), 
	    findTestData("Test Data/ToolsQA").getValue(5, i))
	
	if(findTestData("Test Data/ToolsQA").getValue(6, i) == 'Y')
	{
		WebUI.click(findTestObject('Object Repository/Tools QA/Page_Demo Form for practicing Selenium Automation/input_Profession_profession'))
	}
	
	if(findTestData("Test Data/ToolsQA").getValue(7, i) == 'Y')
	{
		WebUI.click(findTestObject('Object Repository/Tools QA/Page_Demo Form for practicing Selenium Automation/input_Profession_profession_1'))
	}
	
	WebUI.takeScreenshot('E:\\Softwares\\My PC Apps\\Katalon Studio\\Workspace\\LearnKatalon\\Screenshots\\'+findTestData("Test Data/ToolsQA").getValue(1, i)+'_'+findTestData("Test Data/ToolsQA").getValue(2, i)+'_2'+'.png')
	
	if(findTestData("Test Data/ToolsQA").getValue(8, i) == 'Y')
	{
		WebUI.click(findTestObject('Object Repository/Tools QA/Page_Demo Form for practicing Selenium Automation/input_Automation Tool_tool'))
	}
	
	if(findTestData("Test Data/ToolsQA").getValue(9, i) == 'Y')
	{
		WebUI.click(findTestObject('Object Repository/Tools QA/Page_Demo Form for practicing Selenium Automation/input_Automation Tool_tool_1'))
	}
	
	if(findTestData("Test Data/ToolsQA").getValue(10, i) == 'Y')
	{
		WebUI.click(findTestObject('Object Repository/Tools QA/Page_Demo Form for practicing Selenium Automation/input_Automation Tool_tool_1_2'))
	}
	
	if(findTestData("Test Data/ToolsQA").getValue(11, i) == 'Asia')
	{
		WebUI.selectOptionByValue(findTestObject('Object Repository/Tools QA/Page_Demo Form for practicing Selenium Automation/select_AsiaEuropeAfricaAustraliaSouth Ameri_b9ba0e'),
			'AS', true)
	}
	
	else if(findTestData("Test Data/ToolsQA").getValue(11, i) == 'Europe')
	{
		WebUI.selectOptionByValue(findTestObject('Object Repository/Tools QA/Page_Demo Form for practicing Selenium Automation/select_AsiaEuropeAfricaAustraliaSouth Ameri_b9ba0e'),
			'EU', true)
	}
	
	else if(findTestData("Test Data/ToolsQA").getValue(11, i) == 'Africa')
	{
		WebUI.selectOptionByValue(findTestObject('Object Repository/Tools QA/Page_Demo Form for practicing Selenium Automation/select_AsiaEuropeAfricaAustraliaSouth Ameri_b9ba0e'),
			'AF', true)
	}
	
	else if(findTestData("Test Data/ToolsQA").getValue(11, i) == 'Australia')
	{
		WebUI.selectOptionByValue(findTestObject('Object Repository/Tools QA/Page_Demo Form for practicing Selenium Automation/select_AsiaEuropeAfricaAustraliaSouth Ameri_b9ba0e'),
			'AUS', true)
	}
	
	else if(findTestData("Test Data/ToolsQA").getValue(11, i) == 'South America')
	{
		WebUI.selectOptionByValue(findTestObject('Object Repository/Tools QA/Page_Demo Form for practicing Selenium Automation/select_AsiaEuropeAfricaAustraliaSouth Ameri_b9ba0e'),
			'SA', true)
	}
	
	else if(findTestData("Test Data/ToolsQA").getValue(11, i) == 'North America')
	{
		WebUI.selectOptionByValue(findTestObject('Object Repository/Tools QA/Page_Demo Form for practicing Selenium Automation/select_AsiaEuropeAfricaAustraliaSouth Ameri_b9ba0e'),
			'NA', true)
	}
	
	else if(findTestData("Test Data/ToolsQA").getValue(11, i) == 'Antarctica')
	{
		WebUI.selectOptionByValue(findTestObject('Object Repository/Tools QA/Page_Demo Form for practicing Selenium Automation/select_AsiaEuropeAfricaAustraliaSouth Ameri_b9ba0e'),
			'AN', true)
	}

	if(findTestData("Test Data/ToolsQA").getValue(12, i) == 'Browser Commands')
	{
		WebUI.selectOptionByValue(findTestObject('Object Repository/Tools QA/Page_Demo Form for practicing Selenium Automation/select_Browser CommandsNavigation CommandsS_69f390'),
			'Browser Commands', true)
	}
	
	else if(findTestData("Test Data/ToolsQA").getValue(12, i) == 'Navigation Commands')
	{
		WebUI.selectOptionByValue(findTestObject('Object Repository/Tools QA/Page_Demo Form for practicing Selenium Automation/select_Browser CommandsNavigation CommandsS_69f390'),
			'Navigation Commands', true)
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/Tools QA/Page_Demo Form for practicing Selenium Automation/select_Browser CommandsNavigation CommandsS_69f390'),
			'Navigation Commands', true)
	}
	
	else if(findTestData("Test Data/ToolsQA").getValue(12, i) == 'Switch Commands')
	{
		WebUI.selectOptionByValue(findTestObject('Object Repository/Tools QA/Page_Demo Form for practicing Selenium Automation/select_Browser CommandsNavigation CommandsS_69f390'),
			'Switch Commands', true)
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/Tools QA/Page_Demo Form for practicing Selenium Automation/select_Browser CommandsNavigation CommandsS_69f390'),
			'Switch Commands', true)
	}
	
	else if(findTestData("Test Data/ToolsQA").getValue(12, i) == 'Wait Commands')
	{
		WebUI.selectOptionByValue(findTestObject('Object Repository/Tools QA/Page_Demo Form for practicing Selenium Automation/select_Browser CommandsNavigation CommandsS_69f390'),
			'Wait Commands', true)
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/Tools QA/Page_Demo Form for practicing Selenium Automation/select_Browser CommandsNavigation CommandsS_69f390'),
			'Wait Commands', true)
	}
	
	else if(findTestData("Test Data/ToolsQA").getValue(12, i) == 'WebElement Commands')
	{
		WebUI.selectOptionByValue(findTestObject('Object Repository/Tools QA/Page_Demo Form for practicing Selenium Automation/select_Browser CommandsNavigation CommandsS_69f390'),
			'WebElement Commands', true)
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/Tools QA/Page_Demo Form for practicing Selenium Automation/select_Browser CommandsNavigation CommandsS_69f390'),
			'WebElement Commands', true)
	}

	WebUI.takeScreenshot('E:\\Softwares\\My PC Apps\\Katalon Studio\\Workspace\\LearnKatalon\\Screenshots\\'+findTestData("Test Data/ToolsQA").getValue(1, i)+'_'+findTestData("Test Data/ToolsQA").getValue(2, i)+'_3'+'.png')
	
	WebUI.click(findTestObject('Object Repository/Tools QA/Page_Demo Form for practicing Selenium Automation/button_Button'))
	
	FileInputStream fis = new FileInputStream("E:\\Softwares\\My PC Apps\\Katalon Studio\\Test Data\\Automation Practice Form_Test Data.xlsx");
	
	XSSFWorkbook workbook = new XSSFWorkbook(fis);
	
	XSSFSheet sheet = workbook.getSheet("ToolsQA DataSheet");
	
	sheet.getRow(i).createCell(12).setCellValue("Pass")
	
	FileOutputStream fos = new FileOutputStream("E:\\Softwares\\My PC Apps\\Katalon Studio\\Test Data\\Automation Practice Form_Test Data.xlsx");
	
	workbook.write(fos);
	
	fos.close();

}

WebUI.closeBrowser()

