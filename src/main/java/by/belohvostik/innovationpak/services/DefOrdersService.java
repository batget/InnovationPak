package by.belohvostik.innovationpak.services;

import by.belohvostik.innovationpak.models.Orders;
import by.belohvostik.innovationpak.repository.OrdersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DefOrdersService implements OrdersService{

    private final OrdersRepository ordersRepository;

    @Override
    public Orders getOrdersFindById(Integer id) {
        return ordersRepository.findById(id).get();
    }
}
