package com.cybrilla.expensesplitter.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybrilla.expensesplitter.model.Item;
import com.cybrilla.expensesplitter.model.User;
import com.cybrilla.expensesplitter.model.UserGroup;
import com.cybrilla.expensesplitter.repository.GroupRepo;
import com.cybrilla.expensesplitter.repository.ItemRepo;
import com.cybrilla.expensesplitter.repository.UserRepo;

@Service
public class ExpenseService {

	@Autowired
	UserRepo userRepo;
	
	@Autowired
	GroupRepo groupRepo;
	
	@Autowired
	ItemRepo itemRepo;
	
	public List<User> getUsersForGroup(int groupid) {
		 Optional<List<User>> userList = groupRepo.findById(groupid).map(g ->g.getUserList());
		 if(userList.get() != null)
			 return userList.get();
        return null;
    }
	
	public Item getItem(String name) {
		Iterable<Item> findAll = itemRepo.findAll();
		for (Item item : findAll) {
			if(item.getName().equals(name))
				return item;
		}
		return null;
	}
	
    public void saveUser(User user) {
        userRepo.save(user);
    }
    
    public void saveItem(Item item) {
    	itemRepo.save(item);
    }
	
	
}
