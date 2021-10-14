package by.belohvostik.innovationpak.services;

import by.belohvostik.innovationpak.models.Protocol;
import by.belohvostik.innovationpak.repository.ProtocolRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DefProtocolService implements  ProtocolService{

    private final ProtocolRepository protocolRepository;

    @Override
    public Protocol getProtocolFindById(Integer id) {
        return protocolRepository.findById(id).get();
    }
}
