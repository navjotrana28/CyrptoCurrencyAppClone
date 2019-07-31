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

public class TopVolumeAdapter extends RecyclerView.Adapter<TopVolumeAdapter.MyViewHolder> {
    private static final String YOUCLICKED = "Youclicked:";
    private static final String COIN_DATA = "coin_data";
    private static final String HTTPS_WWW_CRYPTOCOMPARE_COM = "https://www.cryptocompare.com";
    private Context mcontext;
    private List<Datum> datumList;

    TopVolumeAdapter(Context context) {
        mcontext = context;
    }

    void setDatumList(List<Datum> datumList) {
        this.datumList = datumList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public TopVolumeAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.top_volume_card, parent, false);
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
                .load(HTTPS_WWW_CRYPTOCOMPARE_COM + datumList.get(position).getCoinInfo().getImageUrl())
                .resize(300, 80)
                .centerInside()
                .into(holder.coinImage);
    }

    @Override
    public int getItemCount() {
        if (datumList != null) {
            return datumList.size();
        } else
            return 0;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView coinImage;
        TextView coinName, coinSymbol, overallVolume, prizeOfCoin;

        MyViewHolder(View view) {
            super(view);
            coinName = view.findViewById(R.id.news_type);
            coinImage = view.findViewById(R.id.news_image);
            coinSymbol = view.findViewById(R.id.news_headlines);
            overallVolume = view.findViewById(R.id.news_category);
            prizeOfCoin = view.findViewById(R.id.prize_of_coin);

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int pos = getAdapterPosition();
                    Toast.makeText(view.getContext(), YOUCLICKED + datumList.get(pos).getCoinInfo().getFullName(), Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(mcontext, DetailedCoinData.class);
                    intent.putExtra(COIN_DATA, datumList.get(pos));
                    mcontext.startActivity(intent);
                }
            });
        }
    }
}

