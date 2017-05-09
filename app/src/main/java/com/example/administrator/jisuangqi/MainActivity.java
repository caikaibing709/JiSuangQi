package com.example.administrator.jisuangqi;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import org.w3c.dom.Text;

public class MainActivity extends Activity {
    //文本框对象
    private EditText editText;
    //变量
    private String s1 = "0";
    private String s2 = "0";
    private String Text = "";
    private String j = "0";
    private double d1 = 0;
    private double d2 = 0;
    private int k = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.editText = (EditText) findViewById(R.id.editText);
        this.editText.setText("");
    }

    public void duqu(String s) {
        if (k == 1) {
            s1 = s1 + s;
        } else if (k == 2) {
            s2 = s2 + s;
        }
    }

    public void JiSuang(String s) {
        d1 = Double.parseDouble(s1);
        d2 = Double.parseDouble(s2);
        if (s == "+") {
            s1 = Double.toString((d1 + d2));
            Text = s1;
            editText.setText(Text);
            s2 = "0";
        } else if (s == "-") {
            s1 = Double.toString((d1 - d2));
            Text = s1;
            editText.setText(Text);
            s2 = "0";
        } else if (s == "x") {
            s1 = Double.toString((d1 * d2));
            Text = s1;
            editText.setText(Text);
            s2 = "0";
        } else if (s == "/") {
            if (s2=="0"){
                s1 = "0";
                s2 = "0";
                Text = "";
                d1 = 0;
                d2 = 0;
                k = 1;
                editText.setText(Text);
            }
            else {
                s1 = Double.toString((d1 / d2));
                Text = s1;
                editText.setText(Text);
                s2 = "0";
                j="0";
            }
        } else if (s == "=") {
            JiSuang(j);
        }

    }

    public void DianJi(View v) {
        int id = v.getId();
        if (id == R.id.SZ_0) {
            duqu("0");
            Text = Text + "0";
            editText.setText(Text);
        }else if (id == R.id.FH_Diang) {
            duqu(".");
            Text = Text + ".";
            editText.setText(Text);
        } else if (id == R.id.SZ_1) {
            duqu("1");
            Text = Text + "1";
            editText.setText(Text);
        } else if (id == R.id.SZ_2) {
            duqu("2");
            Text = Text + "2";
            editText.setText(Text);
        } else if (id == R.id.SZ_3) {
            duqu("3");
            Text = Text + "3";
            editText.setText(Text);
        } else if (id == R.id.SZ_4) {
            duqu("4");
            Text = Text + "4";
            editText.setText(Text);
        } else if (id == R.id.SZ_5) {
            duqu("5");
            Text = Text + "5";
            editText.setText(Text);
        } else if (id == R.id.SZ_6) {
            duqu("6");
            Text = Text + "6";
            editText.setText(Text);
        } else if (id == R.id.SZ_7) {
            duqu("7");
            Text = Text + "7";
            editText.setText(Text);
        } else if (id == R.id.SZ_8) {
            duqu("8");
            Text = Text + "8";
            editText.setText(Text);
        } else if (id == R.id.SZ_9) {
            duqu("9");
            Text = Text + "9";
            editText.setText(Text);
        } else if (id == R.id.FH_jia) {
            if (s1=="0")
            {
                Text ="0";
            }
            if (k == 1) k = 2;
            else if (k == 2) JiSuang(j);
            j="+";
            Text = Text + "+";
            editText.setText(Text);

        } else if (id == R.id.FH_jiang) {
            if (s1=="0")
            {
                Text ="0";
            }
            if (k == 1) k = 2;
            else if (k == 2) JiSuang(j);
            j="-";
            Text = Text + "-";
            editText.setText(Text);
        } else if (id == R.id.FH_cheng) {
            if (s1=="0")
            {
                Text ="0";
            }
            if (k == 1) k = 2;
            else if (k == 2) JiSuang(j);
            j="x";
            Text = Text + "x";
            editText.setText(Text);
        } else if (id == R.id.FH_chu) {
            if (s1 == "0") {
                Text = "0";
            }
            if (k == 1) k = 2;
            else if (k == 2) JiSuang(j);
            j = "/";
            if (s2=="0") {
                Text = Text + "/";
                editText.setText(Text);
            }
        } else if (id == R.id.FH_deng) {
           JiSuang("=");
            j="0";
        } else if (id == R.id.FH_C) {
            s1 = "0";
            s2 = "0";
            Text = "";
            d1 = 0;
            d2 = 0;
            k = 1;
            j="0";
            editText.setText(Text);
        }

    }
}
