package com.example.android.miwok;

public class Word {

    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private  int mImageResourceId=HAS_NO_IMAGE;

    private int mAudioResourceId;

    private static final int HAS_NO_IMAGE = -1;

    public Word(String defaultTranslation,String MiwokTranslation,int AudioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = MiwokTranslation;
        mAudioResourceId=AudioResourceId;
    }

    public  Word(String defaultTranslation,String MiwokTranslation,int ImageResourceId,int AudioResourceId){
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=MiwokTranslation;
        mImageResourceId=ImageResourceId;
        mAudioResourceId=AudioResourceId;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId(){
        return  mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != HAS_NO_IMAGE;
    }

    //tells the word adapter whether there is a image for a word
    public int getAudioResourceId(){
        return mAudioResourceId;
    }

}

