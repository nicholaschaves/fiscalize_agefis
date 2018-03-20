package nicholas.chaves.fiscalize;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class CadastroDemanda extends Activity {

    private EditText nome, endereco, numero, bairro;
    private ImageButton cadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_demanda);

        nome = (EditText) findViewById(R.id.nome);
        endereco = (EditText) findViewById(R.id.endereco);
        numero = (EditText) findViewById(R.id.numero);
        bairro = (EditText) findViewById(R.id.bairro);
        cadastrar = (ImageButton) findViewById(R.id.cadastrar);

        cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CadastroDemanda.this, "Ainda não é possível cadastrar demandas.", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
