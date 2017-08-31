package com.example.chapa.ejercicioclase4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by chapa on 31/08/2017.
 */

public class ListViewAdapter extends BaseAdapter {
    // Declare Variables
    Context context;
    String[] control;
    String[] carrera;
    String[] titulos;
    int[] imagenes;
    LayoutInflater inflater;

    public ListViewAdapter(Context context, String[] titulos, int[] imagenes,String[] control,String[] carrera) {
        this.context = context;
        this.titulos = titulos;
        this.imagenes = imagenes;
        this.control = control;
        this.carrera = carrera;
    }

    @Override
    public int getCount() {
        return titulos.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        // Declare Variables
        TextView txtTitle;
        TextView txtControl;
        TextView txtCarrera;
        ImageView imgImg;

        //http://developer.android.com/intl/es/reference/android/view/LayoutInflater.html
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View itemView = inflater.inflate(R.layout.listrow, parent, false);

        // Locate the TextViews in listview_item.xml
        txtTitle = (TextView) itemView.findViewById(R.id.textView_superior);
        txtControl = (TextView) itemView.findViewById(R.id.textView_inferior);
        txtCarrera = (TextView) itemView.findViewById(R.id.textView_inferior2);
        imgImg = (ImageView) itemView.findViewById(R.id.imageView_imagen);

        // Capture position and set to the TextViews
        txtTitle.setText(titulos[position]);
        txtControl.setText(control[position]);
        txtCarrera.setText(carrera[position]);
        imgImg.setImageResource(imagenes[position]);

        return itemView;
    }
}
