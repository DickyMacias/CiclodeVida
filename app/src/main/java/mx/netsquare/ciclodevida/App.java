package mx.netsquare.ciclodevida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class App extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app);
        Log.d(getTitle().toString(),"Evento OnCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(getTitle().toString(),"Evento OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(getTitle().toString(),"Evento OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(getTitle().toString(),"Evento OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(getTitle().toString(),"Evento OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(getTitle().toString(),"Evento OnDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(getTitle().toString(),"Evento OnRestart");
    }

    public void Salir(View view){
        App.this.finish();
    }

}
