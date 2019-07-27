package com.example.cryptocompare;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cryptocompare.apiCallAndResponse.Datum;
import com.example.cryptocompare.newsResponse.Data;
import com.squareup.picasso.Picasso;
import java.util.List;

public class NewsAdapter  extends RecyclerView.Adapter<NewsAdapter.MyViewHolder> {
    Context mcontext;
    List<Data> dataList;
    public NewsAdapter(Context context,List<Data> wholeData)
    {
        mcontext=context;
        dataList= wholeData;
    }
    @NonNull
    @Override
    public NewsAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.news_card,parent,false);
        MyViewHolder mHolder = new MyViewHolder(view);
        return mHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull NewsAdapter.MyViewHolder holder, int position) {
        holder.newstype.setText(dataList.get(position).getSource_info().getName());
        holder.newsHeadlines.setText(dataList.get(position).getTitle());
        holder.newsCategory.setText(dataList.get(position).getCategories());
        Picasso.get()
                .load(dataList.get(position).getImageurl())
                .placeholder(R.drawable.ic_launcher_foreground)
                .resize(450,190)
                .centerInside()
                .into(holder.newsImage);
    }

    @Override
    public int getItemCount() {
        if(dataList!=null){
            return dataList.size();
        }else
            return 0;
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView newsImage;
        TextView newstype,newsHeadlines,newsCategory;

        MyViewHolder(View view){
            super(view);
            newstype=view.findViewById(R.id.news_type);
            newsImage =view.findViewById(R.id.news_image);
            newsHeadlines =view.findViewById(R.id.news_headlines);
            newsCategory=view.findViewById(R.id.news_category);

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int pos=getAdapterPosition();
                    Toast.makeText(view.getContext(),"Youclicked:"+dataList.get(pos).getSource_info().getName(),Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(dataList.get(pos).getGuid()));
                    mcontext.startActivity(intent);
                }
            });

        }
    }

}

