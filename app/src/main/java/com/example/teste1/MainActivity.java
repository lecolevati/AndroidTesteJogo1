package com.example.teste1;

import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

        import com.example.teste1.controller.JogoController;
import com.example.teste1.controller.RestartController;

public class MainActivity extends AppCompatActivity {

    private EditText etNumero;
    private Button btnAdivinhar, btnRestart;
    private TextView tvResultado;
    private int valor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etNumero = (EditText) findViewById(R.id.etNumero);
        btnAdivinhar = (Button) findViewById(R.id.btnAdivinhar);
        btnRestart = (Button) findViewById(R.id.btnRestart);
        btnRestart.setVisibility(View.INVISIBLE);
        tvResultado = (TextView) findViewById(R.id.tvResultado);

        valor = (int)(Math.random() * 100);

        View.OnClickListener jc = new JogoController(etNumero, tvResultado, btnAdivinhar, btnRestart, valor);
        btnAdivinhar.setOnClickListener(jc);

        View.OnClickListener rc = new RestartController(getIntent(), this);
        btnRestart.setOnClickListener(rc);

    }
}