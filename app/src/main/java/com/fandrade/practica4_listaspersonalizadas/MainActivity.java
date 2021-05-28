package com.fandrade.practica4_listaspersonalizadas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView)findViewById(R.id.List);
        String[] nombres={"Manzana","Pera","Uva","Fresa","Durazno"};
        String[] precios={"40","50","30","70","90"};
        Integer[] idimagen={R.drawable.manzana,R.drawable.manzana,R.drawable.manzana,R.drawable.manzana,R.drawable.manzana};
        AdapterList adapter = new AdapterList(this,nombres,precios,idimagen);
        listView.setAdapter(adapter);

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Seleccionaste el elemento: " + nombres [position]+ " con precio de : $"+precios[position],Toast.LENGTH_LONG).show();
                return true;
            }
        });
    }
}