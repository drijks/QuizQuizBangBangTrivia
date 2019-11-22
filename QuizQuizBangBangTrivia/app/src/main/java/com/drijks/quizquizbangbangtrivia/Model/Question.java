package com.drijks.quizquizbangbangtrivia.Model;


import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by diana on 3/27/2018.
 */

public class Question implements Parcelable {
    private String name;
    private String theQuestion;
    private String realAnswer;
    private String fakeAnswer1;
    private String fakeAnswer2;
    private String fakeAnswer3;
    private String category;
    private String subcategory;
    private String funFact;

    public Question(String name, String theQuestion, String realAnswer, String fakeAnswer1, String fakeAnswer2, String fakeAnswer3, String category, String subcategory, String funFact) {
        this.name = name;
        this.theQuestion = theQuestion;
        this.realAnswer = realAnswer;
        this.fakeAnswer1 = fakeAnswer1;
        this.fakeAnswer2 = fakeAnswer2;
        this.fakeAnswer3 = fakeAnswer3;
        this.category = category;
        this.subcategory = subcategory;
        this.funFact = funFact;

    }

    public Question(Parcel in) {
        this.name = in.readString();
        this.theQuestion = in.readString();
        this.realAnswer = in.readString();
        this.fakeAnswer1 = in.readString();
        this.fakeAnswer2 = in.readString();
        this.fakeAnswer3 = in.readString();
        this.category = in.readString();
        this.subcategory = in.readString();
        this.funFact = in.readString();

    }


    public static final Creator<Question> CREATOR = new Creator<Question>() {
        @Override
        public Question createFromParcel(Parcel in) {
            return new Question(in);
        }

        @Override
        public Question[] newArray(int size) {
            return new Question[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) { this.name = name; }

    public String getTheQuestion() {
        return theQuestion;
    }

    public void setTheQuestion(String theQuestion) {
        this.theQuestion = theQuestion;
    }

    public String getRealAnswer() {
        return realAnswer;
    }

    public void setRealAnswer(String realAnswer) {
        this.realAnswer = realAnswer;
    }

    public String getFakeAnswer1() {
        return fakeAnswer1;
    }

    public void setFakeAnswer1(String fakeAnswer1) {
        this.fakeAnswer1 = fakeAnswer1;
    }

    public String getFakeAnswer2() {
        return fakeAnswer2;
    }

    public void setFakeAnswer2(String fakeAnswer2) {
        this.fakeAnswer2 = fakeAnswer2;
    }

    public String getFakeAnswer3() {
        return fakeAnswer3;
    }

    public void setFakeAnswer3(String fakeAnswer3) {
        this.fakeAnswer3 = fakeAnswer3;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setSubcategory(String subcategory) { this.subcategory = subcategory; }

    public String getSubcategory() { return subcategory; }

    public String getFunFact() {
        return funFact;
    }

    public void setFunFact(String funFact) {
        this.funFact = funFact;
    }

    public int getImg(Context context){
        Resources resources = context.getResources();
        final int resourceId = resources.getIdentifier(category, "drawable",context.getPackageName());
        return resourceId;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(theQuestion);
        parcel.writeString(realAnswer);
        parcel.writeString(fakeAnswer1);
        parcel.writeString(fakeAnswer2);
        parcel.writeString(fakeAnswer3);
        parcel.writeString(category);
        parcel.writeString(subcategory);
        parcel.writeString(funFact);
    }
}