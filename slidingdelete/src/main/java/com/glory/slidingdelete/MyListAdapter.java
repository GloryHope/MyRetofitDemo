package com.glory.slidingdelete;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Create by glorizz on 2018/9/1
 * Describe:
 */
public class MyListAdapter extends BaseAdapter {
    private List<String> listData;
    private Context context;


    public MyListAdapter(List<String> listData, Context context) {
        this.listData = listData;
        this.context = context;
    }

    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int position) {
        return listData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.layout_recycler_item, null);
        TextView left = convertView.findViewById(R.id.left);
        TextView right = convertView.findViewById(R.id.right);
        left.setText(listData.get(position));
        return convertView;
    }

    static class ViewHolder {
        private SwipeMenu swipeMenu;

        public ViewHolder(SwipeMenu swipeMenu) {
            this.swipeMenu = swipeMenu;
        }
    }
}
