package mx.com.dloza.descendent.hidalgo;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import mx.com.dloza.descendent.R;

public class CatGameActivity extends AppCompatActivity implements View.OnClickListener {

    int turno,cont,conta=0;
    String letra;
    EditText et_ganador;
    Button btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_Salir,btn_Reset;

    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_cat_game);
        mp = MediaPlayer.create( this, R.raw.won);

        et_ganador=(EditText)findViewById(R.id.et_ganador);

        btn_1=(Button)(findViewById(R.id.btn_1));
        btn_2=(Button)(findViewById(R.id.btn_2));
        btn_3=(Button)(findViewById(R.id.btn_3));
        btn_4=(Button)(findViewById(R.id.btn_4));
        btn_5=(Button)(findViewById(R.id.btn_5));
        btn_6=(Button)(findViewById(R.id.btn_6));
        btn_7=(Button)(findViewById(R.id.btn_7));
        btn_8=(Button)(findViewById(R.id.btn_8));
        btn_9=(Button)(findViewById(R.id.btn_9));
        btn_Reset =(Button)(findViewById(R.id.btn_Reset));

        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        btn_Reset.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        cont++;
        turno=cont%2;

        if(turno == 1){
            imprimirXO('x', v);
        }
        else{
            imprimirXO('o', v);
        }
    }

    public void imprimirXO(char letra, View v){

        if(v.getId() == R.id.btn_reset){
            et_ganador.setEnabled(true);
            et_ganador.setText("");

            btn_1.setEnabled(true);
            btn_1.setText("");

            btn_2.setEnabled(true);
            btn_2.setText("");

            btn_3.setEnabled(true);
            btn_3.setText("");

            btn_4.setEnabled(true);
            btn_4.setText("");

            btn_5.setEnabled(true);
            btn_5.setText("");

            btn_6.setEnabled(true);
            btn_6.setText("");

            btn_7.setEnabled(true);
            btn_7.setText("");

            btn_8.setEnabled(true);
            btn_8.setText("");

            btn_9.setEnabled(true);
            btn_9.setText("");
        }
        if(v.getId() == R.id.btn_1){
            btn_1.setText(letra+"");
            btn_1.setEnabled(false);
        }
        else if(v.getId() == R.id.btn_2){
            btn_2.setText(letra+"");
            btn_2.setEnabled(false);
        }
        else if(v.getId() == R.id.btn_3){
            btn_3.setText(letra+"");
            btn_3.setEnabled(false);
        }
        else if(v.getId() == R.id.btn_4){
            btn_4.setText(letra+"");
            btn_4.setEnabled(false);
        }
        else if(v.getId() == R.id.btn_5){
            btn_5.setText(letra+"");
            btn_5.setEnabled(false);
        }
        else if(v.getId() == R.id.btn_6){
            btn_6.setText(letra+"");
            btn_6.setEnabled(false);
        }
        else if(v.getId() == R.id.btn_7){
            btn_7.setText(letra+"");
            btn_7.setEnabled(false);
        }
        else if(v.getId() == R.id.btn_8){
            btn_8.setText(letra+"");
            btn_8.setEnabled(false);
        }
        else if(v.getId() == R.id.btn_9){
            btn_9.setText(letra+"");
            btn_9.setEnabled(false);
        }
        Ganador(letra);
    }

    public void Ganador(char letra){

        if(btn_1.getText().toString().equals(letra+"") && (btn_2.getText().toString().equals(letra+"")) && (btn_3.getText().toString().equals(letra+""))){
            et_ganador.setText("El ganador es "+letra);
            et_ganador.setEnabled(false);
            btn_4.setEnabled(false);
            btn_5.setEnabled(false);
            btn_6.setEnabled(false);
            btn_7.setEnabled(false);
            btn_8.setEnabled(false);
            btn_9.setEnabled(false);
            mp.start();

        }else if(btn_4.getText().toString().equals(letra+"") && (btn_5.getText().toString().equals(letra+"")) && (btn_6.getText().toString().equals(letra+""))){
            et_ganador.setText("El ganador es "+letra);
            et_ganador.setEnabled(false);
            btn_1.setEnabled(false);
            btn_2.setEnabled(false);
            btn_3.setEnabled(false);
            btn_7.setEnabled(false);
            btn_8.setEnabled(false);
            btn_9.setEnabled(false);
            mp.start();
        }else if(btn_7.getText().toString().equals(letra+"") && (btn_8.getText().toString().equals(letra+"")) && (btn_9.getText().toString().equals(letra+""))){
            et_ganador.setText("El ganador es "+letra);
            et_ganador.setEnabled(false);
            btn_1.setEnabled(false);
            btn_2.setEnabled(false);
            btn_3.setEnabled(false);
            btn_4.setEnabled(false);
            btn_5.setEnabled(false);
            btn_6.setEnabled(false);
            mp.start();
        }else if(btn_1.getText().toString().equals(letra+"") && (btn_4.getText().toString().equals(letra+"")) && (btn_7.getText().toString().equals(letra+""))){
            et_ganador.setText("El ganador es "+letra);
            et_ganador.setEnabled(false);
            btn_2.setEnabled(false);
            btn_3.setEnabled(false);
            btn_5.setEnabled(false);
            btn_6.setEnabled(false);
            btn_8.setEnabled(false);
            btn_9.setEnabled(false);
            mp.start();
        }else if(btn_2.getText().toString().equals(letra+"") && (btn_5.getText().toString().equals(letra+"")) && (btn_8.getText().toString().equals(letra+""))){
            et_ganador.setText("El ganador es "+letra);
            et_ganador.setEnabled(false);
            btn_1.setEnabled(false);
            btn_3.setEnabled(false);
            btn_4.setEnabled(false);
            btn_6.setEnabled(false);
            btn_7.setEnabled(false);
            btn_9.setEnabled(false);
            mp.start();

        }else if(btn_3.getText().toString().equals(letra+"") && (btn_6.getText().toString().equals(letra+"")) && (btn_9.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            btn_1.setEnabled(false);
            btn_2.setEnabled(false);
            btn_4.setEnabled(false);
            btn_5.setEnabled(false);
            btn_7.setEnabled(false);
            btn_8.setEnabled(false);
            mp.start();

        }else if(btn_1.getText().toString().equals(letra+"") && (btn_5.getText().toString().equals(letra+"")) && (btn_9.getText().toString().equals(letra+""))){
            et_ganador.setText("El ganador es "+letra);
            et_ganador.setEnabled(false);
            btn_2.setEnabled(false);
            btn_3.setEnabled(false);
            btn_4.setEnabled(false);
            btn_6.setEnabled(false);
            btn_7.setEnabled(false);
            btn_8.setEnabled(false);
            mp.start();

        }else if(btn_3.getText().toString().equals(letra+"") && (btn_5.getText().toString().equals(letra+"")) && (btn_7.getText().toString().equals(letra+""))){
            et_ganador.setText(getString(R.string.win)+letra);
            et_ganador.setEnabled(false);
            btn_1.setEnabled(false);
            btn_2.setEnabled(false);
            btn_4.setEnabled(false);
            btn_6.setEnabled(false);
            btn_8.setEnabled(false);
            btn_9.setEnabled(false);
            mp.start();
        }else if(conta<9){
            conta++;
        }else {
            et_ganador.setText(R.string.draw);
        }
    }
}

