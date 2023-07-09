import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileAbstractKeyword as MobileAbstractKeyword
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable

import org.omg.CORBA.portable.CustomValue
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.appium.driver.AppiumDriverManager as AppiumDriverManager
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import org.openqa.selenium.remote.DesiredCapabilities as DesiredCapabilities
import com.kms.katalon.core.mobile.driver.MobileDriverType as MobileDriverType

//Run sur browserstack avec les configs
/*
//Mobile.startApplication('bs://14d1f506043bc4204f0a60c78d0ca61fdef63565', true)
// Set the Browserstack credentials: USERNAME and ACCESS_KEY
String browserStackServerURL = ' https://papemalickba_wd46YF:tzsy9VrTmURkaxJB5qN3@hub-cloud.browserstack.com/wd/hub'

DesiredCapabilities capabilities = new DesiredCapabilities()

capabilities.setCapability('os_version', '10.0')

capabilities.setCapability('device', 'Samsung Galaxy A51')

capabilities.setCapability('app', 'bs://14d1f506043bc4204f0a60c78d0ca61fdef63565')

//Set the app_url (returned on uploading app on Browserstack) in the 'app' capability
//capabilities.setCapability('app', 'bs://fbbea35476e97bcb1b8b214ebcdd9da0bc6e84db","custom_id":"occazio","shareable_id":"mariamediallo_gnJVHk/occazio');
AppiumDriverManager.createMobileDriver(MobileDriverType.ANDROID_DRIVER, capabilities, new URL(browserStackServerURL))
*/

//Run en parallèle 
Mobile.startApplication('bs://14d1f506043bc4204f0a60c78d0ca61fdef63565', false)

Mobile.tap(findTestObject('Object Repository/launch_appli/android.widget.Button - DMARRER'), 0)

Mobile.swipe(950, 950, 100, 950)

Mobile.swipe(950, 950, 100, 950)

Mobile.swipe(950, 950, 100, 950)

Mobile.swipe(950, 950, 100, 950)

Mobile.tap(findTestObject('Object Repository/launch_appli/android.view.View'), 0)

Mobile.tap(findTestObject('Object Repository/launch_appli/android.widget.Button - VALIDER'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/launch_appli/android.widget.TextView - Je suis l pour'), 'Je suis là pour')

Mobile.tap(findTestObject('Object Repository/launch_appli/android.widget.TextView - Je ne souhaite pas optimiser Occazio'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/launch_appli/android.widget.ImageView'), 0)

Mobile.closeApplication()

