package com.example;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class TaskGenerator {
    
   private static final String[][][] task = {
		   {
			   {
				   "Create a student class with its information like name, age, class, etc., and store it. Then print it.",
	                "Implement a simple calculator program that performs basic arithmetic operations.",
	                "Write a program to find the factorial of a number using recursion.",
	                "Develop a simple console-based tic-tac-toe game.",
	                "Create a program that generates a random password of a specified length."
			   },
			   {
				   "Create a simple RESTful API using Java with endpoints to perform CRUD operations on a resource.",
	                "Implement a banking system with classes for accounts, transactions, and a simple interface.",
	                "Develop a command-line application to manage a list of tasks (to-do list).",
	                "Build a program that reads data from a CSV file, performs some analysis, and generates a report.",
	                "Implement a basic text-based adventure game with multiple rooms, items, and interactions."
			   },
			   {
				   "Implement a full-stack web application using Java with Spring Boot for the backend and React for the frontend.",
	                "Develop a real-time chat application using WebSocket technology.",
	                "Build a RESTful API with OAuth2 authentication and JWT token authorization.",
	                "Create a data visualization dashboard using JavaFX for the frontend and Java Servlets for the backend.",
	                "Implement a microservices architecture for a complex application using Spring Cloud."
			   }
		   },{
			   {
				   "Write a script to calculate the factorial of a number using recursion.",
	                "Develop a program that counts the occurrence of each word in a text file.",
	                "Create a simple calculator program that supports basic arithmetic operations.",
	                "Implement a program to convert temperature between Celsius and Fahrenheit.",
	                "Write a script to generate a Fibonacci sequence up to a specified number of terms."
			   },
			   {
				   "Develop a simple web scraper using Beautiful Soup and requests library in Python.",
	                "Build a command-line utility for managing contacts (add, delete, search).",
	                "Create a program that analyzes stock market data and generates buy/sell recommendations.",
	                "Implement a basic CRUD application using Flask for the backend and SQLite for the database.",
	                "Write a script to extract data from a PDF file and store it in a structured format."
			   },
			   {
				   "Build a machine learning model using scikit-learn library to predict housing prices based on historical data.",
	                "Develop a sentiment analysis system using natural language processing techniques.",
	                "Create a web application for image classification using TensorFlow.js for the frontend and Flask for the backend.",
	                "Implement a recommendation system based on collaborative filtering techniques.",
	                "Build a real-time dashboard for monitoring social media trends using Django Channels and WebSockets."
			   }
		   },{
			   {
				   "Create a simple console-based calculator program that performs basic arithmetic operations.",
	                "Implement a program to find the factorial of a number using iteration.",
	                "Develop a basic text-based game (e.g., guess the number, rock-paper-scissors).",
	                "Write a program to calculate the area and perimeter of geometric shapes (circle, rectangle, triangle).",
	                "Implement a simple file management system (create, read, write, delete files)."
			   },
			   {
				   "Implement a binary search tree data structure in C++ and perform operations like insertion, deletion, and searching.",
	                "Develop a program to simulate a bank account system with transactions and account management.",
	                "Build a command-line utility for compressing and decompressing files using Huffman coding.",
	                "Create a basic database management system with support for CRUD operations and indexing.",
	                "Implement a multi-threaded application to perform parallel matrix multiplication."
			   },
			   {
				   "Develop a real-time multiplayer game using C++ and a networking library like Boost.Asio.",
	                "Build a compiler for a simple programming language using Lex and Yacc.",
	                "Create a distributed computing system for processing large datasets using MPI.",
	                "Implement a ray tracing renderer to generate realistic images of 3D scenes.",
	                "Develop a virtual machine and an assembly language interpreter for it."
	            }
			   
			},{
				   
				{
					"Create a simple to-do list web application using vanilla JavaScript.",
	                "Build a basic calculator application with HTML, CSS, and JavaScript.",
	                "Develop a program to display current weather information using a weather API.",
	                "Write a script to validate user input in a form (e.g., email validation, password strength).",
	                "Implement a basic animation using HTML canvas and JavaScript."
				},
				{
					"Build a RESTful API server using Node.js and Express framework.",
	                "Develop a chat application with real-time messaging using Socket.io.",
	                "Create a CRUD application for managing contacts using MongoDB and Mongoose.",
	                "Implement a web-based file uploader with progress tracking using XMLHttpRequest or Fetch API.",
	                "Write a program to fetch and display data from a third-party API (e.g., GitHub API, OpenWeatherMap API)."
	            },
				{
	            	"Develop a single-page application (SPA) using React.js with Redux for state management and Axios for API calls.",
	                "Build a real-time collaborative editing tool (like Google Docs) using WebSockets and React.",
	                "Create a full-stack e-commerce application with React for the frontend and Node.js with Express for the backend.",
	                "Implement a server-side rendering (SSR) setup for a React application using Next.js.",
	                "Develop a data visualization dashboard using D3.js for charting and React for the frontend."
				}
		   }
   };
    
   public static String getTask(String lang, String level) {
	   Random random = new Random();
	   int langIndex = getLanguageIndex(lang);
	   int levelIndex = getLevelIndex(level);
	   int taskIndex = random.nextInt(task[langIndex][levelIndex].length);
	   return task[langIndex][levelIndex][taskIndex];
   }
    
    public static String getLevel(int exp){
        if(exp <= 3) {
            return "Beginner";
        } else if(exp > 3 && exp <= 5) {
            return "Intermediate";
        } else {
            return "Expert";
        }
    }
    
    public static int getLanguageIndex(String lang) {
    	switch(lang.toLowerCase()) {
    	case "java":
    		return 0;
    	case "python":
    		return 1;
    	case "c++":
    		return 2;
    	case "javascript":
    		return 3;
    	default:
            throw new IllegalArgumentException("Invalid language: " + lang);
    	}
    }
    
    public static int getLevelIndex(String level) {
    	switch(level.toLowerCase()) {
    	case "beginner":
    		return 0;
    	case "intermediate":
    		return 1;
    	case "expert":
    		return 2;
    	default:
            throw new IllegalArgumentException("Invalid Experience");
    	}
    }
    
    public static String getDeadline() {
    	Random random = new Random();
    	LocalDate now = LocalDate.now();
        LocalDate deadlineDate = now.plusDays(random.nextInt(14) + 3); // Deadline within 1-14 days
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String deadline = deadlineDate.format(formatter);
        return deadline;
    }
    
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your programming Language : ");
        String language = sc.nextLine();
        System.out.println("Enter your years of experience : ");
        String level = getLevel(sc.nextInt());
        String task = getTask(language,level);
        System.out.println(level+" task :");
        System.out.println(task);
        System.out.print("Your Deadline is : " + getDeadline());
        sc.close(); 
    }

}
