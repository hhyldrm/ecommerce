package com.ecommerce.service;

import com.ecommerce.dto.CreateUserRequest;
import com.ecommerce.dto.UpdateUserRequest;
import com.ecommerce.dto.UserDtoConvertor;
import com.ecommerce.dto.UsersDto;
import com.ecommerce.model.Users;
import com.ecommerce.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final UserDtoConvertor userDtoConvertor;

    public UserService(UserRepository userRepository, UserDtoConvertor userDtoConvertor) {
        this.userRepository = userRepository;
        this.userDtoConvertor = userDtoConvertor;
    }


    public List<UsersDto> getAllUser() {
        return userRepository.findAll().stream().
                map(users -> userDtoConvertor.convert(users)).
                collect(Collectors.toList());

    }

    public UsersDto getUserByMail(String mail) {
        Users user= userRepository.findByEmail(mail).get();
        return userDtoConvertor.convert(user);
    }

    public UsersDto createUser(CreateUserRequest request) {
        Users users = new Users(request.getEmail(),
                request.getFirstName(),
                request.getLastName(),
                request.getMiddleName(),false);
        return userDtoConvertor.convert(userRepository.save(users));
    }

    public UsersDto updateUser(String mail, UpdateUserRequest request) {
        Users users =userRepository.findByEmail(mail).get();
        Users updatedUser = new Users(users.getId(),
                                        users.getEmail(),
                                        request.getFirstName(),
                                        request.getFirstName(),
                                        request.getLastName(),
                                        users.getActive());
        return userDtoConvertor.convert(userRepository.save(updatedUser));
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);

    }

    public void deleteUserByMail(String email) {
        userRepository.deleteByEmail(email);
    }
}
