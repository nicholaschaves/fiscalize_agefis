package nicholas.chaves.fiscalize;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Menu extends AppCompatActivity {

    private ImageButton addD, searchD, addOS, searchOs, addFisc, searchFisc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        addD = (ImageButton) findViewById(R.id.addDemanda);
        searchD = (ImageButton) findViewById(R.id.searchDemanda);
        addOS = (ImageButton) findViewById(R.id.addOS);
        searchOs = (ImageButton) findViewById(R.id.searchOS);
        addFisc = (ImageButton) findViewById(R.id.addFisc);
        searchFisc = (ImageButton) findViewById(R.id.searchFisc);

        addD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Em breve você poderá adicionar\n  suas demandas clicando aqui!\n  Agradecemos a compreensão.", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), CadastroDemanda.class);
                startActivity(intent);
            }
        });

        searchD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Em breve você poderá pesquisar\n  suas demandas clicando aqui!\n  Agradecemos a compreensão.", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), MapsActivity.class);
                startActivity(intent);
            }
        });

        addOS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Em breve você poderá adicionar suas \n    Ordens de Serviço clicando aqui!\n     Agradecemos a compreensão.", Toast.LENGTH_SHORT).show();
            }
        });

        searchOs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Em breve você poderá pesquisar suas \n    Ordens de Serviço clicando aqui!\n     Agradecemos a compreensão.", Toast.LENGTH_SHORT).show();

            }
        });

        addFisc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Em breve você poderá adicionar novas\n          Fiscalizações clicando aqui!\n       Agradecemos a compreensão.", Toast.LENGTH_SHORT).show();

            }
        });

        searchFisc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Em breve você poderá pesquisar novas\n          Fiscalizações clicando aqui!\n       Agradecemos a compreensão.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
