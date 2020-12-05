package com.example.arithmometer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView btn_result;

    String btn_first = "";
    String operator = "null";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_1).setOnClickListener(bClickListener);
        findViewById(R.id.btn_2).setOnClickListener(bClickListener);
        findViewById(R.id.btn_3).setOnClickListener(bClickListener);
        findViewById(R.id.btn_4).setOnClickListener(bClickListener);
        findViewById(R.id.btn_5).setOnClickListener(bClickListener);
        findViewById(R.id.btn_6).setOnClickListener(bClickListener);
        findViewById(R.id.btn_7).setOnClickListener(bClickListener);
        findViewById(R.id.btn_8).setOnClickListener(bClickListener);
        findViewById(R.id.btn_9).setOnClickListener(bClickListener);

        findViewById(R.id.btn_minus).setOnClickListener(bClickListener);
        findViewById(R.id.btn_plus).setOnClickListener(bClickListener);
        findViewById(R.id.btn_equals).setOnClickListener(bClickListener);

        btn_result = (TextView) findViewById(R.id.btn_result);
    }

        Button.OnClickListener bClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button btn = (Button) v;
                String btn_click = (btn.getText().toString());

                        switch(v.getId()) {
                            case R.id.btn_1:
                            case R.id.btn_2:
                            case R.id.btn_3:
                            case R.id.btn_4:
                            case R.id.btn_5:
                            case R.id.btn_6:
                            case R.id.btn_7:
                            case R.id.btn_8:
                            case R.id.btn_9:
                                btn_result.setText(btn_result.getText().toString()+btn_click);
                                break;
                        }

                        switch(btn_click) {
                            case "-":
                            case "+":
                            case "=":

                                if("".equals(btn_first)) {
                                    btn_first = btn_result.getText().toString();
                                    btn_result.setText("");

                                }else
                                    if(!"".equals(operator)) {
                                        String btn_second = btn_result.getText().toString();
                                        btn_result.setText("");

                                        Integer cal = 0;

                                        switch(operator) {
                                            case "-":
                                                cal = Integer.parseInt(btn_first) - Integer.parseInt(btn_second);
                                                break;

                                            case "+":
                                                cal = Integer.parseInt(btn_first) + Integer.parseInt(btn_second);
                                                break;
                                        }

                                        btn_result.setText(cal.toString());
                                        btn_first = "";

                                        if("=".equals(btn_click)){
                                            operator = "";
                                            return;
                                        }
                                        btn_first = cal.toString();


                            }
                                    operator = btn_click;

                                    break;
                        }








            }


        };












}