package com.example.tp22cr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentProviderClient;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private int i =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        final TextView compteur=(TextView) findViewById(R.id.cpt);
        EditText text=(EditText)findViewById(R.id.editText);
        Button butt=(Button)findViewById(R.id.button);
        if(getResources().getConfiguration().orientation== Configuration.ORIENTATION_PORTRAIT ){


        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i++;
                String j=Integer.toString(i);
                compteur.setText(j);


            }

        });



        }else{

            String a ="0";
            compteur.setText(a);
            butt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    i++;
                    String j=Integer.toString(i);
                    compteur.setText(j);


                }
            });



        }



    }

    /*  public void onSaveInstanceState(Bundle outState) {


        final TextView compteur=(TextView) findViewById(R.id.cpt);
        super.onSaveInstanceState(outState);
        int num1 = Integer.parseInt(String.valueOf(compteur));
        outState.putInt("cpt",num1);
    }
 protected void onRestoreInstanceState(Bundle savedInstanceState) {
        final TextView compteur=(TextView) findViewById(R.id.cpt);
        super.onRestoreInstanceState(savedInstanceState);
        Toast.makeText(getApplicationContext(), "onRestoreInstanceState", Toast.LENGTH_SHORT).show();
        int num1 = Integer.parseInt(String.valueOf(compteur));
        num1 = savedInstanceState.getInt("cpt", 0);
    }
*/
    }