package xor.instadoc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    TextView textView2;

    EditText username;
    EditText password;

    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=(TextView) findViewById(R.id.signup);
        textView2=(TextView) findViewById(R.id.login);
        username=(EditText) findViewById(R.id.username);
        password=(EditText) findViewById(R.id.passwordlogin);

        firebaseAuth = FirebaseAuth.getInstance();

        textView.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),SignUp.class);
                startActivity(intent);
            }
        });

        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String em = username.getText().toString().trim();
                String pass = password.getText().toString().trim();


                if (em.isEmpty()) {
                    username.setError("Enter E-Mail ID");
                    username.requestFocus();
                } else if (pass.isEmpty()) {
                    password.setError("Enter Password");
                    password.requestFocus();
                } else {
                    firebaseAuth.signInWithEmailAndPassword(em, pass)
                            .addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isSuccessful()) {
                                        Intent intent = new Intent(getApplicationContext(), Home2.class);
                                        startActivity(intent);

                                    } else {
                                        Toast.makeText(MainActivity.this, "Incorrect Credentials", Toast.LENGTH_SHORT).show();
                                    }

                                    // ...
                                }
                            });


                }
            }
        });


    }

}
