package launch_appli

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


class onboardingSteps {

	@Given('I launch my app')
	public void i_launch_my_app() {
		Mobile.startApplication('App/occazio.apk', false)
		Mobile.delay(5)
	}

	@And('I click on start button')
	public void i_click_on_start_button() {
		Mobile.tap(findTestObject('Object Repository/launch_appli/android.widget.Button - DMARRER'), 5)
	}

	@When('I swipe all the onboarding views')
	public void i_swipe_all_the_onboarding_views() {
		Mobile.swipe(950, 950, 100, 950)
		Mobile.delay(2)
		Mobile.swipe(950, 950, 100, 950)
		Mobile.delay(2)
		Mobile.swipe(950, 950, 100, 950)
		Mobile.delay(2)
		Mobile.swipe(950, 950, 100, 950)
		Mobile.delay(2)
	}

	@And('I allow the notifications')
	public void i_allow_the_notifications() {
		Mobile.tap(findTestObject('Object Repository/launch_appli/android.view.View'), 2)
	}

	@And('I click on validate button')
	public void i_click_on_validate_button() {
		Mobile.tap(findTestObject('Object Repository/launch_appli/android.widget.Button - VALIDER'), 2)
	}
	
	@And('I check text from popup')
	public void i_check_text_from_popup() {
		Mobile.verifyElementText(findTestObject('Object Repository/launch_appli/android.widget.TextView - Je suis l pour'), "Je suis là pour")
	}
	
	@And('I click on skip link')
	public void i_click_on_skip_link() {
		Mobile.tap(findTestObject('Object Repository/launch_appli/android.widget.TextView - Je ne souhaite pas optimiser Occazio'), 2)
	}

	@Then('I am on the homepage')
	public void i_am_on_the_homepage() {
		Mobile.verifyElementExist(findTestObject('Object Repository/launch_appli/android.widget.ImageView'), 2)
	}
	
	
}