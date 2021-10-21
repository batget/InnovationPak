package by.belohvostik.innovationpak.controllers;

import by.belohvostik.innovationpak.models.ContractSos;
import by.belohvostik.innovationpak.services.ContractSosService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ContractsSos")
public record ContractSosController(ContractSosService contractSosService) {

    @GetMapping("/read/{id}")
    public ContractSos readContractSos(@PathVariable Integer id) {
        return contractSosService.getContractSosFindById(id);
    }

    @GetMapping("/readAll")
    public List<ContractSos> readAll(ContractSos contractSos) {
        return contractSosService.readAll();

    }

    @PostMapping("/create")
    public ContractSos create(@RequestBody ContractSos contractSos) {
        return contractSosService.save(contractSos);
    }

    @PutMapping("/update")
    public ContractSos update(@RequestBody ContractSos contractSos) {
        return contractSosService.update(contractSos);
    }


    @DeleteMapping ("/delete/{id}")
    public void delete(@PathVariable("id)") int id) {
        contractSosService.deleteById(id);
    }
}
