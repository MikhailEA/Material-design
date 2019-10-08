package com.example.projectmaterial.presenter;


import com.example.projectmaterial.view.IViewHolder;
import com.example.projectmaterial.view.MyAdapter;

public interface IRecyclerThreePresenter {
    void bindView(IViewHolder holder);

    void bindView(MyAdapter.MyViewHolder iViewHolder);
    int getItemCount();
}
