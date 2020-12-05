package com.example.calculate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_mir, btn_plus, btn_result;
    TextView txt_result;

    private String btnfirst = "";
    private String operator = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_result = (TextView) findViewById(R.id.txt_reult);

        findViewById(R.id.btn_1).setOnClickListener(nClickListener);
        findViewById(R.id.btn_2).setOnClickListener(nClickListener);

        findViewById(R.id.btn_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("test1", String.valueOf(txt_result.getText().toString().length()));
            }
        });
        findViewById(R.id.btn_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button btn = (Button) v;
                String btnclick = (btn.getText().toString());
                txt_result.setText(txt_result.getText().toString()+btnclick);
            }
        });
        findViewById(R.id.btn_3).setOnClickListener(nClickListener);
        findViewById(R.id.btn_4).setOnClickListener(nClickListener);
        findViewById(R.id.btn_5).setOnClickListener(nClickListener);
        findViewById(R.id.btn_6).setOnClickListener(nClickListener);
        findViewById(R.id.btn_7).setOnClickListener(nClickListener);
        findViewById(R.id.btn_8).setOnClickListener(nClickListener);
        findViewById(R.id.btn_9).setOnClickListener(nClickListener);

        findViewById(R.id.btn_mir).setOnClickListener(nClickListener);
        findViewById(R.id.btn_plus).setOnClickListener(nClickListener);
        findViewById(R.id.btn_result).setOnClickListener(nClickListener);

    }

        Button.OnClickListener nClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button btn = (Button) v;
                String btnclick = (btn.getText().toString());

                switch (v.getId()) {
                    case R.id.btn_1:
                    case R.id.btn_2:
                    case R.id.btn_3:
                    case R.id.btn_4:
                    case R.id.btn_5:
                    case R.id.btn_6:
                    case R.id.btn_7:
                    case R.id.btn_8:
                    case R.id.btn_9:
                        txt_result.setText(btn.getText().toString());
                        break;

                }

                switch (btnclick) {
                    case "+":
                    case "-":
                    case "=":
                        if ("".equals(btnfirst)) {

                            btnfirst = txt_result.getText().toString();
                            txt_result.setText("");

                        } else if (!"".equals(operator)) {

                            String btnsecond = txt_result.getText().toString();
                            txt_result.setText("");

                            Integer cal = 0;



                            switch (operator) {
                                case "+":
                                    cal = Integer.parseInt(btnfirst) + Integer.parseInt(btnsecond);
                                    break;

                                case "-":
                                    cal = Integer.parseInt(btnfirst) - Integer.parseInt(btnsecond);
                                    break;
                            }


                            txt_result.setText(String.valueOf(cal));
                            btnfirst = "";

                            if ("=".equals(btnclick)) {
                                operator = "";
                                return;
                            }
                            btnfirst = cal.toString();
                        }
                        operator = btnclick;

                        break;


                }

                }

        };

}














