package br.com.heiderlopes.demomultitelasandroid;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DetalheItemFragment extends android.support.v4.app.Fragment {
    private Item item;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        item = (Item) getArguments().getSerializable("item");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detalhe_item,
                container, false);
        TextView tvTitle = (TextView) view.findViewById(R.id.tvTitulo);
        TextView tvBody = (TextView) view.findViewById(R.id.tvSubtitulo);
        tvTitle.setText(item.getTitle());
        tvBody.setText(item.getBody());
        return view;
    }

    public static DetalheItemFragment newInstance(Item item) {
        DetalheItemFragment fragmentDemo = new DetalheItemFragment();
        Bundle args = new Bundle();
        args.putSerializable("item", item);
        fragmentDemo.setArguments(args);
        return fragmentDemo;
    }
}