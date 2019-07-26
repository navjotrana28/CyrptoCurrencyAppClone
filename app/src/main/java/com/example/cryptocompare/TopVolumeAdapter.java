package com.example.cryptocompare;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cryptocompare.apiCallAndResponse.Datum;

import java.util.List;

public class TopVolumeAdapter  extends RecyclerView.Adapter<TopVolumeAdapter.MyViewHolder> {
    Context mcontext;
    List<Datum> datumList;
  public TopVolumeAdapter(Context context,List<Datum> wholeData)
  {
      mcontext=context;
      datumList=wholeData;
  }
    @NonNull
    @Override
    public TopVolumeAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.top_volume_card,parent,false);
        MyViewHolder mHolder = new MyViewHolder(view);
        return mHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TopVolumeAdapter.MyViewHolder holder, int position) {
      holder.coinName.setText(datumList.get(position).getCoinInfo().getName());

    }

    @Override
    public int getItemCount() {
      if(datumList!=null){
          return datumList.size();
      }else
        return 0;
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
      TextView coinName;

      MyViewHolder(View view){
          super(view);
          coinName=view.findViewById(R.id.name_of_coin);
//          view.setOnClickListener(new View.OnClickListener() {
//              @Override
//              public void onClick(View view) {
//                  int pos=getAdapterPosition();
//                  Toast.makeText(view.getContext(),"youclicked"+pos,Toast.LENGTH_SHORT).show();
//              }
//          });

      }
    }

}

