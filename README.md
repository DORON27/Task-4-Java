# Task-4-Java

# NotesApp – Java File I/O Project

## Overview
This project was developed as part of the **Java Developer Internship (Task 4)** under Elevate Labs and the Ministry of MSME, Govt. of India.  
The objective was to create a simple **text-based Notes Manager** using Java File I/O concepts.

## Features
- Add notes via console input.
- Save notes persistently in a text file (`notes.txt`).
- View all saved notes by reading from the file.
- Exit option to close the program gracefully.

## Tools & Technologies
- **Language:** Java  
- **IDE:** IntelliJ IDEA / VS Code  
- **Core Concepts:** FileWriter, FileReader, BufferedReader, Scanner, Switch-case, Loops  

## How It Works
1. The program displays a menu:
   - `1. Add Note`
   - `2. View Notes`
   - `3. Exit`
2. Notes are written to `notes.txt` using `FileWriter` in append mode.
3. Notes are read back using `BufferedReader` line by line.
4. The loop continues until the user chooses to exit.


