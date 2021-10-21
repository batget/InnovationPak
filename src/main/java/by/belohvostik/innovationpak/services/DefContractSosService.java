package by.belohvostik.innovationpak.services;

import by.belohvostik.innovationpak.models.ContractSos;
import by.belohvostik.innovationpak.repository.ContractSosRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DefContractSosService implements ContractSosService {

    private final ContractSosRepository contractSosRepository;

    @Override
    public ContractSos getContractSosFindById(Integer id) {
        return contractSosRepository.getById(id);
    }

    @Override
    public List<ContractSos> readAll() {
        return contractSosRepository.findAll();
    }

    @Override
    public ContractSos save(ContractSos contractSos) {
        return contractSosRepository.save(contractSos);
    }

    @Override
    public ContractSos update(ContractSos contractSos) {
        return contractSosRepository.saveAndFlush(contractSos);
    }

    @Override
    public void deleteById(int id) {
        contractSosRepository.deleteById(id);

    }
}
