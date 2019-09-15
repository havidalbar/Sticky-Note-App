package com.example.havidalbar.note;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import android.widget.Button;
import android.widget.TextView;

import com.example.havidalbar.note.ArrayPesan;
import com.example.havidalbar.note.R;

import java.util.ArrayList;

public class ArrayPesanAdapter extends ArrayAdapter<ArrayPesan> {
    private Context mContext;
    private ArrayList<ArrayPesan> listNote;
    public ArrayPesanAdapter(Activity context, ArrayList<ArrayPesan> arrayPesan) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, arrayPesan);
        listNote=arrayPesan;
        mContext=context;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(mContext).inflate(R.layout.activity_list_view,parent,false);
        }

        ArrayPesan currentArrayPesan = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.textView);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        nameTextView.setBackgroundResource(currentArrayPesan.getLayoutPesan());
        nameTextView.setText(currentArrayPesan.getPesan());
        nameTextView.setTextColor(Color.WHITE);
        TextView waktuTextView= (TextView)listItemView.findViewById(R.id.waktu);
        waktuTextView.setText( currentArrayPesan.getWaktu());
        Button tombolHapus= (Button) listItemView.findViewById(R.id.hapus);
        tombolHapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listNote.remove(position);
                notifyDataSetChanged();
            }
        });


        return listItemView;
    }
}
