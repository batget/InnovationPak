package by.belohvostik.innovationpak.services;

import by.belohvostik.innovationpak.models.Goods;
import by.belohvostik.innovationpak.repository.GoodsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DefGoodsService implements  GoodsService{

    private final GoodsRepository goodsRepository;

    @Override
    public Goods getGoodsFindById(Integer id) {
        return goodsRepository.findById(id).get();
    }
}
