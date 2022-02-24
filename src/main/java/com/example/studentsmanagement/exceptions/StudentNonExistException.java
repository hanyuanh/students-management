package com.example.studentsmanagement.exceptions;

public class StudentNonExistException extends RuntimeException{
    public StudentNonExistException(String message) {
        super(message);
    }
}
