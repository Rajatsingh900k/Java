# Java Course — Tutor: Anuj Bhaiya (YouTube)

Brief notes, exercises and setup instructions to accompany the Java course by Anuj Bhaiya (YouTube).

## Table of contents
- About
- Goals
- Prerequisites
- Setup (Windows)
- Project layout
- Syllabus / Topics
- How to run examples
- Exercises & study tips
- Contributing
- License

## About
Course companion repository with concise notes, example code and small exercises to follow along Anuj Bhaiya's Java lessons. This is not a transcript of the videos—use it as practical support material.

## Goals
- Learn core Java essentials
- Build hands-on examples for each topic
- Prepare for interviews and projects

## Prerequisites
- Basic programming logic (variables, loops)
- A modern computer with admin rights
- Internet access for watching videos and downloading tools

## Setup (Windows)
1. Install JDK 17+ from the official OpenJDK or vendor site.
2. Set JAVA_HOME to your JDK path (e.g., D:\Java\jdk-17).
3. Add `%JAVA_HOME%\bin` to PATH.
4. Install a code editor/IDE (VS Code, IntelliJ IDEA, or Eclipse).
5. Verify:
    - `java -version`
    - `javac -version`

## Project layout
Suggested simple structure:
- src/           — Java source files
- examples/      — small runnable examples per topic
- exercises/     — practice problems
- README.md      — this file

## Syllabus (typical sequence)
1. Java basics: types, operators, control flow  
2. OOP: classes, objects, inheritance, polymorphism, encapsulation  
3. Methods, constructors, static members  
4. Collections (List, Set, Map) and Generics  
5. Exceptions and debugging  
6. File I/O and serialization  
7. Multithreading and concurrency basics  
8. Java 8+ features: Lambdas, Streams, Optional  
9. JDBC basics & simple persistence (optional)  
10. Build tools: Maven or Gradle (optional)

## How to run examples
From repository root:
- Compile: `javac -d out src/com/example/*.java`
- Run: `java -cp out com.example.Main`

Or open the project in your IDE and run classes directly.

## Exercises & study tips
- Reimplement examples without watching first, then compare.
- Solve small problems daily; time-box to 30–60 minutes.
- Commit incremental work with clear messages.

## Contributing
- Create issues for errors or missing topics.
- Submit PRs for fixes or added examples.

## License
Use and adapt for learning. Add a license file if you plan to publish widely.

Instructor reference: Anuj Bhaiya — search his Java playlist on YouTube for lecture videos.