package com.example.a2_catatan_keuangan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class newtransaksiAdapter extends RecyclerView.Adapter<newtransaksiAdapter.MyViewHolder> {

    String[] s1;
    String[] s2;
    Context context;

    public newtransaksiAdapter(Context context, String[] s1, String[] s2){
        this.context = context;
        this.s1 = s1;
        this.s2 = s2;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.activity_newtransaksi, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.myText1.setText(s1[position]);
        holder.myText2.setText(s2[position]);
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView myText1, myText2;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            myText1 = itemView.findViewById(R.id.textView1);
            myText2 = itemView.findViewById(R.id.textView2);
        }
    }
}
