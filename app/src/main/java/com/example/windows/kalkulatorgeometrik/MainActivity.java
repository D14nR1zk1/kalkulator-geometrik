package com.example.windows.kalkulatorgeometrik;

import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    EditText inp1;
    EditText inp2;
    TextView luas;
    TextView kell;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnhitung(View view)
    {

        spinner = (Spinner) findViewById(R.id.spinner);
        inp1 = (EditText) findViewById(R.id.input1);
        inp2 = (EditText) findViewById(R.id.input2);
        luas = (TextView) findViewById(R.id.tvluas);
        kell = (TextView) findViewById(R.id.tvkeliling);

        String angka1 = inp1.getText().toString();
        String angka2 = inp2.getText().toString();

        int i1 = Integer.parseInt(angka1);
        int i2 = Integer.parseInt(angka2);

        if (spinner.getSelectedItem().toString().equals("Persegi")){
            int hL = i1*i2;
            String hA = String.valueOf(hL);
            luas.setText(hA);

            int hK = (2*i1)+(2*i2);
            String hB = String.valueOf(hK);
            kell.setText(hB);
        }
        else if (spinner.getSelectedItem().toString().equals("Lingkaran")){

            double pi = Math.PI;

            double hL = pi*(i1*i1);
            String hA = String.valueOf(hL);
            luas.setText(hA);

            double hK = pi*(2*i1);
            String hB = String.valueOf(hK);
            kell.setText(hB);
        }
        else if (spinner.getSelectedItem().toString().equals("Segitiga ")){

            double hL= (i1*i2)/2;
            String hA=String.valueOf(hL);
            luas.setText(hA);

            double sqrt = (float) Math.sqrt((i1*i1)+(i2*i2));
            double hK= i1+i2+sqrt;
            String hB=String.valueOf(hK);
            kell.setText(hB);
        }
    }
}
