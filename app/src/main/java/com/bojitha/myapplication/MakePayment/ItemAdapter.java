package com.bojitha.myapplication.MakePayment;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bojitha.myapplication.R;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {
    public static final int SPAN_COUNT_ONE = 1;
    public static final int SPAN_COUNT_THREE = 3;

    private static final int VIEW_TYPE_SMALL = 1;
    private static final int VIEW_TYPE_BIG = 2;

    private List<Item> mItems;
    private GridLayoutManager mLayoutManager;

    public ItemAdapter(List<Item> items, GridLayoutManager layoutManager) {
        mItems = items;
        mLayoutManager = layoutManager;
    }

    @Override
    public int getItemViewType(int position) {
        int spanCount = mLayoutManager.getSpanCount();
        return VIEW_TYPE_BIG;
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_big, parent, false);
        return new ItemViewHolder(view, viewType);
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        Item item = mItems.get(position % 4);
        holder.title.setText(item.getAlias());
        holder.iv.setImageResource(item.getImgResId());
        holder.info.setText(item.getNumber());
    }

    @Override
    public int getItemCount() {
        return 30;
    }

    class ItemViewHolder extends RecyclerView.ViewHolder {
        ImageView iv;
        TextView title;
        TextView info;

        ItemViewHolder(View itemView, int viewType) {
            super(itemView);
            iv = (ImageView) itemView.findViewById(R.id.image_big);
            title = (TextView) itemView.findViewById(R.id.title_big);
            info = (TextView) itemView.findViewById(R.id.tv_info);
        }
    }
}
