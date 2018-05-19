package com.calculator.cashback.AddCard;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.calculator.cashback.R;

/**
 * Created by kt_ki on 8/12/2017.
 */

public class LogoViewHolder extends RecyclerView.ViewHolder {
    ImageView vLogoView;
    TextView vLogoName;


    LogoViewHolder(View itemView) {
        super(itemView );
        vLogoView = itemView.findViewById(R.id.iv_logo);
        vLogoName = itemView.findViewById(R.id.tv_logo_name);
    }

}
