package com.example.hp.recycleradapterwithcardview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.ViewHolder> {
    private Context context;
    private List<Orders> orders;

    public OrderAdapter(Context context, List<Orders> orders) {
        this.context = context;
        this.orders = orders;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView order_no,description,date,time;
        ImageView product_image;
        public ViewHolder(View itemView) {
            super(itemView);
            order_no = (TextView)itemView.findViewById(R.id.order_no);
            description = (TextView)itemView.findViewById(R.id.order_desc);
            date = (TextView)itemView.findViewById(R.id.date);
            time = (TextView)itemView.findViewById(R.id.time);
            product_image = (ImageView)itemView.findViewById(R.id.product_image);
        }
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Orders order = orders.get(position);
        holder.order_no.setText(order.getOrder_no());
        holder.description.setText(order.getDescription());
        holder.date.setText(order.getDate());
        holder.time.setText(order.getTime());
        holder.product_image.setImageResource(order.getProduct_image());

    }

    @Override
    public int getItemCount() {
        return orders.size();
    }

}
