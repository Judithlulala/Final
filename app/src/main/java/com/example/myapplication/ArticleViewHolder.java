package com.example.myapplication;


import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ArticleViewHolder extends RecyclerView.ViewHolder {
    public CardView cardView;
    public TextView textView_title;
    public ImageView imageView_number;
    public boolean saveArticle;

    public ArticleViewHolder (View itemView, final Context context){
        super(itemView);
        cardView=(CardView)itemView.findViewById(R.id.card_view);
        textView_title=(TextView)itemView.findViewById(R.id.article_title);
        imageView_number=(ImageView)itemView.findViewById(R.id.article_number);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"Open the article", Toast.LENGTH_SHORT).show();

            }
        });
    }



}
