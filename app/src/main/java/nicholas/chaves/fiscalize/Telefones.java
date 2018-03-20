package nicholas.chaves.fiscalize;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.provider.CallLog;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.style.TtsSpan;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class Telefones extends AppCompatActivity {

    private ListView lista;
    private String[] telefones = {"Regional 1: 1234-4321", "Regional 2: 1234-4321",
                                    "Regional 3: 1234-4321", "Regional 4: 1234-4321",
                                    "Regional 5: 1234-4321", "Regional 6: 1234-4321",
                                    "Seuma: 1234-4321", "AMC: 1234-431"};
    private AlertDialog.Builder ligacao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telefones);

        lista = (ListView) findViewById(R.id.listId);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,
                                                                    android.R.id.text1, telefones);

        lista.setAdapter(adaptador);


        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int codigo = i;
                //Toast.makeText(getApplicationContext(), telefones[codigo], Toast.LENGTH_SHORT).show();
                ligacao = new AlertDialog.Builder(Telefones.this);
                ligacao.setTitle(" ");
                ligacao.setMessage("\t\t\t\t\t\t\t\t\tDeseja ligar?");
                ligacao.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //Toast.makeText(Telefones.this, "Operação cancelada!", Toast.LENGTH_SHORT).show();
                    }
                });
                ligacao.setPositiveButton("Ligar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(Telefones.this, "Em construção!", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(Intent.ACTION_DIAL));
                    }
                });
                ligacao.setIcon(R.drawable.callericon);
                ligacao.setCancelable(false);
                ligacao.create();
                ligacao.show();
            }
        });


    }
}
