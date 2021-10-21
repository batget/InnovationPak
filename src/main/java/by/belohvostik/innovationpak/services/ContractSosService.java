package by.belohvostik.innovationpak.services;

import by.belohvostik.innovationpak.models.ContractSos;

import java.util.List;

public interface ContractSosService {

    ContractSos getContractSosFindById(Integer id);

    List<ContractSos> readAll();

    ContractSos save(ContractSos contractSos);

    ContractSos update(ContractSos contractSos);

    void deleteById(int id);
}
