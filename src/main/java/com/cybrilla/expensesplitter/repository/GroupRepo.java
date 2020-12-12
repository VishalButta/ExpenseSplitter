package com.cybrilla.expensesplitter.repository;

import org.springframework.data.repository.CrudRepository;

import com.cybrilla.expensesplitter.model.UserGroup;

public interface GroupRepo extends CrudRepository<UserGroup, Integer> {}
