package com.mma.specification.example.controller.mapper;

import com.mma.specification.example.controller.dto.UserDto;
import com.mma.specification.example.domain.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto map(User user);

    List<UserDto> map(List<User> users);
}
