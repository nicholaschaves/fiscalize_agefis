package nicholas.chaves.fiscalize;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Consulta extends AppCompatActivity {

    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consulta);

        resultado = (TextView) findViewById(R.id.consultaResultado);

        Bundle extra = getIntent().getExtras();

        if(extra != null){
            String resultadoNovo = extra.getString("resultado");
            resultado.setText("O processo de número " + resultadoNovo + " não consta em nossa base de dados. Favor, informar um número válido.");
        }
    }
}
