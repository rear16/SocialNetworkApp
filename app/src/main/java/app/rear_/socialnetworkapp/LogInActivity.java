package app.rear_.socialnetworkapp;

import android.content.Intent;
import android.os.PatternMatcher;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import app.rear_.socialnetworkapp.model.UserRow;

public class LogInActivity extends AppCompatActivity {


    EditText et_mail, et_pass;
    Button btn_sign_in, btn_exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        getSupportActionBar().hide();

        btn_sign_in = findViewById(R.id.btn_sign_in);
        btn_exit = findViewById(R.id.btn_exit);
        et_mail = findViewById(R.id.et_mail);
        et_pass = findViewById(R.id.et_pass);
        btn_sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserRow row = new UserRow();
                row.setUse_mail(et_mail.getText().toString());
                row.setUse_pass(et_pass.getText().toString());
                if(Patterns.EMAIL_ADDRESS.matcher(row.getUse_mail()).matches() && row.getUse_pass().trim() != "") {
                    Intent intent = new Intent(getApplicationContext(), PostActivity.class);
                    startActivity(intent);
                }else
                    Toast.makeText(getApplicationContext(), "Invalid email", Toast.LENGTH_SHORT).show();
            }
        });
        btn_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }


}
