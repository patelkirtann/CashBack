package com.calculator.cashback.AddCard;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.calculator.cashback.R;
import com.calculator.cashback.RecyclerViewClickListener;

/**
 * Created by kt_ki on 8/12/2017.
 */

public class LogoGridViewAdapter extends RecyclerView.Adapter<LogoViewHolder> {
    private Context mContext;
    private RecyclerViewClickListener mClickedListener;
    public Integer[] getLogos = {
            R.drawable.ic_amazon,
            R.drawable.ic_american_express,
            R.drawable.ic_citi,
            R.drawable.ic_discover,
            R.drawable.ic_maestro,
            R.drawable.ic_mastercard,
            R.drawable.ic_paypal,
            R.drawable.ic_visa,
            R.drawable.ic_other
    };
    public String[] getNames = {
            "Amazon",
            "Amex",
            "CITI",
            "Discover",
            "Maestro",
            "MasterCard",
            "PayPal",
            "Visa",
            "Other"
    };


    LogoGridViewAdapter(Context context, RecyclerViewClickListener clickedListener) {
        mContext = context;
        mClickedListener = clickedListener;
    }

    @NonNull
    @Override
    public LogoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.card_logo_view, parent, false);
        return new LogoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final LogoViewHolder holder, int position) {
        holder.vLogoView.setImageResource(getLogos[position]);
        holder.vLogoName.setText(getNames[position]);

        mClickedListener.recyclerViewItemClicked(holder,position);

    }

    @Override
    public int getItemCount() {
        return getLogos.length;
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }


}
