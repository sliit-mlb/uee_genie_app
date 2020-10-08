package com.bojitha.myapplication.MakePayment;

import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bojitha.myapplication.R;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {
    private static final int VIEW_TYPE_SMALL = 1;
    private int count = 1;

    public static String TYPE = "allBills";

    private List<Item> mItems;
    private GridLayoutManager mLayoutManager;

    public ItemAdapter(List<Item> items, GridLayoutManager layoutManager) {
        mItems = items;
        mLayoutManager = layoutManager;
    }

    @Override
    public int getItemViewType(int position) {
        return VIEW_TYPE_SMALL;
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;

        if (TYPE.equalsIgnoreCase("allBills")) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_big, parent, false);
        } else if(TYPE.equalsIgnoreCase("verifyBills")) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);
        }else {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, parent, false);
        }

        return new ItemViewHolder(view, viewType);
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        Item item = mItems.get(position % 4);
        holder.title.setText(item.getAlias());
        holder.iv.setImageResource(item.getImgResId());
        holder.info.setText(item.getNumber());
        if(TYPE.equalsIgnoreCase("selectWallet")){
            if((count % 2) == 1){
                holder.layout.setBackgroundResource(R.drawable.card_shape);
                holder.img.setImageResource(R.drawable.right_mark);
                count++;
            }else{
                holder.layout.setBackgroundResource(R.drawable.account_shape);
                count++;
            }
        }
        if(TYPE.equalsIgnoreCase("confirmBill")){
            holder.layout.setBackgroundResource(R.drawable.card_shape);
        }
    }

    @Override
    public int getItemCount() {
        if (TYPE.equalsIgnoreCase("allBills")) {
            return 8;
        }else {
            return mItems.size();
        }
    }

    class ItemViewHolder extends RecyclerView.ViewHolder {
        ImageView iv;
        TextView title;
        TextView info;
        LinearLayout layout;
        ImageView img;

        ItemViewHolder(View itemView, int viewType) {
            super(itemView);
            if (TYPE.equalsIgnoreCase("allBills")) {
                iv = (ImageView) itemView.findViewById(R.id.image_big);
                title = (TextView) itemView.findViewById(R.id.title_big);
                info = (TextView) itemView.findViewById(R.id.tv_info);
            } else if(TYPE.equalsIgnoreCase("verifyBills")) {
                iv = (ImageView) itemView.findViewById(R.id.logo);
                title = (TextView) itemView.findViewById(R.id.alias);
                info = (TextView) itemView.findViewById(R.id.number);
            } else {
                iv = (ImageView) itemView.findViewById(R.id.walletImage);
                title = (TextView) itemView.findViewById(R.id.walletAlias);
                info = (TextView) itemView.findViewById(R.id.walletNumber);
                layout = (LinearLayout) itemView.findViewById(R.id.cardLay);
                img = (ImageView) itemView.findViewById(R.id.selectIcon);
            }
        }
    }
}
