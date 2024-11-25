package com.example.myapplication

import android.app.Activity
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.closeSoftKeyboard
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test

class MainActivityTest {

    @get:Rule
    val activityrule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun test_1() {
        onView(withId(R.id.editLogin)).check(matches(isDisplayed()))
        onView(withId(R.id.editPassword)).check(matches(isDisplayed()))
        onView(withId(R.id.button)).check(matches(isDisplayed()))
        onView(withId(R.id.textView)).check(matches(isDisplayed()))
        onView(withId(R.id.editLogin)).perform(typeText(MainActivity.LOGIN), closeSoftKeyboard())
        onView(withId(R.id.editPassword)).perform(typeText("123"), closeSoftKeyboard())
        onView(withId(R.id.button)).perform(click())
        onView(withId(R.id.textView)).check(matches(withText(R.string.auth_failed)))
    }
}