package by.belohvostik.innovationpak.controllers;

import by.belohvostik.innovationpak.models.Orders;
import by.belohvostik.innovationpak.services.OrdersService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Orders")
public record OrdersController(OrdersService ordersService) {

    @GetMapping("/read/{id}")
    public Orders readOrders(@PathVariable Integer id) {
        return ordersService.getOrdersFindById(id);
    }


}
