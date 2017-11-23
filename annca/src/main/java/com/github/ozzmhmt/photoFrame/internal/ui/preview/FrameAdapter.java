package io.github.memfis19.annca.internal.ui.preview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.mingle.listener.SingleClickListener;

import java.util.ArrayList;

import io.github.memfis19.annca.R;

/**
 * Created by mehmet on 22.11.2017.
 */

class FrameAdapter extends RecyclerView.Adapter<FrameAdapter.ViewHolder> {
    private ArrayList<ItemEntity> mArray;
    public FrameAdapter(ArrayList<ItemEntity> mArray) {
        this.mArray=mArray;
    }

    @Override
    public FrameAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View v= inflater.inflate(R.layout.row,parent,false);
        ViewHolder vh=new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(FrameAdapter.ViewHolder holder, int position) {

        holder.linerLl.setOnClickListener(mSingleClickListener);
        holder.linerLl.setTag(holder.getAdapterPosition());
        ItemEntity itemEntity=mArray.get(position);
    holder.title.setText(itemEntity.title);
      holder.icon.setImageResource(itemEntity.iconId);
    }

    @Override
    public int getItemCount() {
        return mArray.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView title;
        public ImageView icon;
        public LinearLayout linerLl;
        public ViewHolder(View itemView) {
            super(itemView);
            linerLl= (LinearLayout) itemView.findViewById(R.id.itemLl);
            title= (TextView) itemView.findViewById(R.id.title);
            icon= (ImageView) itemView.findViewById(R.id.icon);
        }



    }
    public AdapterView.OnItemClickListener mOnItemClickListener;

    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        mOnItemClickListener = onItemClickListener;
    }

    private SingleClickListener mSingleClickListener = new SingleClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int position = (int) v.getTag();

            if (mOnItemClickListener != null) {
                mOnItemClickListener.onItemClick(null, v, position, position);

            }

        }
    });
}
