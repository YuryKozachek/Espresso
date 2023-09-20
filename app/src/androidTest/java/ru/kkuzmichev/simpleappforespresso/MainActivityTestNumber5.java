//package ru.kkuzmichev.simpleappforespresso;
//
//
//import static androidx.test.espresso.Espresso.onView;
//import static androidx.test.espresso.action.ViewActions.click;
//import static androidx.test.espresso.assertion.ViewAssertions.matches;
//import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
//import static androidx.test.espresso.matcher.ViewMatchers.withClassName;
//import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
//import static androidx.test.espresso.matcher.ViewMatchers.withId;
//import static androidx.test.espresso.matcher.ViewMatchers.withParent;
//import static androidx.test.espresso.matcher.ViewMatchers.withText;
//import static org.hamcrest.Matchers.allOf;
//import static org.hamcrest.Matchers.is;
//
//import android.view.View;
//import android.view.ViewGroup;
//import android.view.ViewParent;
//
//import androidx.test.espresso.IdlingRegistry;
//import androidx.test.espresso.ViewInteraction;
//import androidx.test.ext.junit.rules.ActivityScenarioRule;
//import androidx.test.ext.junit.runners.AndroidJUnit4;
//import androidx.test.filters.LargeTest;
//
//import org.hamcrest.Description;
//import org.hamcrest.Matcher;
//import org.hamcrest.TypeSafeMatcher;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//
//@LargeTest
//@RunWith(AndroidJUnit4.class)
//public class MainActivityTestNumber5 {
//
//    @Rule
//    public ActivityScenarioRule<MainActivity> mActivityScenarioRule =
//            new ActivityScenarioRule<>(MainActivity.class);
//
//    @Before
//    public void registerIdlingResources(){
//        IdlingRegistry.getInstance().register(LectionIdlingResources.idlingResource);
//    }
//
//    @After
//    public void unregisterIdlingResources(){
//        IdlingRegistry.getInstance().register(LectionIdlingResources.idlingResource);
//    }
//
//    @Test
//    public void mainActivityTestNumber5() {
//        ViewInteraction appCompatImageButton = onView(withContentDescription("Open navigation drawer"));
//        appCompatImageButton.check(matches(isDisplayed()));
//        appCompatImageButton.perform(click());
//
//        ViewInteraction navigationMenuItemView = onView(withId(R.id.nav_gallery));
//        navigationMenuItemView.check(matches(isDisplayed()));
//        navigationMenuItemView.perform(click());
//
//        ViewInteraction textView = onView(allOf(withId(R.id.item_number), withText("5"), isDisplayed()));
//        textView.check(matches(withText("5")));
//        ViewInteraction recyclerView = onView(withId(R.id.recycle_view));
//        recyclerView.check(matches(isDisplayed()));
//        recyclerView.check(CustomViewAssertion.isRecyclerView());
//        recyclerView.check(matches(CustomViewMatcher.recyclerViewSizeMatcher(10)));
//
//
//    }
//}
