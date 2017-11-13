package fr.android.androidexercises;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LoginPresenterTest {

    @Mock
    LoginActivity activity;

    @InjectMocks
    LoginPresenter loginPresenter;

    @Test
    public void passwordShouldBeValid() throws Exception {
        loginPresenter.checkCredentials("password");
        Mockito.verify(activity).logged();
        Mockito.verify(activity).message(R.string.text_logged);
    }

    @Test
    public void passwordShouldBeInvalid() throws Exception {
        loginPresenter.checkCredentials("a");
        Mockito.verify(activity).notLogged();
        Mockito.verify(activity).message(R.string.notLogged);
    }


}