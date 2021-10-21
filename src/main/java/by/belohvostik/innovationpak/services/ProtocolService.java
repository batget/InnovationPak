package by.belohvostik.innovationpak.services;

import by.belohvostik.innovationpak.models.Protocol;

import java.util.List;

public interface ProtocolService {

    Protocol getProtocolFindById(Integer id);

    List<Protocol> readAll();

    Protocol save(Protocol protocol);

    Protocol update(Protocol protocol);

    void deleteById(int id);

}
