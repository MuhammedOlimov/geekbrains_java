package com.company;

public class Main {

    public static void main(String[] args) {
	    Human human = new Human("Alex", 500, 20);
	    Cat cat = new Cat("Barsik", 1200, 90);
	    Robocop robocop = new Robocop("Iron man", 1000, 80);
	    human.Jump();
        cat.Jump();
        robocop.Jump();
    }
}
