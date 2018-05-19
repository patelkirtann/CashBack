package com.calculator.cashback.AddCard;

import android.content.Context;
import android.os.Bundle;
import android.support.v17.leanback.widget.HorizontalGridView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import com.calculator.cashback.R;
import com.calculator.cashback.RecyclerViewClickListener;

public class ManageCardActivity extends AppCompatActivity implements RecyclerViewClickListener {

    private HorizontalGridView vAddLogo;
    private AutoCompleteTextView vAddName, vAddCategory;
    private EditText vAddPercent;
    private Context context;
    private ImageView lastLoadedImage = null;
    private ImageView vSelectedImage;
    private LogoGridViewAdapter mViewAdapter;
    private ImageButton vCancel;
    private Animation animation;
    private Spinner category_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_manage_activity);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        context = getApplicationContext();

        vAddLogo = findViewById(R.id.gv_logo_grid);
        mViewAdapter = new LogoGridViewAdapter(context, this);
        vAddLogo.setAdapter(mViewAdapter);
        vAddName = findViewById(R.id.actv_add_name);
        vAddCategory = findViewById(R.id.actv_add_category);
        vAddPercent = findViewById(R.id.et_add_percent);
        vSelectedImage = findViewById(R.id.iv_selected_logo);
        vCancel = findViewById(R.id.ib_cancel_logo);

        vCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Canceled", Toast.LENGTH_SHORT).show();
                lastLoadedImage.clearAnimation();
                vCancel.setVisibility(View.GONE);
                vAddName.setText("");
                vAddName.setCompoundDrawablesWithIntrinsicBounds(null,null,null,null);
                vSelectedImage.setImageResource(0);
            }
        });

        category_list = findViewById(R.id.sp_category_list);
        String[] items = new String[]{"1", "2", "three","1", "2", "three","1", "2", "three","1", "2", "three","1", "2", "three","1", "2", "three","1", "2", "three"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        category_list.setAdapter(adapter);


    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void recyclerViewItemClicked(final LogoViewHolder holder, final int position) {

        holder.vLogoView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                    if (lastLoadedImage != null) {
                        lastLoadedImage.clearAnimation();
                    }
                    vCancel.setVisibility(View.VISIBLE);
                    animation = AnimationUtils.loadAnimation(context, R.anim.bounce);
                    vSelectedImage.setImageResource(mViewAdapter.getLogos[position]);
                    vSelectedImage.startAnimation(animation);

                    vAddName.setText(mViewAdapter.getNames[position]);
                    vAddName.setCompoundDrawablesWithIntrinsicBounds(getResources()
                                    .getDrawable(mViewAdapter.getLogos[position], null)
                            , null, null, null);
                    vAddName.startAnimation(animation);

                    lastLoadedImage = holder.vLogoView;
                    animation = AnimationUtils.loadAnimation(context, R.anim.blink);
                    holder.vLogoView.startAnimation(animation);

            }
        });

    }
}
