package com.jamessimshaw.pokedatagraph.models;

/**
 * Created by james on 2/25/17.
 */

public class Pokemon {
    private int mId, mTotalStats, mHp, mAttack, mDefense, mSpecialAttack, mSpecialDefense, mSpeed,
                mGeneration, mCatchRate;
    private String mName, mType1, mType2, mColor, mEggGroup1, mEggGroup2, mBodyStyle;
    private boolean mLegendary, mGendered, mMega;
    private double mMaleOdds, mHeight, mWeight;

    public Pokemon(int id, String name, String type1, String type2, int totalStats, int hp,
                   int attack, int defense, int specialAttack, int specialDefense, int speed,
                   int generation, boolean legendary, String color, boolean gendered,
                   double maleOdds, String eggGroup1, String eggGroup2, boolean mega, double height,
                   double weight, int catchRate, String bodyStyle) {
        mId = id;
        mName = name;
        mType1 = type1;
        mType2 = type2;
        mTotalStats = totalStats;
        mHp = hp;
        mAttack = attack;
        mDefense = defense;
        mSpecialAttack = specialAttack;
        mSpecialDefense = specialDefense;
        mSpeed = speed;
        mGeneration = generation;
        mLegendary = legendary;
        mColor = color;
        mGendered = gendered;
        mMaleOdds = maleOdds;
        mEggGroup1 = eggGroup1;
        mEggGroup2 = eggGroup2;
        mMega = mega;
        mHeight = height;
        mWeight = weight;
        mCatchRate = catchRate;
        mBodyStyle = bodyStyle;
    }

    public int getID() {
        return mId;
    }

    public String getName() {
        return mName;
    }

    public String getType1() {
        return mType1;
    }

    public String getType2() {
        return mType2;
    }

    public int getTotalStats() {
        return mTotalStats;
    }

    public int getHP() {
        return mHp;
    }

    public int getAttack() {
        return mAttack;
    }

    public int getDefense() {
        return mDefense;
    }

    public int getSpecialAttack() {
        return mSpecialAttack;
    }

    public int getSpecialDefense() {
        return mSpecialDefense;
    }

    public int getSpeed() {
        return mSpeed;
    }

    public int getGeneration() {
        return mGeneration;
    }

    public boolean getLegendary() {
        return mLegendary;
    }

    public String getColor() {
        return mColor;
    }

    public boolean getGendered() {
        return mGendered;
    }

    public double getMaleOdds() {
        return mMaleOdds;
    }

    public String getEggGroup1() {
        return mEggGroup1;
    }

    public String getEggGroup2() {
        return mEggGroup2;
    }

    public boolean getMega() {
        return mMega;
    }

    public double getHeight() {
        return mHeight;
    }

    public double getWeight() {
        return mWeight;
    }

    public int getCatchRate() {
        return mCatchRate;
    }

    public String getBodyStyle() {
        return mBodyStyle;
    }
}
