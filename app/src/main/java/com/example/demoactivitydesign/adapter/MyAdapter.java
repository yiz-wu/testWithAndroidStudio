package com.example.demoactivitydesign.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.demoactivitydesign.R;

public class MyAdapter extends ArrayAdapter<String> {

    private Context _context;
    private String _fasceOrarie[];
    private String _dettagli[];
    private int _icon[];

    public MyAdapter(Context context, String fasceOrarie[], String dettagli[], int img[]){
        super(context, R.layout.list_item, R.id.tvFasceOrarie, fasceOrarie);
        _context = context;
        _fasceOrarie = fasceOrarie;
        _dettagli = dettagli;
        _icon = img;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // avere riferimento al servizio del sistema che esegue inflate degli view
        LayoutInflater layoutInflater = (LayoutInflater) _context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // crea un view del tipo "list_item"
        View row = layoutInflater.inflate(R.layout.list_item, parent, false);

        // riempie gli elementi del view list_item
        TextView fasceorarie = row.findViewById(R.id.tvFasceOrarie);
        TextView dettagli = row.findViewById(R.id.tvDettagli);
        ImageView icon = row.findViewById(R.id.ivIcon);

        fasceorarie.setText(_fasceOrarie[position]);
        dettagli.setText(_dettagli[position]);
        icon.setImageResource(_icon[position]);
        
        return row;
    }
}
