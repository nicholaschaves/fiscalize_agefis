package nicholas.chaves.fiscalize;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText email, password;
    private Button entrar;
    private CheckBox lembrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        entrar = (Button) findViewById(R.id.botaoEntrar);
        lembrar = (CheckBox) findViewById(R.id.lembrarDados);

          entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (email.getText().toString().isEmpty() || password.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Digite seu email ou senha!", Toast.LENGTH_SHORT).show();
                } else if (email.getText().toString().equals("nicholaschaves")){
                        if(password.getText().toString().equals("123")) {
                            startActivity(new Intent(getApplicationContext(), ActivityPrincipal.class));
                            email.setText("");
                            password.setText("");
                            lembrar.setChecked(false);
                        } else {
                            password.setError("Digite a sua senha");
                            Toast.makeText(MainActivity.this, "Senha incorreta!", Toast.LENGTH_LONG).show();
                        }
                } else {
                    email.setError("Digite um email válido");
                    Toast.makeText(MainActivity.this, "Email incorreto!", Toast.LENGTH_LONG).show();


                }
            }
        });
    }
}
