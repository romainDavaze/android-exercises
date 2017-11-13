package fr.android.androidexercises;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    ViewGroup loginLayout;
    View loggedText;
    LoginPresenter presenter;
    EditText passwordEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginLayout = (ViewGroup) findViewById(R.id.loginLayout);
        loggedText = findViewById(R.id.loggedText);
        passwordEdit = (EditText) findViewById(R.id.passwordEdit);

        presenter = new LoginPresenter(this);

        findViewById(R.id.loginButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.checkCredentials(passwordEdit.getText().toString());
            }
        });

        Intent intent = new Intent(this, BigJobService.class);
        startService(intent);
    }

    @Override
    protected void onResume() {
        super.onResume();
        notLogged();
    }

    void notLogged() {
        loginLayout.setVisibility(View.VISIBLE);
        loggedText.setVisibility(View.GONE);
    }

    void logged() {
        loginLayout.setVisibility(View.GONE);
        loggedText.setVisibility(View.VISIBLE);
    }

    void message(int id) {
        Toast.makeText(this, id, Toast.LENGTH_SHORT).show();
    }
}
