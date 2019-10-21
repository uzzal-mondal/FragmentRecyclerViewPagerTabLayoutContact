package com.example.fragmentwithrecycler.Contact;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fragmentwithrecycler.R;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context context;
    private List<ContactModel> contactModelList;
    Dialog myDailog;


    public RecyclerViewAdapter(Context context, List<ContactModel> contactModelList) {
        this.context = context;
        this.contactModelList = contactModelList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_contact_row,
                parent, false);
        final MyViewHolder myViewHolder = new MyViewHolder(view);







        myDailog = new Dialog(context);
        myDailog.setContentView(R.layout.dailog_contact);
        myDailog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));



        myViewHolder.constraintItem_contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final TextView dialogNameTv = myDailog.findViewById(R.id.textDailogName_id);
                final TextView dialogPhoneTv = myDailog.findViewById(R.id.textDailogPhone_id);
                final ImageView dailog_contact_img = myDailog.findViewById(R.id.dailogImageCircle_id);

                dialogNameTv.setText(contactModelList.get(myViewHolder.
                        getAdapterPosition()).getName());
                dialogPhoneTv.setText(contactModelList.get(myViewHolder.
                        getAdapterPosition()).getPhone());
                dailog_contact_img.setImageResource(contactModelList.get(myViewHolder
                .getAdapterPosition()).getImage());

                Toast.makeText(context, ""+String.valueOf(myViewHolder.getAdapterPosition()),
                        Toast.LENGTH_SHORT).show();

                myDailog.show();

            }
        });

        return myViewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {


        holder.textMain.setText(contactModelList.get(position).getName());
        holder.textSub.setText(contactModelList.get(position).getPhone());
        holder.imageContactRow.setImageResource(contactModelList.get(position).getImage());




    }

    @Override
    public int getItemCount() {
        return contactModelList.size();

    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private ConstraintLayout constraintItem_contact;
        private ImageView imageContactRow, imagCallBack;
        private TextView textMain, textSub;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            constraintItem_contact = itemView.findViewById(R.id.constraint_contact_item_id);
            textMain = itemView.findViewById(R.id.textMainCountryContact_id);
            textSub = itemView.findViewById(R.id.textSubTitleContact_id);
            imageContactRow = itemView.findViewById(R.id.imageContactRow_id);
            imagCallBack = itemView.findViewById(R.id.imageContactCallBack_id);
        }
    }
}
