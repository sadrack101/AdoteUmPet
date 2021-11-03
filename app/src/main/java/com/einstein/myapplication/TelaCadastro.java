package com.einstein.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.UUID;

public class TelaCadastro extends AppCompatActivity implements View.OnClickListener {

    public ViewHolder mViewHolder = new ViewHolder();

    FirebaseDatabase database;
    DatabaseReference myRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro);
        iniciarFirebase();

        this.mViewHolder.button = findViewById(R.id.button);
        this.mViewHolder.button.setOnClickListener(this);


    }

    public void cadastrarUsuario(View view){
        EditText txtNomeInput = findViewById(R.id.input_nome);
        EditText txtNumeroTelefoneInput = findViewById(R.id.input_numero_telefone);
        EditText txtEmailInput = findViewById(R.id.input_email);
        EditText txtConfirmEmailInput = findViewById(R.id.input_confirm_email);
        EditText txtSenhaInput = findViewById(R.id.input_nome);
        EditText txtConfirmSenhaInput = findViewById(R.id.input_nome);

        String UID = UUID.randomUUID().toString();
        String nomeInput = txtNomeInput.getText().toString();
        String numeroTelefoneInput = txtNumeroTelefoneInput.getText().toString();
        String emailInput = txtEmailInput.getText().toString();
        String confirmEmailInput = txtConfirmEmailInput.getText().toString();
        String senhaInput = txtSenhaInput.getText().toString();
        String confirmSenhaInput = txtConfirmSenhaInput.getText().toString();

        Usuario usuario = new Usuario(UID, nomeInput, numeroTelefoneInput, emailInput, confirmEmailInput, senhaInput, confirmSenhaInput);
        txtNomeInput.setText(null);
        txtNumeroTelefoneInput.setText(null);
        txtEmailInput.setText(null);
        txtConfirmEmailInput.setText(null);
        txtSenhaInput.setText(null);
        txtConfirmSenhaInput.setText(null);
        Toast.makeText(this, "Usuario cadastrado com sucesso!", Toast.LENGTH_SHORT).show();
    }

    private void iniciarFirebase() {
        database = FirebaseDatabase.getInstance();
        myRef = database.getReference();
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.botao_cadastrar){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }

    public static class ViewHolder {
     Button button;
    }
}