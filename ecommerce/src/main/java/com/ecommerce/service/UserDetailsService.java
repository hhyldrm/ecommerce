package com.ecommerce.service;

import com.ecommerce.dto.*;
import com.ecommerce.model.UserDetails;
import com.ecommerce.repository.UserDetailsRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDetailsService {

    private final UserDetailsRepository userDetailsRepository;
    private final UserDetailsConvertor userDetailsConvertor;

    public UserDetailsService(UserDetailsRepository userDetailsRepository, UserDetailsConvertor userDetailsConvertor) {
        this.userDetailsRepository = userDetailsRepository;
        this.userDetailsConvertor = userDetailsConvertor;
    }


    public UserDetailsDto createUserDetails(CreateUserDetailsRequest request) {
        UserDetails userDetails= new UserDetails(request.getPhoneNumber(),
                                                request.getAddress(),
                                                request.getAddress(),
                                                request.getCity(),
                                                request.getPostCode());
        return userDetailsConvertor.convert(userDetailsRepository.save(userDetails));
    }

    public UserDetailsDto updateUserDetails(Long id, UpdateUserDetailsRequest request) {
        Optional<UserDetails> userDetails = userDetailsRepository.findById(id);

        UserDetails updatedUserDetails = new UserDetails(
                userDetails.get().getId(), request.getPhoneNumber(),
                request.getAddress(),
                request.getCity(),
                request.getCountry(),
                request.getPostCode()
        );
        return userDetailsConvertor.convert(userDetailsRepository.save(updatedUserDetails));

    }

    public void deleteUserDetails(Long id) {
        userDetailsRepository.deleteById(id);
    }
}
