package com.calculator.cashback;

import android.os.Bundle;
import android.support.v17.leanback.widget.HorizontalGridView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.Toast;

public class AddCardActivity extends AppCompatActivity {

    private HorizontalGridView vAddLogo;
    private AutoCompleteTextView vAddName, vAddCategory;
    private EditText vAddPercent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_card);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        vAddLogo = (HorizontalGridView) findViewById(R.id.gv_logo_grid);

        vAddName = (AutoCompleteTextView) findViewById(R.id.actv_add_name);
        vAddCategory = (AutoCompleteTextView) findViewById(R.id.actv_add_category);

        vAddPercent = (EditText) findViewById(R.id.et_add_percent);

        vAddLogo.setAdapter(new LogoGridViewAdapter(getApplicationContext()));

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
