package ru.kkuzmichev.simpleappforespresso;

import static android.content.Intent.ACTION_VIEW;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import androidx.test.espresso.ViewInteraction;
import androidx.test.espresso.intent.Intents;
import androidx.test.espresso.intent.matcher.IntentMatchers;
import androidx.test.espresso.intent.rule.IntentsTestRule;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@LargeTest
@RunWith(AndroidJUnit4.class)

public class CheckIntent {

    @Rule
    public ActivityScenarioRule<MainActivity> mActivityScenarioRule =
            new ActivityScenarioRule<>(MainActivity.class);

//    public IntentsTestRule intentsTestRule =
//            new IntentsTestRule(MainActivity.class);

    @Test
    public void shouldOpenMenuSettings(){

        Intents.init();
        ViewInteraction menuButton = onView(withContentDescription("More options"));
        menuButton.check(matches(isDisplayed()));
        menuButton.perform(click());

        ViewInteraction menuSettings = onView(withId(R.id.title));
        menuSettings.check(matches(isDisplayed()));
        menuSettings.perform(click());

        Intents.intended(Matchers.allOf(
                IntentMatchers.hasAction(ACTION_VIEW),
                IntentMatchers.hasData("https://google.com")));
        Intents.release();
    }
}
