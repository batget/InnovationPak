package by.belohvostik.innovationpak.services;

import by.belohvostik.innovationpak.models.User;
import by.belohvostik.innovationpak.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    @Override
    public User getUser(Long id) {
        return userRepository.findById(id).get();
    }
}
