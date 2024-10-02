package com.proyectoUTN.services;

import com.proyectoUTN.models.UserModel;
import com.proyectoUTN.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private IUserRepository userRepository;

    // Obtener todos los usuarios
    public List<UserModel> getAllUsers() {
        return userRepository.findAll();
    }

    // Obtener un usuario por ID
    public Optional<UserModel> getUserById(Long id) {
        return userRepository.findById(id);
    }

    // Crear un nuevo usuario
    public UserModel createUser(UserModel userModel) {
        return userRepository.save(userModel);
    }

    // Actualizar un usuario existente
    public Optional<UserModel> updateUser(Long id, UserModel userDetails) {
        return userRepository.findById(id).map(user -> {
            user.setVersion(userDetails.getVersion());
            user.setDesarrollador(userDetails.getDesarrollador());
            user.setFecha(userDetails.getFecha());
            return userRepository.save(user);
        });
    }

    // Eliminar un usuario
    public boolean deleteUser(Long id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return true;
        }
        return false;
    }
}

