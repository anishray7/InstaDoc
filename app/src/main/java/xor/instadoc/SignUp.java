package xor.instadoc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignUp extends AppCompatActivity {

    EditText email,password,confirmpassword;

    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        TextView textView=(TextView) findViewById(R.id.confirmtext);

        email = (EditText) findViewById(R.id.email);

        password = (EditText) findViewById(R.id.passwordlogin);

        confirmpassword = (EditText) findViewById(R.id.confirmpassword);

        firebaseAuth = FirebaseAuth.getInstance();



        final AutoCompleteTextView gender = (AutoCompleteTextView) findViewById(R.id.autogender);
        final AutoCompleteTextView blood = (AutoCompleteTextView) findViewById(R.id.autoblood);

        ImageView image1 = (ImageView) findViewById(R.id.dropimage);
        ImageView image2 = (ImageView) findViewById(R.id.dropimage2);

        gender.setThreshold(1);
        blood.setThreshold(1);

        final String[] genders = new String[]{"Male","Female","Others"};
        final String[] bloods = new String[]{"B+","O+","AB+","A+","A-","O-","B-","AB-"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,genders);
        gender.setAdapter(adapter);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,bloods);
        blood.setAdapter(adapter2);

        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gender.showDropDown();
            }
        });

        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                blood.showDropDown();
            }
        });

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String em =  email.getText().toString().trim();
                String pass =  password.getText().toString().trim();
                String cpass =  confirmpassword.getText().toString().trim();

                if(em.isEmpty())
                {
                    email.setError("Enter E-Mail ID");
                    email.requestFocus();
                }
                else if(pass.isEmpty())
                {
                    password.setError("Enter Password");
                    password.requestFocus();
                }
                else if(cpass.isEmpty())
                {
                    confirmpassword.setError("Enter Confirm Password");
                    confirmpassword.requestFocus();
                }
                else if(!(cpass.equals(pass)))
                {
                    Toast.makeText(SignUp.this,"Passwords Not Same",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    firebaseAuth.createUserWithEmailAndPassword(em, pass)
                            .addOnCompleteListener(SignUp.this, new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isSuccessful()) {

                                        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                                        startActivity(intent);

                                        // Sign in success, update UI with the signed-in user's information

                                    } else {

                                        Toast.makeText(SignUp.this,"Sign Up Failed",Toast.LENGTH_SHORT).show();
                                        // If sign in fails, display a message to the user.

                                    }

                                    // ...
                                }
                            });
                }

            }
        });
    }
}
