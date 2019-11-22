package com.drijks.quizquizbangbangtrivia;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.drijks.quizquizbangbangtrivia.Model.QuestionResult;

import java.util.ArrayList;


public class CustomAdapter extends ArrayAdapter {

    private Context mContext;
    private int mListItemLayout;
    private ArrayList<QuestionResult> mList;


    //being called when creation
    //constructor
    //take 3 inputs and make them available for getView()
    public CustomAdapter(Context context, int resource, ArrayList<QuestionResult> animalList) {
        super(context,resource,animalList);

        mContext= context;
        mListItemLayout=resource;
        mList=animalList;

    }


    //when row of list created, getview() called each time
    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {

        View view;


        //data process, position of row-> 0,1,2,3,4,...
        //using position, get a question from list
        final QuestionResult question = mList.get(position);


//        convertview is reusable view for the row.
        //once you inflate the row, convertview is available for reuse.
        if(convertView==null){
            Log.d("ddd",position+" convertview is null");

            LayoutInflater layoutInflater = LayoutInflater.from(mContext);
            view = layoutInflater.inflate(mListItemLayout, null, false);

        }else{
            view = convertView;
            Log.d("ddd",position+" convertview is not null....");
        }



        ImageView catimg = view.findViewById(R.id.question_image);
        TextView name = view.findViewById(R.id.question_name);
//        TextView gender = view.findViewById(R.id.gender);
        TextView category = view.findViewById(R.id.category);

        catimg.setImageResource(question.getImg(getContext()));
        name.setText(question.getName());
//        gender.setText(question.getGender());
        category.setText(question.getCategory());

        if (question.isCorrect()){
            view.setBackgroundColor(mContext.getResources().getColor(R.color.LimeGreen));
        }
        else{
            view.setBackgroundColor(mContext.getResources().getColor(R.color.Red));
        }

        //identify a question and make change
        //make sure add else....

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Log.d("ddd", question.getName()+" clicked...");


                Intent intent = new Intent(mContext, QuestionDetail.class);
//                intent.putExtra("question",String.valueOf(question));
                intent.putExtra("category",question.getImg(getContext()));
                intent.putExtra("name",question.getName());
//                intent.putExtra("category",question.getGender());
//                intent.putExtra("species",question.getSpecies());
//                intent.putExtra("nickname", question.getNickname());
                intent.putExtra("funfact", question.getFunFact());
//                intent.putExtra("story", question.getStory());
                mContext.startActivity(intent);
            }
        });
        return  view;

    }


}