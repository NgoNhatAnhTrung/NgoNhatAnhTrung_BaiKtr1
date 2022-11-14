package com.example.baikt1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CaSiAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<CaSi> casiList;

    public CaSiAdapter(Context context, int layout, List<CaSi> casiList) {
        this.context = context;
        this.layout = layout;
        this.casiList = casiList;
    }

    @Override
    public int getCount() {
        return casiList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder{
        ImageView imgHinh;
        TextView txtTenCaSi, txtNgheDanh, txtQuocGia, txtSoSao;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder holder;

        if (view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            view = inflater.inflate(layout, null);
            holder = new ViewHolder();

            //anh xa view
            holder.txtTenCaSi = (TextView) view.findViewById(R.id.textviewTenCaSi);
            holder.txtNgheDanh = (TextView) view.findViewById(R.id.textviewNgheDanh);
            holder.txtQuocGia = (TextView) view.findViewById(R.id.textviewQuocGia);
            holder.txtSoSao = (TextView) view.findViewById(R.id.textviewSoSao);
            holder.imgHinh= (ImageView) view.findViewById(R.id.imageviewHinh);
            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }

        // gan gia tri
        CaSi casi = casiList.get(i);

        holder.txtTenCaSi.setText(casi.getTenCaSi());
        holder.txtNgheDanh.setText(casi.getNgheDanh());
        holder.txtQuocGia.setText(casi.getQuocGia());
        holder.txtSoSao.setText(casi.getSoSao());
        holder.imgHinh.setImageResource(casi.getHinh());

        return view;
    }
}
