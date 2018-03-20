package nicholas.chaves.fiscalize;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Conta extends AppCompatActivity {

    private Button logout;
    private ImageButton alteraSenha, telefonesUteis;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conta);

        alteraSenha = (ImageButton) findViewById(R.id.alterasenha);
        logout = (Button) findViewById(R.id.logout);
        telefonesUteis = (ImageButton) findViewById(R.id.telefonesUteis);

        telefonesUteis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Conta.this, Telefones.class));
            }
        });



        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                finish();
                startActivity(new Intent(getApplicationContext(), Informacoes.class));

            }
        });

    }
}
