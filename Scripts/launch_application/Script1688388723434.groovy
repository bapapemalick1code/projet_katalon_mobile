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
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('C:\\Users\\monsh\\Katalon Studio\\project_mobile\\App', true)

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

