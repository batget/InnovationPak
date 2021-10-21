package by.belohvostik.innovationpak.services;

import by.belohvostik.innovationpak.models.Orders;

import java.util.List;

public interface OrdersService {

    Orders getOrdersFindById(Integer id);

    List<Orders> readAll();

    Orders save(Orders orders);

    Orders update(Orders orders);

    void deleteById(int id);

}
