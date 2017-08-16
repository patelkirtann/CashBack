package com.calculator.cashback;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by kt_ki on 8/12/2017.
 */

public class LogoGridViewAdapter extends RecyclerView.Adapter<LogoViewHolder> {
    private Context mContext;
    private int lastClickedPosition = -1;
    private Integer[] getLogos = {
            R.drawable.ic_amazon,
            R.drawable.ic_american_express,
            R.drawable.ic_citi,
            R.drawable.ic_discover,
            R.drawable.ic_maestro,
            R.drawable.ic_mastercard,
            R.drawable.ic_paypal,
            R.drawable.ic_visa,
    };

    private ImageView lastLoadedImage = null;

    public LogoGridViewAdapter(Context context) {
        mContext = context;
    }

    @Override
    public LogoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.card_logo_view, parent, false);
        return new LogoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final LogoViewHolder holder, int position) {
        holder.vLogoView.setImageResource(getLogos[position]);
        final int newPosition = holder.getAdapterPosition();
        holder.vLogoView.setOnClickListener(new View.OnClickListener() {
            boolean isSelected = false;
            Animation animation;
            @Override
            public void onClick(View view) {
                if (!isSelected) {

                    Toast.makeText(mContext, "newPos " + newPosition + " oldPos " + lastClickedPosition,
                            Toast.LENGTH_SHORT).show();
                    lastClickedPosition = newPosition;

                    if (lastLoadedImage != null) {
                        lastLoadedImage.clearAnimation();
                    }

                    lastLoadedImage = holder.vLogoView;
                    animation = AnimationUtils.loadAnimation(mContext,
                            R.anim.zoom_in);
                    holder.vLogoView.startAnimation(animation);
                    isSelected = true;

                } else {
                    holder.vLogoView.clearAnimation();
                    isSelected = false;
                }
            }
        });
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
