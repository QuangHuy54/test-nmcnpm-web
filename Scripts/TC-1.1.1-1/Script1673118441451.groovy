import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable

import org.openqa.selenium.By
import org.openqa.selenium.Keys as Keys
WebUI.openBrowser('')

WebUI.navigateToUrl('https://nmcnpm-group24.vercel.app/#/login')

WebUI.setText(findTestObject('Object Repository/Page_G24 App/input_ng nhp vo ti khon_email'), 'test7@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_G24 App/input__password'), 'SFTQUhjBfIY=')

WebUI.click(findTestObject('Object Repository/Page_G24 App/button_ng nhp'))

WebUI.delay(4)

WebUI.navigateToUrl('https://nmcnpm-group24.vercel.app/#/room')

WebUI.click(findTestObject('Object Repository/Page_G24 App/p_Thm'))

WebUI.click(findTestObject('Object Repository/Page_G24 App/li_To phng'))

WebUI.setText(findTestObject('Object Repository/Page_G24 App/input_Tn phng_r8'), 'a1')

WebUI.setText(findTestObject('Object Repository/Page_G24 App/textarea_M t_r9'), 'abc')

WebUI.click(findTestObject('Object Repository/Page_G24 App/input_M t_PrivateSwitchBase-input css-1m9pwf3'))

WebUI.delay(2)

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//button[text()='TẠO']"))

WebUI.delay(5)

WebUI.closeBrowser()

