package edu.icet.service.impl;

import edu.icet.dto.User;
import edu.icet.entity.UserEntity;
import edu.icet.repository.UserRepository;
import edu.icet.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {

    final UserRepository repository;
    final ModelMapper mapper;

    @Override
    public void addUser(User user) {
        repository.save(mapper.map(user, UserEntity.class));
    }

    @Override
    public User getUserById(Integer id) {
        Optional<UserEntity> userEntity = repository.findById(id);
        return mapper.map(userEntity,User.class);
    }

    @Override
    public User getUserByName(String name) {
        UserEntity userEntity = repository.findByName(name);
        return mapper.map(userEntity, User.class);
    }

    @Override
    public List<User> getaAll() {
        List<User> userList = new ArrayList<>();
        List<UserEntity> userEntityList = repository.findAll();
        userEntityList.forEach(userEntity -> {
            userList.add(mapper.map(userEntity, User.class));
        });
        return userList;
    }

    @Override
    public void updateUser(User user) {
        repository.save(mapper.map(user,UserEntity.class));
    }

    @Override
    public void deleteUser(Integer id) {
        repository.deleteById(id);
    }
}
