package by.belohvostik.innovationpak.controllers;

import by.belohvostik.innovationpak.models.ContractSos;
import by.belohvostik.innovationpak.services.ContractSosService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ContractsSos")
public record ContractSosController(ContractSosService contractSosService) {

    @GetMapping("/read/{id}")
    public ContractSos readContractSos(@PathVariable Integer id) {
        return contractSosService.getContractSosFindById(id);
    }
}
