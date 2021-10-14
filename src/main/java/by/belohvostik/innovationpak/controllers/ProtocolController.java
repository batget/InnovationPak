package by.belohvostik.innovationpak.controllers;

import by.belohvostik.innovationpak.models.Protocol;
import by.belohvostik.innovationpak.services.ProtocolService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Protocol")
public record ProtocolController(ProtocolService protocolService) {

    @GetMapping("/read/{id}")
    public Protocol readProtocol(@PathVariable Integer id) {
        return protocolService.getProtocolFindById(id);
    }

}
