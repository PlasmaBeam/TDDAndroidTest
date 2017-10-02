package com.example.esalazar.tdd_android_test.LogicTest;

import android.support.test.espresso.assertion.ViewAssertions;

import com.example.esalazar.tdd_android_test.ActivityRule;
import com.example.esalazar.tdd_android_test.Logic.TestClass1;
import com.example.esalazar.tdd_android_test.MainActivity;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.assertEquals;

/**
 * Created by esalazar on 10/2/17.
 */

public class TestClassTest {

    @Rule
    public final ActivityRule<MainActivity> main = new ActivityRule<>(MainActivity.class);

    @Test // (expected = RuntimeException.class) Checks whether the function throws RuntimeException
    public void checkLogicClassIntIs0() {
        TestClass1 main = new TestClass1();
        assertEquals(1, main.testInt);
    }

    @Test
    public void checkTextViewIsNotPresented() {
        onView(withText("There is no spoon")).check(ViewAssertions.matches(isDisplayed()));
    }
}
