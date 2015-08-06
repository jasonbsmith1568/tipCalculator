package com.smith.jason.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.widget.TextView.OnEditorActionListener;

public class tipCalculatorActivity extends AppCompatActivity
implements OnEditorActionListener, OnClickListener{

    //define variables for the widgets
    private TextView percentTextView;
    private EditText billAmountEditText;
    private TextView tipTextView;
    private TextView totalTextView;
    private Button percentUpButton;
    private Button percentDownButton;
    private Button resetButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_calculator);


        //get references to the widgets
        billAmountEditText = (EditText) findViewById(R.id.billAmountEditText);
        percentTextView = (TextView) findViewById(R.id.percentTextView);
        percentUpButton = (Button) findViewById(R.id.percentUpButton);
        percentDownButton = (Button) findViewById(R.id.percentDownButton);
        tipTextView = (TextView) findViewById(R.id.tipPercentView);
        totalTextView = (TextView) findViewById(R.id.totalTextView);
        resetButton = (Button) findViewById(R.id.resetButton);

        //set the listeners
        billAmountEditText.setOnEditorActionListener(this);
        percentTextView.setOnEditorActionListener(this);
        tipTextView.setOnEditorActionListener(this);
        totalTextView.setOnEditorActionListener(this);
        percentUpButton.setOnClickListener(this);
        percentUpButton.setOnClickListener(this);
        resetButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
        return false;
    }
}
