package by.belohvostik.innovationpak.controllers;

import by.belohvostik.innovationpak.models.Protocol;
import by.belohvostik.innovationpak.services.ProtocolService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Protocol")
public record ProtocolController(ProtocolService protocolService) {

    @GetMapping("/read/{id}")
    public Protocol readProtocol(@PathVariable Integer id) {
        return protocolService.getProtocolFindById(id);
    }

    @GetMapping("/readAll")
    public List<Protocol> readCompanyAll(Protocol protocol) {
        return protocolService.readAll();

    }

    @PostMapping("/create")
    public Protocol create(@RequestBody Protocol protocol) {
        return protocolService.save(protocol);
    }

    @PutMapping("/update")
    public Protocol update(@RequestBody Protocol protocol) {
        return protocolService.update(protocol);
    }


    @DeleteMapping ("/delete/{id}")
    public void delete(@PathVariable("id)") int id) {
        protocolService.deleteById(id);
    }

}
