package com.example.studentsmanagement.exceptions;

public class StudentEmptyNameException extends RuntimeException{
    public StudentEmptyNameException(String message) {
        super(message);
    }
}
