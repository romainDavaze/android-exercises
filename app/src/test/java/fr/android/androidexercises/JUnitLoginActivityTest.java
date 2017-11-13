package fr.android.androidexercises;

import org.assertj.android.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;

@RunWith(CustomRobolectricTestRunner.class)
public class JUnitLoginActivityTest {

    LoginActivity activity;

    @Before
    public void setUp() throws Exception {
        activity = Robolectric.setupActivity(LoginActivity.class);
    }

    @Test
    public void shouldSetLoggedState() throws Exception {
        //Given

        //When
        activity.logged();

        //Then
        Assertions.assertThat(activity.loginLayout).isGone();
        Assertions.assertThat(activity.loggedText).isEqualTo(R.string.text_logged);
    }

    @Test
    public void checkInit() throws Exception {
        Assertions.assertThat(activity.loginLayout).isVisible();
        Assertions.assertThat(activity.loggedText).isGone();
    }


}