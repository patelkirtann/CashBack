package com.calculator.cashback;

/**
 * Created by kt_ki on 8/10/2017.
 */

public class CardInfoModel {
    private int mID;
    private String mNameOfCard;
    private String mTypeOfReward;
    private double mPercentage;
    private int mCardLogo;

    public int getmID() {
        return mID;
    }

    public void setmID(int mID) {
        this.mID = mID;
    }

    public String getmNameOfCard() {
        return mNameOfCard;
    }

    public void setmNameOfCard(String mNameOfCard) {
        this.mNameOfCard = mNameOfCard;
    }

    public String getmTypeOfReward() {
        return mTypeOfReward;
    }

    public void setmTypeOfReward(String mTypeOfReward) {
        this.mTypeOfReward = mTypeOfReward;
    }

    public double getmPercentage() {
        return mPercentage;
    }

    public void setmPercentage(double mPercentage) {
        this.mPercentage = mPercentage;
    }

    public int getmCardLogo() {
        return mCardLogo;
    }

    public void setmCardLogo(int mCardLogo) {
        this.mCardLogo = mCardLogo;
    }
}
