package by.belohvostik.innovationpak.services;

import by.belohvostik.innovationpak.models.ContractSos;
import by.belohvostik.innovationpak.repository.ContractSosRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DefContractSosService implements ContractSosService {

    private final ContractSosRepository contractSosRepository;

    @Override
    public ContractSos getContractSosFindById(Integer id) {
        return contractSosRepository.findById(id).get();
    }
}
