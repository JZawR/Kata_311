package katagroup.kata_311_work.services;

import katagroup.kata_311_work.models.User;
import katagroup.kata_311_work.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public void addUser(User newUser){
        userRepository.saveAndFlush(newUser);
    }
    public void updateUser(User updatedUser) {
        userRepository.saveAndFlush(updatedUser);
    }
    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }
    public User getUser(Long id) {
        return userRepository.getById(id);
    }
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
