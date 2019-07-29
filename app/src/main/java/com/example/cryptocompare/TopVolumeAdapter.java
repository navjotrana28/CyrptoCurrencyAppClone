package com.example.cryptocompare;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cryptocompare.apiCallAndResponse.Datum;
import com.squareup.picasso.Picasso;

import java.util.List;

public class TopVolumeAdapter  extends RecyclerView.Adapter<TopVolumeAdapter.MyViewHolder> {
    Context mcontext;

    public void setDatumList(List<Datum> datumList) {
        this.datumList = datumList;
        notifyDataSetChanged();
    }

    List<Datum> datumList;

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
        return mHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TopVolumeAdapter.MyViewHolder holder, int position) {
      holder.coinName.setText(datumList.get(position).getCoinInfo().getFullName());
        holder.coinSymbol.setText(datumList.get(position).getCoinInfo().getName());
        holder.overallVolume.setText(datumList.get(position).getDISPLAY().getUSD().getTOTALVOLUME24HTO());
        holder.prizeOfCoin.setText(datumList.get(position).getDISPLAY().getUSD().getPRICE());
        Picasso.get()
                .load("https://www.cryptocompare.com"+datumList.get(position).getCoinInfo().getImageUrl())
                .placeholder(R.drawable.ic_launcher_foreground)
                .resize(300,80)
                .centerInside()
                .into(holder.coinImage);
    }

    @Override
    public int getItemCount() {
      if(datumList!=null){
          return datumList.size();
      }else
        return 0;
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
      ImageView coinImage;
      TextView coinName,coinSymbol,overallVolume, prizeOfCoin;

      MyViewHolder(View view){
          super(view);
          coinName=view.findViewById(R.id.news_type);
          coinImage =view.findViewById(R.id.news_image);
          coinSymbol =view.findViewById(R.id.news_headlines);
          overallVolume=view.findViewById(R.id.news_category);
          prizeOfCoin =view.findViewById(R.id.prize_of_coin);

          view.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  int pos=getAdapterPosition();
                  Toast.makeText(view.getContext(),"Youclicked:"+datumList.get(pos).getCoinInfo().getFullName(),Toast.LENGTH_SHORT).show();
                  Intent intent = new Intent(mcontext,DetailedCoinData.class);
                  intent.putExtra("coin_data",  datumList.get(pos));
                  mcontext.startActivity(intent);
              }
          });

      }
    }

}

