package com.itsoch.survey;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView religion;
    private EditText editname;
    private EditText editcaste;
    private EditText editreligion;
    private TextView phone;
    private EditText editphone;
    private TextView tapfitted;
    private TextView yes;
    private TextView no;
    private TextView abroad;
    private EditText editabroad;
    private TextView wifi;
    private TextView yes1;
    private TextView no1;
    private TextView familymembers;
    private EditText editfamilymembers;
    private TextView monthlyincome;
    private EditText editincome;
    private Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.genderlist, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        TextView religion = (TextView) findViewById(R.id.religion);
        EditText editname = (EditText) findViewById(R.id.EditTextName);
        EditText editcaste = (EditText) findViewById(R.id.editcaste);
        EditText editreligion = (EditText) findViewById(R.id.editTextreligion);
        TextView phone = (TextView) findViewById(R.id.phone);
        EditText editphone = (EditText) findViewById(R.id.editTextphone);
        TextView tapfitted = (TextView) findViewById(R.id.tapFitted);
        TextView yes = (TextView) findViewById(R.id.yes);
        TextView no = (TextView) findViewById(R.id.no);
        TextView abroad = (TextView) findViewById(R.id.abroad);
        EditText editabroad = (EditText) findViewById(R.id.editAbroad);
        TextView wifi = (TextView) findViewById(R.id.wifi);
        TextView yes1 = (TextView) findViewById(R.id.yes1);
        TextView no1 = (TextView) findViewById(R.id.no1);
        TextView familymembers = (TextView) findViewById(R.id.familymembers);
        EditText editfamilymembers = (EditText) findViewById(R.id.editfamilymembers);
        TextView monthlyincome = (TextView) findViewById(R.id.monthlyincome);
        EditText editincome = (EditText) findViewById(R.id.editIncome);
        Button button = (Button) findViewById(R.id.ButtonSendFeedback);


        final CheckBox c1 = (CheckBox) findViewById(R.id.checkBox);
        final CheckBox c2 = (CheckBox) findViewById(R.id.checkBox2);
        final CheckBox c3 = (CheckBox) findViewById(R.id.checkBox3);
        final CheckBox c4 = (CheckBox) findViewById(R.id.checkBox4);

        c1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                c2.setChecked(false);
                c1.setChecked(b);
            }
        });
        c2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                c1.setChecked(false);
                c2.setChecked(b);
            }
        });

        c3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                c4.setChecked(false);
                c3.setChecked(b);
            }
        });
        c4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                c3.setChecked(false);
                c4.setChecked(b);
            }
        });
    }

}
