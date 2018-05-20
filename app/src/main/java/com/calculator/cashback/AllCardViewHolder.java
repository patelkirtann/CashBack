package com.calculator.cashback;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class AllCardViewHolder extends RecyclerView.ViewHolder {
    TextView mCardPosition,mCardName,mCardDetails;
    ImageView mCardLogo;
    public AllCardViewHolder(View itemView) {
        super(itemView);
        mCardPosition = itemView.findViewById(R.id.tv_card_position);
        mCardName = itemView.findViewById(R.id.tv_card_name);
        mCardDetails = itemView.findViewById(R.id.tv_card_detail);
        mCardLogo = itemView.findViewById(R.id.iv_card_logo);
    }
}
