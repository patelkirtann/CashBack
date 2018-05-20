package com.calculator.cashback;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class AllCardsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private ArrayList<String> list;

    public AllCardsAdapter(ArrayList<String> list){
        this.list = list;
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context mContext = parent.getContext();
        View view = LayoutInflater.from(mContext).inflate(R.layout.all_card_view_holder,parent,false);
        return new AllCardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof AllCardViewHolder){
            ((AllCardViewHolder) holder).mCardPosition.setText(position + 1 + "");
            ((AllCardViewHolder) holder).mCardName.setText(list.get(position));
            ((AllCardViewHolder) holder).mCardDetails.setText("Details");
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
