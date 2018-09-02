package com.lbanozic.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
@CrossOrigin
public class TodoItemController {

	@Autowired
	private TodoItemService todoItemService;

	@GetMapping("/list")
	public List<TodoItem> getTodoList() {
		return todoItemService.getTodoItems();
	}

	@PostMapping("/update")
	public void updateTodoList(@RequestBody List<TodoItem> todoItemList) {
		todoItemService.updateTodoItems(todoItemList);
	}

}
