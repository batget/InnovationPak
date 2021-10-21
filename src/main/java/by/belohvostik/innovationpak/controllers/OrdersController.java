package by.belohvostik.innovationpak.controllers;

import by.belohvostik.innovationpak.models.Orders;
import by.belohvostik.innovationpak.services.OrdersService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Orders")
public record OrdersController(OrdersService ordersService) {

    @GetMapping("/read/{id}")
    public Orders readOrders(@PathVariable Integer id) {
        return ordersService.getOrdersFindById(id);
    }

    @GetMapping("/readAll")
    public List<Orders> readCompanyAll(Orders orders) {
        return ordersService.readAll();

    }

    @PostMapping("/create")
    public Orders create(@RequestBody Orders orders) {
        return ordersService.save(orders);
    }

    @PutMapping("/update")
    public Orders update(@RequestBody Orders orders) {
        return ordersService.update(orders);
    }


    @DeleteMapping ("/delete/{id}")
    public void delete(@PathVariable("id)") int id) {
        ordersService.deleteById(id);
    }


}
