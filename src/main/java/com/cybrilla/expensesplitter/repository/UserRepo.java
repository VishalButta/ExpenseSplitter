package com.cybrilla.expensesplitter.repository;

import org.springframework.data.repository.CrudRepository;

import com.cybrilla.expensesplitter.model.User;

public interface UserRepo extends CrudRepository<User, Integer> {}
