package by.belohvostik.innovationpak.services;

import by.belohvostik.innovationpak.models.Goods;

import java.util.List;

public interface GoodsService {

    Goods getGoodsFindById(Integer id);

    List<Goods> readAll();

    Goods save(Goods goods);

    Goods update(Goods goods);

    void deleteById(int id);
}
