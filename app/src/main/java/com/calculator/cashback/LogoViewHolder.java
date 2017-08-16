package com.calculator.cashback;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by kt_ki on 8/12/2017.
 */

public class LogoViewHolder extends RecyclerView.ViewHolder {
    ImageView vLogoView;
    public LogoViewHolder(View itemView) {
        super(itemView);
        vLogoView = itemView.findViewById(R.id.iv_logo);

    }
}
