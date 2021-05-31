package com.example.android.covid19;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class VaccineAdapter extends ArrayAdapter<ArrayList<VaccineModel>> {

    private static final String LOG_TAG = VaccineAdapter.class.getSimpleName();
    public String mComDates;
    public String D1, D2, D3, D4, D5;

    public VaccineAdapter(@NonNull Activity context, ArrayList<ArrayList<VaccineModel>> slots, String ComDates) {
        super(context, 0, slots);
        mComDates = ComDates;
        String[] SplitDates = mComDates.split("/");
        D1 = SplitDates[0];
        D2 = SplitDates[1];
        D3 = SplitDates[2];
        D4 = SplitDates[3];
        D5 = SplitDates[4];
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item1, parent, false);
        }
        ArrayList<VaccineModel> currentVaccineModel = getItem(position);

        TextView mCentre_Address = (TextView) listItemView.findViewById(R.id.Centre_Address);

        TextView mSlot_data_1 = (TextView) listItemView.findViewById(R.id.slot_data_1);
        TextView mSlot_data_2 = (TextView) listItemView.findViewById(R.id.slot_data_2);
        TextView mSlot_data_3 = (TextView) listItemView.findViewById(R.id.slot_data_3);
        TextView mSlot_data_4 = (TextView) listItemView.findViewById(R.id.slot_data_4);
        TextView mSlot_data_5 = (TextView) listItemView.findViewById(R.id.slot_data_5);

        TextView mSlot_type_1 = (TextView) listItemView.findViewById(R.id.slot_type_1);
        TextView mSlot_type_2 = (TextView) listItemView.findViewById(R.id.slot_type_2);
        TextView mSlot_type_3 = (TextView) listItemView.findViewById(R.id.slot_type_3);
        TextView mSlot_type_4 = (TextView) listItemView.findViewById(R.id.slot_type_4);
        TextView mSlot_type_5 = (TextView) listItemView.findViewById(R.id.slot_type_5);

        TextView mSlot_age_1 = (TextView) listItemView.findViewById(R.id.slot_age_1);
        TextView mSlot_age_2 = (TextView) listItemView.findViewById(R.id.slot_age_2);
        TextView mSlot_age_3 = (TextView) listItemView.findViewById(R.id.slot_age_3);
        TextView mSlot_age_4 = (TextView) listItemView.findViewById(R.id.slot_age_4);
        TextView mSlot_age_5 = (TextView) listItemView.findViewById(R.id.slot_age_5);

//        TextView mDate_1 = (TextView) listItemView.findViewById(R.id.Date1);
//        TextView mDate_2 = (TextView) listItemView.findViewById(R.id.Date2);
//        TextView mDate_3 = (TextView) listItemView.findViewById(R.id.Date3);
//        TextView mDate_4 = (TextView) listItemView.findViewById(R.id.Date4);
//        TextView mDate_5 = (TextView) listItemView.findViewById(R.id.Date5);
        //Log.e(LOG_TAG, "Size="+D1);
        //Log.e(LOG_TAG, "Size="+currentVaccineModel.get(0).getDate());
        mCentre_Address.setText(currentVaccineModel.get(0).getCentre_name());
        //Log.e(LOG_TAG, String.valueOf(currentVaccineModel.size()));
        String Dt, Ds1, Ds2;
        int x;
        for(int i=0;i<currentVaccineModel.size();i++){
            Dt = currentVaccineModel.get(i).getDate();

            if(Dt.charAt(0)==D1.charAt(0) && Dt.charAt(1)==D1.charAt(1)){
                Ds1 = currentVaccineModel.get(i).getDose1();
                Ds2 = currentVaccineModel.get(i).getDose2();
                x = Integer.valueOf(Ds1) + Integer.valueOf(Ds2);
                mSlot_data_1.setText(String.valueOf(x));
                mSlot_type_1.setText(currentVaccineModel.get(i).getType());
                mSlot_age_1.setText(currentVaccineModel.get(i).getAge()+"+");
                //Log.e(LOG_TAG, "Hey");
            }else if(Dt.charAt(0)==D2.charAt(0) && Dt.charAt(1)==D2.charAt(1)){
                Ds1 = currentVaccineModel.get(i).getDose1();
                Ds2 = currentVaccineModel.get(i).getDose2();
                x = Integer.valueOf(Ds1) + Integer.valueOf(Ds2);
                mSlot_data_2.setText(String.valueOf(x));
                mSlot_type_2.setText(currentVaccineModel.get(i).getType());
                mSlot_age_2.setText(currentVaccineModel.get(i).getAge()+"+");
                //Log.e(LOG_TAG, "Hey");
            }else if(Dt.charAt(0)==D3.charAt(0) && Dt.charAt(1)==D3.charAt(1)){
                Ds1 = currentVaccineModel.get(i).getDose1();
                Ds2 = currentVaccineModel.get(i).getDose2();
                x = Integer.valueOf(Ds1) + Integer.valueOf(Ds2);
                mSlot_data_3.setText(String.valueOf(x));
                mSlot_type_3.setText(currentVaccineModel.get(i).getType());
                mSlot_age_3.setText(currentVaccineModel.get(i).getAge()+"+");
                //Log.e(LOG_TAG, "Hey");
            }else if(Dt.charAt(0)==D4.charAt(0) && Dt.charAt(1)==D4.charAt(1)){
                Ds1 = currentVaccineModel.get(i).getDose1();
                Ds2 = currentVaccineModel.get(i).getDose2();
                x = Integer.valueOf(Ds1) + Integer.valueOf(Ds2);
                mSlot_data_4.setText(String.valueOf(x));
                mSlot_type_4.setText(currentVaccineModel.get(i).getType());
                mSlot_age_4.setText(currentVaccineModel.get(i).getAge()+"+");
                //Log.e(LOG_TAG, "Hey");
            }else if(Dt.charAt(0)==D5.charAt(0) && Dt.charAt(1)==D5.charAt(1)){
                Ds1 = currentVaccineModel.get(i).getDose1();
                Ds2 = currentVaccineModel.get(i).getDose2();
                x = Integer.valueOf(Ds1) + Integer.valueOf(Ds2);
                mSlot_data_5.setText(String.valueOf(x));
                mSlot_type_5.setText(currentVaccineModel.get(i).getType());
                mSlot_age_5.setText(currentVaccineModel.get(i).getAge()+"+");
                //Log.e(LOG_TAG, "Hey");
            }else{
                Log.e(LOG_TAG, "Hey1");
            }
        }



        return listItemView;
    }
}
