package com.example.myapplication;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class ArticleAdapter extends RecyclerView.Adapter<ArticleViewHolder> {
    private List<Article>articles;
    private Context context;

    public ArticleAdapter (List<Article>articles, Context context){
        this.articles=articles;
        this.context=context;
    }

    @Override
    public ArticleViewHolder onCreateViewHolder (ViewGroup parent, int ViewType){
        View view =LayoutInflater.from(parent.getContext()).inflate(R.layout.info_card_view, parent, false);
        return new ArticleViewHolder(view, context);
    }
    @Override
    public void onBindViewHolder (ArticleViewHolder holder, int position){
        Article article =articles.get(position);
        holder.textView_title.setText(article.aTitle);
        holder.imageView_number.setImageResource(article.aNumber);
    }

    @Override
    public int getItemCount(){
        return articles.size();
    }
}
