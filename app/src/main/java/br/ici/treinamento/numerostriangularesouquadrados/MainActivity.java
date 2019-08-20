package br.ici.treinamento.numerostriangularesouquadrados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    public void tertarNumero(View view){

        String menssage = "";
        EditText editTextNumero = (EditText) findViewById(R.id.editTextnumero);

        if(editTextNumero.getText().toString().isEmpty()){
            menssage = "Por fevor entre com um numero";
        }else {

            Numero meuNumero = new Numero();
            meuNumero.numero = Integer.parseInt(editTextNumero.getText().toString());

            if (meuNumero.quadrado()) {

                if (meuNumero.triangular()) {
                    menssage = meuNumero.numero + " é triangular e quadrado.";
                } else {
                    menssage = meuNumero.numero + " é quadrado mais não é triangular.";
                }
            } else {

                if (meuNumero.triangular()) {
                    menssage = meuNumero.numero + " é triangular mais não é quadrado.";
                } else {
                    menssage = meuNumero.numero + " Não é triangula e não é quadrado.";
                }
            }
        }

        Toast.makeText(MainActivity.this, menssage, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
