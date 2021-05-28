package com.fandrade.practica4_listaspersonalizadas;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import static com.fandrade.practica4_listaspersonalizadas.R.id.logo;

public class AdapterList extends ArrayAdapter<String> {
    private final Activity context;
    private  final String[] nombres;
    private  final String[] precios;
    private  final Integer[] idimagen;


    public AdapterList(Activity context, String[] nombres,String[] precios,Integer[] idimagen) {
        super(context,R.layout.item,nombres);
        this.context = context;
        this.nombres = nombres;
        this.precios = precios;
        this.idimagen = idimagen;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.item, null);
        TextView _nombre=(TextView)rowView.findViewById(R.id.txtnombre);
        TextView _precio=(TextView)rowView.findViewById(R.id.txtprecio);
        ImageView _imagen=(ImageView)rowView.findViewById(logo);
        _nombre.setText(nombres[position]);
        _precio.setText(precios[position]);
        _imagen.setImageResource(idimagen[position]);

        return rowView;
    }
}
