import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('https://nmcnpm-group24.vercel.app/#/login')

WebUI.setText(findTestObject('Object Repository/Page_G24 App/input_ng nhp vo ti khon_email'), 'test8@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_G24 App/input__password'), 'SFTQUhjBfIY=')

WebUI.click(findTestObject('Object Repository/Page_G24 App/button_ng nhp'))

WebUI.delay(5)

WebUI.navigateToUrl('https://nmcnpm-group24.vercel.app/#/room')

WebUI.doubleClick(findTestObject('Object Repository/Page_G24 App/p_a1'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_G24 App/div_Ni lm vic'))

WebUI.click(findTestObject('Object Repository/Page_G24 App/p_To cng vic'))

WebUI.setText(findTestObject('Object Repository/Page_G24 App/input_Tn cng vic_ra'), 'b1')

WebUI.delay(2)

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//button[text()='TẠO']"))

WebUI.delay(4)

WebUI.closeBrowser()

