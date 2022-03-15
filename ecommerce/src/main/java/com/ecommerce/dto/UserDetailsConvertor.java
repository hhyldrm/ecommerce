package com.ecommerce.dto;

import com.ecommerce.model.UserDetails;
import org.springframework.stereotype.Component;

@Component
public class UserDetailsConvertor {

    public UserDetailsDto convert(UserDetails from){
       return new UserDetailsDto(from.getCountry(),
        from.getAddress(),
        from.getPhoneNumber(),
        from.getCity(),
        from.getPostCode());
    }
}
