package com.example.test;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.processUser();
    }
}
