package by.belohvostik.innovationpak.services;

import by.belohvostik.innovationpak.models.Goods;
import by.belohvostik.innovationpak.repository.GoodsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DefGoodsService implements  GoodsService{

    private final GoodsRepository goodsRepository;

    @Override
    public Goods getGoodsFindById(Integer id) {
        return goodsRepository.getById(id);
    }

    @Override
    public List<Goods> readAll() {
        return goodsRepository.findAll();
    }

    @Override
    public Goods save(Goods goods) {
        return goodsRepository.save(goods);
    }

    @Override
    public Goods update(Goods goods) {
        return goodsRepository.saveAndFlush(goods);
    }

    @Override
    public void deleteById(int id) {
        goodsRepository.deleteById(id);

    }
}
