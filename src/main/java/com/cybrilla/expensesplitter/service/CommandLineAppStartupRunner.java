package com.cybrilla.expensesplitter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.cybrilla.expensesplitter.model.Item;
import com.cybrilla.expensesplitter.model.User;

@Component
public class CommandLineAppStartupRunner implements CommandLineRunner {
    @Autowired
    private ExpenseService expenseService;

    @Override
    public void run(String...args) throws Exception {
    	createUsers(expenseService);
    	List<User> usersForGroup = expenseService.getUsersForGroup(1);
    	System.out.println("User in group 1 are"+usersForGroup);
    	int grooupSize = usersForGroup.size();
    	Item item = new Item("Room rent",10000,"ram","equal");
    	expenseService.saveItem(item);
    	calculateMoneyOwed(item, grooupSize, usersForGroup);
    	item = new Item("EB bill",1000,"kumar","equal");
    	expenseService.saveItem(item);
    	calculateMoneyOwed(item, grooupSize, usersForGroup);
    }
    
    /* logic is not complete did get much time due to power cut and had to set up eclipse maven java and everything in my PC*/
    private void calculateMoneyOwed(Item item, int grooupSize, List<User> usersForGroup) {
    	usersForGroup.remove(item.getName());
    	int individualSplit = item.getAmount()/grooupSize-1;
    	for (User user : usersForGroup) {
			System.out.println(user.getName()+"owes"+individualSplit+"to "+item.getName());
		}
		System.out.println(item.getPaid_by()+"gets back"+item.getAmount()+individualSplit+"from"+usersForGroup);
		
		
	}

	private static void createUsers(ExpenseService expenseService) {
    	expenseService.saveUser(new User(1,"ajay","1"));
    	expenseService.saveUser(new User(2,"ram","1"));
    	expenseService.saveUser(new User(3,"krish","1"));
    	expenseService.saveUser(new User(4,"kumar","1"));
    
    }
}