package ca.johnoluwale.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity{
    EditText editTextInput;
    String operationProcess;
    Button buttonClr, buttonDel, buttonEqual;
    Button buttonAdd, buttonSub, buttonMult, buttonDiv;
    Button buttonOne, buttonTwo, buttonThree;
    Button buttonFour, buttonFive, buttonSix;
    Button buttonSeven, buttonEight, buttonNine, buttonZero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextInput = findViewById(R.id.editTextInputField);
        buttonClr = findViewById(R.id.buttonClear);
        buttonDel = findViewById(R.id.buttonBackspace);
        buttonEqual = findViewById(R.id.buttonEquals);
        buttonAdd = findViewById(R.id.buttonAddition);
        buttonSub = findViewById(R.id.buttonSubtraction);
        buttonMult = findViewById(R.id.buttonMultiplication);
        buttonDiv = findViewById(R.id.buttonDivide);
        buttonOne = findViewById(R.id.buttonOne);
        buttonTwo = findViewById(R.id.buttonTwo);
        buttonThree = findViewById(R.id.buttonThree);
        buttonFour = findViewById(R.id.buttonFour);
        buttonFive = findViewById(R.id.buttonFive);
        buttonSix = findViewById(R.id.buttonSix);
        buttonSeven = findViewById(R.id.buttonSeven);
        buttonEight = findViewById(R.id.buttonEight);
        buttonNine = findViewById(R.id.buttonNine);
        buttonZero = findViewById(R.id.buttonZero);

        buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operationProcess = editTextInput.getText().toString();
                editTextInput.setText(operationProcess + "0");
            }
        });

        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operationProcess = editTextInput.getText().toString();
                editTextInput.setText(operationProcess + "1");
            }
        });

        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operationProcess = editTextInput.getText().toString();
                editTextInput.setText(operationProcess + "2");
            }
        });

        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operationProcess = editTextInput.getText().toString();
                editTextInput.setText(operationProcess + "3");
            }
        });

        buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operationProcess = editTextInput.getText().toString();
                editTextInput.setText(operationProcess + "4");
            }
        });

        buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operationProcess = editTextInput.getText().toString();
                editTextInput.setText(operationProcess + "5");
            }
        });

        buttonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operationProcess = editTextInput.getText().toString();
                editTextInput.setText(operationProcess + "6");
            }
        });

        buttonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operationProcess = editTextInput.getText().toString();
                editTextInput.setText(operationProcess + "7");
            }
        });

        buttonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operationProcess = editTextInput.getText().toString();
                editTextInput.setText(operationProcess + "8");
            }
        });

        buttonNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operationProcess = editTextInput.getText().toString();
                editTextInput.setText(operationProcess + "9");
            }
        });

        buttonClr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextInput.setText("");
            }
        });
    }
}