package nicholas.chaves.fiscalize;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityPrincipal extends AppCompatActivity {

    private EditText protocolo;
    private Button consultar;
    private FloatingActionButton menu, conta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        protocolo = (EditText) findViewById(R.id.protocolo);
        consultar = (Button) findViewById(R.id.botaoConsultar);

        consultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(protocolo.getText().toString().isEmpty()){
                    Toast.makeText(ActivityPrincipal.this, "Favor, digitar o número do processo.", Toast.LENGTH_SHORT).show();
                } else {
                    String resultado = protocolo.getText().toString();
                    Intent intent = new Intent(ActivityPrincipal.this, Consulta.class);
                    intent.putExtra("resultado", resultado);
                    startActivity(intent);
                    protocolo.setText("");
                    //Toast.makeText(ActivityPrincipal.this, "Sistema em construção. \nObrigado pela compreensão.", Toast.LENGTH_SHORT).show();
            }
            }
        });

        menu = (FloatingActionButton) findViewById(R.id.menu);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Menu.class));
            }
        });

        conta = (FloatingActionButton) findViewById(R.id.conta);
        conta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Conta.class));
            }
        });

    }
}
