package by.belohvostik.innovationpak.controllers;

import by.belohvostik.innovationpak.models.Goods;
import by.belohvostik.innovationpak.services.GoodsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Goods")
public record GoodsController(GoodsService goodsService) {

    @GetMapping("/read/{id}")
    public Goods readGoods(@PathVariable Integer id) {
        return goodsService.getGoodsFindById(id);
    }

    @GetMapping("/readAll")
    public List<Goods> readCompanyAll(Goods goods) {
        return goodsService.readAll();

    }

    @PostMapping("/create")
    public Goods create(@RequestBody Goods goods) {
        return goodsService.save(goods);
    }

    @PutMapping("/update")
    public Goods update(@RequestBody Goods goods) {
        return goodsService.update(goods);
    }


    @DeleteMapping ("/delete/{id}")
    public void delete(@PathVariable("id)") int id) {
        goodsService.deleteById(id);
    }

}
