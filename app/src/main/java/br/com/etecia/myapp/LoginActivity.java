package br.com.etecia.myapp;

import android.content.Intent;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {

    TextInputEditText txtSenha, txtEmail;
    MaterialButton btnEntrar, btnCadastrar;

    TextView txtEsqueceu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.login_layout);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        txtEsqueceu= findViewById(R.id.txtEsqueceu);

        txtEsqueceu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), RecuperarSenhaActivity.class));
                finish();
            }
        });

        btnCadastrar= findViewById(R.id.btnCadastrar);

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),CadastrarUserActivity.class));
                finish();
            }
        });
        txtEmail= findViewById(R.id.txtEmail);
        txtSenha= findViewById(R.id.txtSenha);
        btnEntrar= findViewById(R.id.btnEntrar);

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email, senha;
                email=txtEmail.getText().toString();
                senha=txtSenha.getText().toString();

                if (email.equals("etecia") && senha.equals("12345")){

                    startActivity(new Intent(getApplicationContext(), MenuActivity.class));
                    finish();
                } else{
                    Toast.makeText(getApplicationContext(),"Usuário ou senha incorreto", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}