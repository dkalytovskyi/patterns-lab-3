package com.lab3.composite;

/*
 * №4
 * Визначити специфікації класів для подання файлової системи 
 * у вигляді дерева об'єктів (файл - листовий об'єкт, каталог - вузловий). 
 * Кожний об'єкт має атрибут розміру (для файлу задається в конструкторі, для каталогів обчислюється). 
 * Реалізувати бізнес-метод отримання розміру для класу каталогу
 */

public class Main {

	public static void main(String[] args) {
		FileSystem fs = new Directory("directory level 0",
									  new Directory("directory level 1.1",
											  		new File("file11", 64), 
											  		new Directory("directory level 2")), 
									  new Directory("directory level 1.2", 
										  		new Directory("directory level 2",
										  					  new Directory("directory level 3",
										  							  		new File("file31", 14), 
										  							  		new File("file32", 1),
										  							  		new File("file33", 21)))),
									  new File("file01", 12), 
									  new File("file02", 9));
		
		System.out.println("Size of " + fs.getName() + " is " + fs.getSize());
	}

}
