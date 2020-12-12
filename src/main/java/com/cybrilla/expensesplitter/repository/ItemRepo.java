package com.cybrilla.expensesplitter.repository;

import org.springframework.data.repository.CrudRepository;

import com.cybrilla.expensesplitter.model.Item;

public interface ItemRepo extends CrudRepository<Item, Integer> {}
