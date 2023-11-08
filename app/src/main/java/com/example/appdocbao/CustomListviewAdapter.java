package com.example.appdocbao;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class CustomListviewAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<NewS> listItem;
    public CustomListviewAdapter(Context context, int layout, List<NewS> listItem) {
        this.context = context;
        this.layout = layout;
        this.listItem = listItem;
    }
    @Override
    public int getCount() {
        return listItem.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
    public class ViewHolder{
        ImageView img;
        TextView tvTitle;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView == null)
        {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(layout, null);
            viewHolder = new ViewHolder();
            viewHolder.img = (ImageView) convertView.findViewById(R.id.img);
            viewHolder.tvTitle = (TextView) convertView.findViewById(R.id.title);
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        NewS newS = listItem.get(position);
        viewHolder.tvTitle.setText(newS.getTitle());
        Picasso.get().load(newS.getImg()).into(viewHolder.img);
        return convertView;

    }
}
