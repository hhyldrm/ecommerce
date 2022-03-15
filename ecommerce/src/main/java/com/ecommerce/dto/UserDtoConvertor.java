package com.ecommerce.dto;

import com.ecommerce.model.UserDetails;
import com.ecommerce.model.Users;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class UserDtoConvertor {

    private final UserDetailsConvertor userDetailsConvertor;

    public UserDtoConvertor(UserDetailsConvertor userDetailsConvertor) {
        this.userDetailsConvertor = userDetailsConvertor;
    }

    public UsersDto convert(Users from){
        return new UsersDto(from.getEmail(),
                            from.getFirstName(),
                            from.getLastName(),
                            from.getMiddleName(),
                            from.getActive(),
        userDetailsConvertor.convert(new ArrayList<>(from.getUserDetailsSet()))
        );
    }


}
