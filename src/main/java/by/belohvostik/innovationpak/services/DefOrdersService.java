package by.belohvostik.innovationpak.services;

import by.belohvostik.innovationpak.models.Orders;
import by.belohvostik.innovationpak.repository.OrdersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DefOrdersService implements OrdersService{

    private final OrdersRepository ordersRepository;

    @Override
    public Orders getOrdersFindById(Integer id) {
        return ordersRepository.getById(id);
    }

    @Override
    public List<Orders> readAll() {
        return ordersRepository.findAll();
    }

    @Override
    public Orders save(Orders orders) {
        return ordersRepository.save(orders);
    }

    @Override
    public Orders update(Orders orders) {
        return ordersRepository.saveAndFlush(orders);
    }

    @Override
    public void deleteById(int id) {
        ordersRepository.deleteById(id);

    }
}
