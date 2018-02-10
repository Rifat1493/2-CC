package com.example.abdullahal_munzir.a2_cc;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.mipmap.ic_launcher);


        Button btnBin = (Button)findViewById(R.id.btn_bin);

        btnBin.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent newIntent = new Intent(MainActivity.this, BinaryActivity.class);
                        startActivity(newIntent);
                        overridePendingTransition(R.transition.enter, R.transition.exit);
                }
                }
        );

        Button btnDec = (Button)findViewById(R.id.btn_dec);

        btnDec.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent newIntent = new Intent(MainActivity.this, DecimalActivity.class);
                        startActivity(newIntent);
                        overridePendingTransition(R.transition.enter, R.transition.exit);
                    }
                }
        );

        Button btnHex = (Button)findViewById(R.id.btn_hex);

        btnHex.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent newIntent = new Intent(MainActivity.this, HexActivity.class);
                        startActivity(newIntent);
                        overridePendingTransition(R.transition.enter, R.transition.exit);
                    }
                }
        );


        Button btnnew = (Button)findViewById(R.id.new_btn);

        btnnew.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent newIntent = new Intent(MainActivity.this, completeActivity.class);
                        startActivity(newIntent);
                        overridePendingTransition(R.transition.enter, R.transition.exit);
                    }
                }
        );




    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.menu_about) {
            Intent intent = new Intent(this, AboutActivity.class);
            startActivity(intent);
            overridePendingTransition(R.transition.enter_up, R.transition.exit_up);
        }

        if (id == R.id.menu_um) {
            Intent intent = new Intent(this, UmActivity.class);
            startActivity(intent);
            overridePendingTransition(R.transition.enter_up, R.transition.exit_up);
        }


        return true;

    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setIcon(R.drawable.icon)
                .setTitle("EXIT?")
                .setMessage("Are you sure you want to close 2-CC?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }

                })
                .setNegativeButton("No", null)
                .show();
    }

}

