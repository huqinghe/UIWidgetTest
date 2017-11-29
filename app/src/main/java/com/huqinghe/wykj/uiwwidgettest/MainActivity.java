package com.huqinghe.wykj.uiwwidgettest;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editTextmy;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("mytag=====", "onCreate:=============================== ");
        editTextmy = (EditText)findViewById(R.id.textView);
        imageView = (ImageView) findViewById(R.id.imageView);
        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId())
                {
//                    case R.id.button:
//                        String string = editTextmy.getText().toString();
//                        Toast.makeText(MainActivity.this,string,Toast.LENGTH_SHORT).show();
//                        break;

//                    case R.id.button:
//                        imageView.setImageResource(R.drawable.nv_2);
//                        break;

//                    case R.id.button:
//                        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
//                        builder.setTitle("This is a title");
//                        builder.setCancelable(false);
//                        builder.setPositiveButton("OK1", new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialog, int which) {
//                                Log.i("tag", "onClick: ====1111111");
//                            }
//                        });
//                        builder.setNeutralButton("cancel", new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialog, int which) {
//                                Log.i("tag", "onClick: ========2222");
//                            }
//                        });
//                        builder.show();
//                        break;

                    case R.id.button:

                        break;
                }
            }
        });
    }
}
