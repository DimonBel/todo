package com.example.backend.service;

import com.example.backend.domain.user.User;

public interface UserService {

    User getbyId(long id);

    User getbyUsername(String username);



}
