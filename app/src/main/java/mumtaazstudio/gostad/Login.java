package mumtaazstudio.gostad;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.renderscript.Sampler;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class Login extends AppCompatActivity {

    private Button btnlogin;
    private EditText etNomorHandphone;
    private LinearLayout layRegister;

    private TextWatcher mTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override
        public void afterTextChanged(Editable editable) {
            // check Fields For Empty Values
            checkFieldsForEmptyValues();
        }
    };

    @SuppressLint("NewApi")
    void checkFieldsForEmptyValues(){
        Button b = (Button) findViewById(R.id.btn_login);

        String s1 = etNomorHandphone.getText().toString();

        Drawable buttonBackground = b.getBackground();

        if(s1.equals("")){
            b.setEnabled(false);
            b.getBackground().setColorFilter(Color.GRAY, PorterDuff.Mode.DARKEN);
        } else {
            b.setEnabled(true);
            b.getBackground().setColorFilter(0xFF27AE60, PorterDuff.Mode.OVERLAY);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnlogin = (Button) findViewById(R.id.btn_login);
        etNomorHandphone = (EditText) findViewById(R.id.et_nomorHandphone);

        layRegister = (LinearLayout) findViewById(R.id.lay_register);
        layRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login.this, Register.class));
            }
        });

        // set listener
        etNomorHandphone.addTextChangedListener(mTextWatcher);

        // run once to disable if empty
        checkFieldsForEmptyValues();

    }
}
