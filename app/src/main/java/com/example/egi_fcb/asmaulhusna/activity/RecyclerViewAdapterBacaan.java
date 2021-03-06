package com.example.egi_fcb.asmaulhusna.activity;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.codesgood.views.JustifiedTextView;
import com.example.egi_fcb.asmaulhusna.R;

import java.util.List;

/**
 * Created by egi_fcb on 5/18/17.
 */

public class RecyclerViewAdapterBacaan extends RecyclerView.Adapter<RecyclerViewAdapterBacaan.RecyclerViewHolder>{
    List<ActivityAsmaulHusna.User2> values;
    Context context1;
    CardView cardView;

    public RecyclerViewAdapterBacaan(Context context, List<ActivityAsmaulHusna.User2> userInformation) {
        context1 = context;
        values = userInformation;
    }

    @Override
    public RecyclerViewAdapterBacaan.RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.costum_layout_bacaan, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final RecyclerViewAdapterBacaan.RecyclerViewHolder holder, final int position) {
        holder.bacaan.setText(values.get(position).getBacaan());
        holder.arti.setText(values.get(position).getArti());
        holder.bacaan_latin.setText(values.get(position).getBacaanLatin());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context1, "Posisis"+position, Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return values.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView bacaan;
        JustifiedTextView arti, bacaan_latin;
        CardView cardView;
        public RecyclerViewHolder(View itemView) {
            super(itemView);
            bacaan = (TextView)itemView.findViewById(R.id.tv_bacaan);
            arti = (JustifiedTextView) itemView.findViewById(R.id.tv_arti);
            bacaan_latin = (JustifiedTextView) itemView.findViewById(R.id.tv_bacaan_latin);
            cardView = (CardView)itemView.findViewById(R.id.card_view);
        }

        @Override
        public void onClick(View view) {

        }
    }
}