package id.sch.smktelkom_mlg.tugas01.xirpl2018.tugas01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etnama;
    TextView tvh1, tvh2,tvh3,tvh4;
    Button bok;
    RadioGroup rdjk;
    CheckBox bta, fo , pramuka;
    Spinner spin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etnama = (EditText) findViewById(R.id.nama);
        rdjk = (RadioGroup) findViewById(R.id.radiogroupjk);
        bta = (CheckBox) findViewById(R.id.bta);
        fo = (CheckBox) findViewById(R.id.fo);
        pramuka = (CheckBox) findViewById(R.id.pramuka);
        bok = (Button) findViewById(R.id.hasil);
        tvh1 = (TextView) findViewById(R.id.h1);
        tvh2 = (TextView) findViewById(R.id.h2);
        tvh3 = (TextView) findViewById(R.id.h3);
        tvh4 = (TextView) findViewById(R.id.h4);
        spin = (Spinner) findViewById(R.id.spin);



    }
}