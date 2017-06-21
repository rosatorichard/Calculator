package com.example.android.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private StringBuilder currentNum=new StringBuilder("");;
    private StringBuilder oldNum=new StringBuilder("");;
    private String calc="";
    private double sum=0;
    private TextView text;
    private Boolean isTrue=false;
    private Boolean on=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView)findViewById(R.id.tvOutput);
    }

    public void zero(View view) {
        if(isTrue==true)
        {
            newCalc();
        }
        on=false;
        currentNum.append("0");
        text.setText(oldNum+calc+currentNum);
    }

    public void one(View view) {
        if(isTrue==true)
        {
            newCalc();
        }
        on=false;
        currentNum.append("1");
        text.setText(oldNum+calc+currentNum);
    }

    public void two(View view) {
        if(isTrue==true)
        {
            newCalc();
        }
        on=false;
        currentNum.append("2");
        text.setText(oldNum+calc+currentNum);
    }

    public void three(View view) {
        if(isTrue==true)
        {
            newCalc();
        }
        on=false;
        currentNum.append("3");
        text.setText(oldNum+calc+currentNum);
    }

    public void four(View view) {
        if(isTrue==true)
        {
            newCalc();
        }
        on=false;
        currentNum.append("4");
        text.setText(oldNum+calc+currentNum);
    }

    public void five(View view) {
        if(isTrue==true)
        {
            newCalc();
        }
        on=false;
        currentNum.append("5");
        text.setText(oldNum+calc+currentNum);
    }

    public void six(View view) {
        if(isTrue==true)
        {
            newCalc();
        }
        on=false;
        currentNum.append("6");
        text.setText(oldNum+calc+currentNum);
    }

    public void seven(View view) {
        if(isTrue==true)
        {
            newCalc();
        }
        on=false;
        currentNum.append("7");
        text.setText(oldNum+calc+currentNum);
    }

    public void eight(View view) {
        if(isTrue==true)
        {
            newCalc();
        }
        on=false;
        currentNum.append("8");
        text.setText(oldNum+calc+currentNum);

    }

    public void nine(View view) {
        if(isTrue==true)
        {
            newCalc();
        }
        on=false;
        currentNum.append("9");
        text.setText(oldNum+calc+currentNum);
    }

    public void point(View view) {

        if(isTrue==true)
        {
            newCalc();
        }
        if(currentNum.toString().contains("."))
        {

        }
        else
        {
            currentNum.append(".");
            text.setText((oldNum+calc+currentNum));
        }
        on=false;
    }

    public void minus(View view) {

        if(currentNum.length()==0 && oldNum.length()==0 || on==true)
        {

        }
        else if(currentNum.length()!=0 ||currentNum.length()==0&& oldNum.length()!=0){
            if (calc != "" || isTrue==true) {
                on=true;
                isTrue=false;
                switch (calc) {
                    case " + ":
                        sum = Double.parseDouble(oldNum.toString()) + Double.parseDouble(currentNum.toString());
                        break;

                    case " - ":
                        sum = Double.parseDouble(oldNum.toString()) - Double.parseDouble(currentNum.toString());
                        break;

                    case " x ":
                        sum = Double.parseDouble(oldNum.toString()) * Double.parseDouble(currentNum.toString());
                        break;

                    case " / ":
                        sum = Double.parseDouble(oldNum.toString()) / Double.parseDouble(currentNum.toString());
                        break;

                }
                calc = " - ";
                oldNum.setLength(0);
                oldNum.append(sum);
                currentNum.setLength(0);

            } else {
                oldNum.append(currentNum);
                calc = " - ";
                currentNum.setLength(0);

            }
        }
        text.setText(oldNum+calc+currentNum);
    }

    public void plus(View view) {

        if(currentNum.length()==0 && oldNum.length()==0 || on==true)
        {

        }
        else if(currentNum.length()!=0 ||currentNum.length()==0&& oldNum.length()!=0){
            if (calc != "" || isTrue==true) {
                isTrue=false;
                on=true;
                switch (calc) {
                    case " + ":
                        sum = Double.parseDouble(oldNum.toString()) + Double.parseDouble(currentNum.toString());
                        break;

                    case " - ":
                        sum = Double.parseDouble(oldNum.toString()) - Double.parseDouble(currentNum.toString());
                        break;

                    case " x ":
                        sum = Double.parseDouble(oldNum.toString()) * Double.parseDouble(currentNum.toString());
                        break;

                    case " / ":
                        sum = Double.parseDouble(oldNum.toString()) / Double.parseDouble(currentNum.toString());
                        break;

                }
                calc = " + ";
                oldNum.setLength(0);
                oldNum.append(sum);
                currentNum.setLength(0);

            } else {
                oldNum.append(currentNum);
                calc = " + ";
                currentNum.setLength(0);

            }
        }
        text.setText(oldNum+calc+currentNum);
    }

    public void times(View view) {


        if(currentNum.length()==0 && oldNum.length()==0 || on==true)
        {

        }
        else if(currentNum.length()!=0 ||currentNum.length()==0&& oldNum.length()!=0){
            if (calc != "" || isTrue==true) {
                on=true;
                isTrue=false;
                switch (calc) {
                    case " + ":
                        sum = Double.parseDouble(oldNum.toString()) + Double.parseDouble(currentNum.toString());
                        break;

                    case " - ":
                        sum = Double.parseDouble(oldNum.toString()) - Double.parseDouble(currentNum.toString());
                        break;

                    case " x ":
                        sum = Double.parseDouble(oldNum.toString()) * Double.parseDouble(currentNum.toString());
                        break;

                    case " / ":
                        sum = Double.parseDouble(oldNum.toString()) / Double.parseDouble(currentNum.toString());
                        break;

                }
                calc = " x ";
                oldNum.setLength(0);
                oldNum.append(sum);
                currentNum.setLength(0);

            } else {
                oldNum.append(currentNum);
                calc = " x ";
                currentNum.setLength(0);

            }
        }
        text.setText(oldNum+calc+currentNum);
    }

    public void divide(View view) {


        if(currentNum.length()==0 && oldNum.length()==0 || on==true)
        {

        }
        else if(currentNum.length()!=0 ||currentNum.length()==0&& oldNum.length()!=0){
            if (calc != "" || isTrue==true) {
                on=true;
                isTrue=false;
                switch (calc) {
                    case " + ":
                        sum = Double.parseDouble(oldNum.toString()) + Double.parseDouble(currentNum.toString());
                        break;

                    case " - ":
                        sum = Double.parseDouble(oldNum.toString()) - Double.parseDouble(currentNum.toString());
                        break;

                    case " x ":
                        sum = Double.parseDouble(oldNum.toString()) * Double.parseDouble(currentNum.toString());
                        break;

                    case " / ":
                        sum = Double.parseDouble(oldNum.toString()) / Double.parseDouble(currentNum.toString());
                        break;

                }
                calc = " / ";
                oldNum.setLength(0);
                oldNum.append(sum);
                currentNum.setLength(0);

            } else {
                oldNum.append(currentNum);
                calc = " / ";
                currentNum.setLength(0);

            }
        }
        text.setText(oldNum+calc+currentNum);
    }

    public void clear(View view) {

        oldNum.setLength(0);
        currentNum.setLength(0);
        calc="";
        text.setText(oldNum+calc+currentNum);
    }

        public void percentage(View view) {

            if(currentNum.length()==0)
            {
                if(oldNum.length()==0)
                {

                }
                else
                {
                    sum = Double.parseDouble(oldNum.toString()) * .01;
                    oldNum.setLength(0);
                    oldNum.append(sum);
                }
            }
            else
            {
                sum=Double.parseDouble(currentNum.toString())*.01;
                currentNum.setLength(0);
                currentNum.append(sum);
            }
            text.setText(oldNum+calc+currentNum);

    }

    public void delete(View view) {

        if(currentNum.length()!=0)
        {
            currentNum.setLength(currentNum.length()-1);
        }
        text.setText(oldNum+calc+currentNum);
    }

    public void equals(View view) {

        if(currentNum.length()==0 && oldNum.length()==0)
        {

        }
        else if(currentNum.length()!=0) {
            on=false;
            if (calc != "") {
                switch (calc) {
                    case " + ":
                        sum = Double.parseDouble(oldNum.toString()) + Double.parseDouble(currentNum.toString());
                        break;

                    case " - ":
                        sum = Double.parseDouble(oldNum.toString()) - Double.parseDouble(currentNum.toString());
                        break;

                    case " x ":
                        sum = Double.parseDouble(oldNum.toString()) * Double.parseDouble(currentNum.toString());
                        break;

                    case " / ":
                        sum = Double.parseDouble(oldNum.toString()) / Double.parseDouble(currentNum.toString());
                        break;

                }
                calc = "";
                oldNum.setLength(0);
                oldNum.append(sum);
                currentNum.setLength(0);
            }
            isTrue = true;
            text.setText(oldNum + calc + currentNum);
        }

    }

    public void newCalc()
    {
        oldNum.setLength(0);
        currentNum.setLength(0);
        isTrue=false;
    }

}
