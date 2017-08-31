package com.example.chapa.ejercicioclase4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListViewAdapter adapter;

    String[] nombre = new String[]{
            "ABREGO DELGADO ALEXIA ARIANA",
            "CARO LOPEZ LUIS RICARDO",
            "CARVAJAL GUTIERREZ RAUL RAFAEL",
            "CASILLAS UREÑA FERMIN MICHET",
            "CRESPO DURAN PABLO ARTURO",
            "ESPINO SERRANO CESAR RAMSES",
            "ESPINOZA ORONIA CARLOS EDUARDO",
            "FREGOSO CORONA JESÚS EDUARDO",
            "GALAVIZ ARROYO OLIVER JASIEL",
            "GALINDO DELGADO DONADONY DONAJI",
            "GONZALEZ CASTELLANOS EDGAR FABRIZIO",
            "HERNANDEZ SANDOVAL ABRIL YARELI",
            "JIMENEZ ORTIZ JUAN DANIEL",
            "LIZOLA CHAVARÍN LUIS FERNANDO",
            "MEDRANO BARAJAS JUAN DANIEL",
            "RAMIREZ GARCIA JUAN RAMON",
            "RODRIGUEZ ADAME OLIVER GIOVANNY",
            "SANCHEZ JIMENEZ ANA PATRICIA",
            "SÁNCHEZ PARTIDA HÉCTOR OMAR",
            "VALDEZ CORREA CARLOS GERMAN",
            "CARRILLO GONZÁLEZ CARLOS ARTURO",
            "HERNANDEZ BAEZA JAVIER",
            "IBARRA MARAVILLAS JONATHAN GUADALUPE",
            "MARIN BAUTISTA IRVING ALDAHYR",
            "OCAMPO AGUILAR JESÚS ANDRÉS",
            "SALAZAR NAVARRO IRAN JAIR",
            "TEJEDA MORA CESAR"
    };

    String[] control={
            "13400378",
            "13400395",
            "13400396",
            "12400256",
            "13400397",
            "13400402",
            "12401119",
            "13400405",
            "13400406",
            "13400408",
            "13400419",
            "13400430",
            "13400436",
            "13400441",
            "13400457",
            "13400478",
            "13400507",
            "13400491",
            "12400322",
            "12400326",
            "13401087",
            "13401367",
            "13401097",
            "12400663",
            "13401100",
            "11400309",
            "13401105"
    };
    int[] imagenes = {
            R.drawable.ittepic,
            R.drawable.ittepic,
            R.drawable.ittepic,
            R.drawable.ittepic,
            R.drawable.ittepic,
            R.drawable.ittepic,
            R.drawable.ittepic,
            R.drawable.ittepic,
            R.drawable.ittepic,
            R.drawable.ittepic,
            R.drawable.ittepic,
            R.drawable.ittepic,
            R.drawable.ittepic,
            R.drawable.ittepic,
            R.drawable.ittepic,
            R.drawable.ittepic,
            R.drawable.ittepic,
            R.drawable.ittepic,
            R.drawable.ittepic,
            R.drawable.ittepic,
            R.drawable.ittepic,
            R.drawable.ittepic,
            R.drawable.ittepic,
            R.drawable.ittepic,
            R.drawable.ittepic,
            R.drawable.ittepic,
            R.drawable.ittepic
    };

    String[] carrera={
            "ISC",
            "ISC",
            "ISC",
            "ISC",
            "ISC",
            "ISC",
            "ISC",
            "ISC",
            "ISC",
            "ISC",
            "ISC",
            "ISC",
            "ISC",
            "ISC",
            "ISC",
            "ISC",
            "ISC",
            "ISC",
            "ISC",
            "ISC",
            "ITIC",
            "ITIC",
            "ITIC",
            "ITIC",
            "ITIC",
            "ITIC",
            "ITIC"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ListView lista = (ListView) findViewById(R.id.lista1);
        adapter = new ListViewAdapter(this, nombre, imagenes,control,carrera);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int i, long l) {

                Toast.makeText(getApplicationContext(), "presiono " + i, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
