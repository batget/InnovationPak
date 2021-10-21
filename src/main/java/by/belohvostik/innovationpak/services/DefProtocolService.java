package by.belohvostik.innovationpak.services;

import by.belohvostik.innovationpak.models.Protocol;
import by.belohvostik.innovationpak.repository.ProtocolRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DefProtocolService implements  ProtocolService{

    private final ProtocolRepository protocolRepository;

    @Override
    public Protocol getProtocolFindById(Integer id) {
        return protocolRepository.getById(id);
    }

    @Override
    public List<Protocol> readAll() {
        return protocolRepository.findAll();
    }

    @Override
    public Protocol save(Protocol protocol) {
        return protocolRepository.save(protocol);
    }

    @Override
    public Protocol update(Protocol protocol) {
        return protocolRepository.saveAndFlush(protocol);
    }

    @Override
    public void deleteById(int id) {
        protocolRepository.deleteById(id);

    }
}
