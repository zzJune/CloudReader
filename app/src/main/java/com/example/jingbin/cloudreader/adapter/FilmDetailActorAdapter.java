package com.example.jingbin.cloudreader.adapter;

import com.example.jingbin.cloudreader.R;
import com.example.jingbin.cloudreader.base.binding.BaseBindingAdapter;
import com.example.jingbin.cloudreader.bean.FilmDetailBean;
import com.example.jingbin.cloudreader.databinding.ItemFilmDetailActorBinding;

/**
 * Created by jingbin on 2016/12/10.
 */

public class FilmDetailActorAdapter extends BaseBindingAdapter<FilmDetailBean.ActorsBean, ItemFilmDetailActorBinding> {

    public FilmDetailActorAdapter() {
        super(R.layout.item_film_detail_actor);
    }

    @Override
    protected void bindView(FilmDetailBean.ActorsBean bean, ItemFilmDetailActorBinding binding, int position) {
        binding.setPersonBean(bean);
    }
}
