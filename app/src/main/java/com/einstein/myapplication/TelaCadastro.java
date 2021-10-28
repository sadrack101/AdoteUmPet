package com.einstein.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaCadastro extends AppCompatActivity implements View.OnClickListener {

    public ViewHolder mViewHolder = new ViewHolder();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro);

        this.mViewHolder.button = findViewById(R.id.button);
        this.mViewHolder.button.setOnClickListener(this);
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