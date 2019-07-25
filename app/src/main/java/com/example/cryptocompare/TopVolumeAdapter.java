package com.example.cryptocompare;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TopVolumeAdapter  extends RecyclerView.Adapter<TopVolumeAdapter.MyViewHolder> {
    Context mcontext;
  public TopVolumeAdapter(Context context)
  {
      mcontext=context;
  }
    @NonNull
    @Override
    public TopVolumeAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.top_volume_card,parent,false);
        MyViewHolder mHolder = new MyViewHolder(view);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull TopVolumeAdapter.MyViewHolder holder, int position) {


    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

      MyViewHolder(View view){

          super(view);
      }
    }

}

