package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public EditText edit;
    public Button button;
    public TextView textveiw;
   public String mull = "";

    StringBuilder s = new StringBuilder(100);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit = findViewById(R.id.editText);
        button = findViewById(R.id.button);
        textveiw = findViewById(R.id.textView3);
    }
    public void multiply(View reverse){


        String[] array1 = new String[4];
        array1[0] = "uday";
        array1[1]= "uday1";
        array1[2]= "uday2";
        array1[3]= "uday4";
for(String uert : array1){}








//        String mull = "";
//        String input = edit.getText().toString();
//        char[] wordarray = input.toCharArray();
//        for(int index = wordarray.length-1;index>=0;index--){
//            mull = mull + wordarray[index];
//        }
//
//textveiw.setText(mull);
//        byte [] strAsByteArray = input.getBytes();
//
//        byte [] result =
//                new byte [strAsByteArray.length];
//
//        for (int i = 0; i<strAsByteArray.length; i++)
//            result[i] =
//                    strAsByteArray[strAsByteArray.length-i-1];
//        textveiw.setText(new String(result));

        //System.out.println(new String(result));








//        String input = edit.getText().toString();
//        StringBuilder s = new StringBuilder();
//        s.append(input);
//        s= s.reverse();
//        textveiw.setText(s);









//        StringBuilder s = new StringBuilder(100);
//        String word = edit.getText().toString();
//        int strlen = word.length();
//        for (int i=(strlen-1);i>=0;i--){
//            textveiw.setText(word.charAt(i));

       // }
    }

//    public void multiply(View mul){
//        mull = "";
//
//        int num = Integer.parseInt(edit.getText().toString());
//        for(int i=1;i<11;i++){
//            int num1 = num*i;
//            //mull = mull + num1 + "\n";
//
//            mull = mull + num + "*" + i + "=" + num1 + "\n";
//        }
//        textveiw.setText(mull);
//
//    }
}
