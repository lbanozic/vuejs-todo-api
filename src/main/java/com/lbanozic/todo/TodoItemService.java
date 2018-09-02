package com.lbanozic.todo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoItemService {

	public List<TodoItem> getTodoItems() {

		List<TodoItem> todoItems = new ArrayList<>();

		todoItems.add(new TodoItem(3, "Fix radio", "2.5.2018. 09:52:04", false));
		todoItems.add(new TodoItem(6, "Clean house", "13.5.2018. 17:43:52", false));
		todoItems.add(new TodoItem(4, "Replace printer cartridge", "2.5.2018. 11:23:41", false));
		todoItems.add(new TodoItem(1, "Sort old files", "25.4.2018. 14:42:50", true));
		todoItems.add(new TodoItem(2, "Upload photos", "28.4.2018. 18:14:34", false));
		todoItems.add(new TodoItem(7, "Make dinner", "13.5.2018. 17:46:29", false));
		todoItems.add(new TodoItem(5, "Order new phone case", "4.5.2018. 15:07:08", true));

		return todoItems;
	}

	public void updateTodoItems(List<TodoItem> todoItemList) {
		System.out.println("Updating TODO items list: " + todoItemList);
	}

}
