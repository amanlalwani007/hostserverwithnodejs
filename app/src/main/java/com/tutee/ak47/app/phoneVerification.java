package com.tutee.ak47.app;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.PhoneAuthProvider;

public class phoneVerification extends AppCompatActivity {

    private TextView phoneNumber;
    private EditText verifictionCode;
    private Button sendVerifictionCode, verify;
    private PhoneAuthProvider.OnVerificationStateChangedCallbacks mCallbacks;
    private String mVerificationId;
    private PhoneAuthProvider.ForceResendingToken mResendToken;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.tutee.ak47.app.R.layout.activity_phone_verification);
        Initialization();

        phoneNumber.setText(getIntent().getStringExtra("P_number"));

        sendVerifictionCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendVerifictionCode.setVisibility(View.INVISIBLE);
                verify.setVisibility(View.VISIBLE);
                verifictionCode.setVisibility(View.VISIBLE);

            }
        });

    }



    private void Initialization() {
        phoneNumber = (TextView) findViewById(com.tutee.ak47.app.R.id.phone_number);
        verifictionCode = findViewById(com.tutee.ak47.app.R.id.number_Verification);
        sendVerifictionCode = findViewById(com.tutee.ak47.app.R.id.send_verifiction_code);
        verify = findViewById(com.tutee.ak47.app.R.id.verify);
    }

}

