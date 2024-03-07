package com.example;
import java.util.Scanner;

public class TaskGenerator {
    
    String skill;
    int exp;
    
    public TaskGenerator(String skill, int exp) {
        this.skill = skill;
        this.exp = exp;
    }
    
    public void assignTask() {
        String level = difficultyDecider();
       
        switch(skill) {
            case "Java": 
                if(level.equals("Beginner")) {
                    System.out.println("Task: For Java at beginner level, Create a student class with its information like name, age, class, etc., and store it. Then print it.");
                } else if(level.equals("Intermediate")) {
                    System.out.println("Task: For Java at Intermediate level, Create a simple RESTful API using Java with endpoints to perform CRUD operations on a resource.");
                } else {
                    System.out.println("Task: For Java at Advanced level, Implement a full-stack web application using Java with Spring Boot for the backend and React for the frontend.");
                }
                break;
            case "C++":
                if(level.equals("Beginner")) {
                    System.out.println("Task: For C++ at beginner level, Create a simple console-based calculator program that performs basic arithmetic operations.");
                } else if(level.equals("Intermediate")) {
                    System.out.println("Task: For C++ at Intermediate level, Implement a binary search tree data structure in C++ and perform operations like insertion, deletion, and searching.");
                } else {
                    System.out.println("Task: For C++ at Advanced level, Develop a real-time multiplayer game using C++ and a networking library like Boost.Asio.");
                }
                break;
            case "Python":
                if(level.equals("Beginner")) {
                    System.out.println("Task: For Python at beginner level, Write a script to calculate the factorial of a number using recursion.");
                } else if(level.equals("Intermediate")) {
                    System.out.println("Task: For Python at Intermediate level, Develop a simple web scraper using Beautiful Soup and requests library in Python.");
                } else {
                    System.out.println("Task: For Python at Advanced level, Build a machine learning model using scikit-learn library to predict housing prices based on historical data.");
                }
                break;
            case "JavaScript":
                if(level.equals("Beginner")) {
                    System.out.println("Task: For JavaScript at beginner level, Create a simple to-do list web application using vanilla JavaScript.");
                } else if(level.equals("Intermediate")) {
                    System.out.println("Task: For JavaScript at Intermediate level, Build a RESTful API server using Node.js and Express framework.");
                } else {
                    System.out.println("Task: For JavaScript at Advanced level, Develop a single-page application (SPA) using React.js with Redux for state management and Axios for API calls.");
                }
                break;
            default:
                System.out.println("Hurray! No task for you!");
        }
    }
    
    public String difficultyDecider(){
        if(exp <= 3) {
            return "Beginner";
        } else if(exp > 3 && exp <= 5) {
            return "Intermediate";
        } else {
            return "Advanced";
        }
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your most proficient skill:");
        String skill = sc.nextLine();
        System.out.println("Enter your years of experience:");
        int level = sc.nextInt();
        TaskGenerator tg = new TaskGenerator(skill, level);
        tg.assignTask();
        sc.close(); 
    }

}
