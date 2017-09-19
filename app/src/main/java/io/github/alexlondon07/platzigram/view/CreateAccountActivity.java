package io.github.alexlondon07.platzigram.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import io.github.alexlondon07.platzigram.R;

public class CreateAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        showToolbar(getResources().getString(R.string.toolar_title_createaccount), false);
    }

    public void showToolbar(String title, boolean upButton){
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*Titulo de toolbar*/
        getSupportActionBar().setTitle(title);

        /*En caso que tenga Boton de regreso*/
        getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }
}
