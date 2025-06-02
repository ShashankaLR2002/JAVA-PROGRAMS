package com.xworkz.ascertain.learn.service;

import com.xworkz.ascertain.learn.dto.Userdto;
import com.xworkz.ascertain.learn.entity.Userentity;
import com.xworkz.ascertain.learn.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;



@Service
public class UserServiceImplementation implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Userdto createUser(Userdto userDto) {
        Userentity userEntity = new Userentity();
        BeanUtils.copyProperties(userDto, userEntity);

        Userentity saved = userRepository.save(userEntity);

        Userdto resultDto = new Userdto();
        BeanUtils.copyProperties(saved, resultDto);
        resultDto.setId(saved.getId().longValue());

        return resultDto;
    }

    @Override
    public List<Userdto> getAllUsers() {
        return userRepository.findAll().stream().map(entity -> {
            Userdto dto = new Userdto();
            BeanUtils.copyProperties(entity, dto);
            dto.setId(entity.getId().longValue());
            return dto;
        }).collect(Collectors.toList());
    }

    @Override
    public Userdto getUserById(Integer id) {
        return userRepository.findById(id).map(entity -> {
            Userdto dto = new Userdto();
            BeanUtils.copyProperties(entity, dto);
            dto.setId(entity.getId().longValue());
            return dto;
        }).orElse(null);
    }


    @Override
    public void deleteUserById(Integer id) {
        userRepository.deleteById(id);
    }
}
