package by.belohvostik.innovationpak.controllers;

import by.belohvostik.innovationpak.models.Goods;
import by.belohvostik.innovationpak.services.GoodsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Goods")
public record GoodsController(GoodsService goodsService) {

    @GetMapping("/read/{id}")
    public Goods readGoods(@PathVariable Integer id) {
        return goodsService.getGoodsFindById(id);
    }

}
