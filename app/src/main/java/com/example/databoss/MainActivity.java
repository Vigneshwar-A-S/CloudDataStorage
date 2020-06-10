package com.example.databoss;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    EditText name, fname, mname, id, pwd, address, phone, dj, dr;

    Button add;

    DatabaseReference reff;

    Member member;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.tname);
        fname = (EditText) findViewById(R.id.tfather);
        mname = (EditText) findViewById(R.id.tmother);
        id = (EditText) findViewById(R.id.tid);
        pwd = (EditText) findViewById(R.id.tpassword);
        address = (EditText) findViewById(R.id.taddress);
        dj = (EditText) findViewById(R.id.tjoindate);
        dr = (EditText) findViewById(R.id.tdaterequest);
        phone = (EditText) findViewById(R.id.tphone);
        member = new Member();
        reff= FirebaseDatabase.getInstance().getReference().child("Member");
        add = (Button) findViewById(R.id.addbtn);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            member.setName(name.getText().toString().trim());
            member.setFather_Name(fname.getText().toString().trim());
            member.setMother_Name(mname.getText().toString().trim());
            member.setID(id.getText().toString().trim());
            member.setPassword(pwd.getText().toString().trim());
            member.setDateJoined(dj.getText().toString().trim());
            member.setDateRequest(dr.getText().toString().trim());
            member.setAddress(address.getText().toString().trim());
            member.setPhoneNumber(phone.getText().toString().trim());
            reff.push().setValue(member);
            Toast.makeText(MainActivity.this, "Data inserted Successfully!", Toast.LENGTH_SHORT).show();

            name.setText("");
                fname.setText("");
                mname.setText("");
                id.setText("");
                pwd.setText("");
                dj.setText("");
                dr.setText("");
                address.setText("");
                phone.setText("");


            }
        });




    }
}
