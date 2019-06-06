package com.example.teste1.controller;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class JogoController implements View.OnClickListener {

    private EditText etNumero;
    private TextView tvResultado;
    private Button btnAdivinhar, btnRestart;
    private int valor;

    public JogoController(EditText etNumero, TextView tvResultado, Button btnAdivinhar, Button btnRestart, int valor){
        this.etNumero = etNumero;
        this.tvResultado = tvResultado;
        this.btnAdivinhar = btnAdivinhar;
        this.btnRestart = btnRestart;
        this.valor = valor;
    }

    @Override
    public void onClick(View view) {
        jogo(etNumero, tvResultado, valor);
    }


    private void jogo(EditText etNumero, TextView tvResultado, int valor) {
        int num = Integer.valueOf(etNumero.getText().toString());
        if (num < valor) {
            tvResultado.setText("O número é maior");
        } else {
            if (num > valor){
                tvResultado.setText("O número é menor");
            } else {
                StringBuffer sb = new StringBuffer();
                sb.append("Acertô Mizerávi ");
                tvResultado.setText(sb.toString());
                etNumero.setVisibility(View.INVISIBLE);
                btnAdivinhar.setVisibility(View.INVISIBLE);
                btnRestart.setVisibility(View.VISIBLE);
            }
        }

    }
}
