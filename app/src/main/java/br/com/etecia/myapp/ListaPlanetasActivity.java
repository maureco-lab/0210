package br.com.etecia.myapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ListaPlanetasActivity extends AppCompatActivity {

    List<Planetas> lstPlanetas;
    RecyclerView listaplaneta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.lista_planetas_layout);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //Criando array de dados
        lstPlanetas = new ArrayList<>();
        lstPlanetas.add(new Planetas("Sol", "Estrela Central", R.drawable.solgude));
        lstPlanetas.add(new Planetas("Mercury", "Estrela Central", R.drawable.mercury));
        lstPlanetas.add(new Planetas("Venus", "Estrela Central", R.drawable.venu));
        lstPlanetas.add(new Planetas("Terra", "Estrela Central", R.drawable.terra));
        lstPlanetas.add(new Planetas("Marte", "Estrela Central", R.drawable.mars));
        lstPlanetas.add(new Planetas("Júpiter", "Estrela Central", R.drawable.jupiter));
        lstPlanetas.add(new Planetas("Saturno", "Estrela Central", R.drawable.saturn));
        lstPlanetas.add(new Planetas("Urano", "Estrela Central", R.drawable.uranus));
        lstPlanetas.add(new Planetas("Netuno", "Estrela Central", R.drawable.netuno));

        //Recycle view
        listaplaneta = findViewById(R.id.listaplaneta);

        AdapterPlaneta adapter = new AdapterPlaneta(lstPlanetas, ListaPlanetasActivity.this);

        listaplaneta.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        //Liga o adaptador à lista
        listaplaneta.setAdapter(adapter);
    }
}