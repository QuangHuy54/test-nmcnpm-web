import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('https://nmcnpm-group24.vercel.app/#/login')

WebUI.setText(findTestObject('Object Repository/Page_G24 App/input_ng nhp vo ti khon_email'), 'test7@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_G24 App/input__password'), 'SFTQUhjBfIY=')

WebUI.click(findTestObject('Object Repository/Page_G24 App/button_ng nhp'))

WebUI.delay(4)

WebUI.navigateToUrl('https://nmcnpm-group24.vercel.app/#/room')

WebUI.click(findTestObject('Object Repository/Page_G24 App/p_Thm'))

WebUI.click(findTestObject('Object Repository/Page_G24 App/li_To phng'))

WebUI.setText(findTestObject('Object Repository/Page_G24 App/input_Tn phng_r8'), 'a5')

WebUI.setText(findTestObject('Object Repository/Page_G24 App/textarea_M t_r9'), 'abc')

WebUI.click(findTestObject('Object Repository/Page_G24 App/input_M t_PrivateSwitchBase-input css-1m9pwf3'))
WebUI.delay(1)
WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//button[text()='TẠO']"))
WebUI.delay(5)
WebUI.closeBrowser()

