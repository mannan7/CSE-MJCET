package com.example.cse_mjcet;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class TeacherAdapter extends RecyclerView.Adapter<TeacherAdapter.ProductViewHolder> {


    //this context we will use to inflate the layout
    private Context mCtx;

    //we are storing all the products in a list
    private List<Teacher> productList;

    //getting the context and product list with constructor
    public TeacherAdapter(Context mCtx, List<Teacher> productList) {
        this.mCtx = mCtx;
        this.productList = productList;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflating and returning our view holder
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.layout_teachers, null);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        //getting the product of the specified position
        Teacher product = productList.get(position);

        //binding the data with the viewholder views
        holder.textViewName.setText(product.getName());
        holder.textViewDesignation.setText(product.getDesignation());
        holder.textViewQualification.setText(product.getQualification());
        holder.textViewMobile.setText(product.getMobile());
        holder.textViewRoom.setText(product.getRoom());

        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(product.getImage()));

    }


    @Override
    public int getItemCount() {
        return productList.size();
    }


    class ProductViewHolder extends RecyclerView.ViewHolder {

        TextView textViewName, textViewDesignation, textViewQualification, textViewMobile, textViewRoom;
        ImageView imageView;

        public ProductViewHolder(View itemView) {
            super(itemView);

            textViewName = itemView.findViewById(R.id.textViewName);
            textViewDesignation = itemView.findViewById(R.id.textViewDesignation);
            textViewQualification = itemView.findViewById(R.id.textViewQualification);
            textViewMobile = itemView.findViewById(R.id.textViewMobile);
            textViewRoom = itemView.findViewById(R.id.textViewRoom);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}