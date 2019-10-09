package com.example.projectmaterial.presenter;

import com.example.projectmaterial.model.Data;
import com.example.projectmaterial.view.IViewHolder;
import com.example.projectmaterial.view.MyAdapter;

import java.util.List;

public class ThreePresenter {

    RecyclerThreePresenter recyclerMainPresenter = new RecyclerThreePresenter();

    private class RecyclerThreePresenter implements IRecyclerThreePresenter {

        private Data data = new Data();
        private List<String> list = data.getList();

        @Override
        public void bindView(IViewHolder holder) {
            holder.setText(list.get(holder.getPos()));
        }

        @Override
        public void bindView(MyAdapter.MyViewHolder iViewHolder) {

        }

        @Override
        public int getItemCount() {
            return list.size();
        }
    }

    public RecyclerThreePresenter getRecyclerMainPresenter() {
        return recyclerMainPresenter;
    }
}
