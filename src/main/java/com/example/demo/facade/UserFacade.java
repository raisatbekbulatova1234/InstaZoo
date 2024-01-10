package com.example.demo.facade;

import com.example.demo.dto.UserDTO;
import com.example.demo.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserFacade {
    public UserDTO userToUserDTO(User user) { //т.к. на клиентской стороне нам нужно всего несколько полей из данных пользователя(а их мб оч много), создаем новый обьект userDTO с необходимыми полями
        UserDTO userDTO = new UserDTO();

        userDTO.setId(user.getId());

        userDTO.setFirstname(user.getName());

        userDTO.setLastname(user.getLastname());

        userDTO.setUsername(user.getUsername());

        userDTO.setBio(user.getBio());

        return userDTO;

    }

}
