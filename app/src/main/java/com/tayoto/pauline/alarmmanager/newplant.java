package com.tayoto.pauline.alarmmanager;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class newplant extends AppCompatActivity {

    EditText input;
    Button newplantBtn;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newplant);

        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("Personal Details");
        builder.setIcon(R.drawable.ic_launcher_background);
        builder.setMessage("Enter Plant Name");

        input=new EditText(this);
        builder.setView(input);

        //SET POSITIVE BUTTON
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String txt=input.getText().toString();
                Toast.makeText(getApplicationContext(), txt, Toast.LENGTH_LONG).show();
            }
        });

        //NEGATIVE BUTTON
        builder.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        //CREATE THE DIALOG
        final AlertDialog ad=builder.create();

        //BUTTON
        newplantBtn=(Button) findViewById(R.id.newplantBtn);
        newplantBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ad.show();
            }
        });
    }
/**
    public boolean onCreateOptionMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
 **/
}
