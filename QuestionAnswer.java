package com.example.quizapp;

public class QuestionAnswer {

    public static String question[] = {
            "Which of the following is not a Java feature?",
            "What is the return type of the hashCode() method in the Object class?",
            "Which of the following for loop declaration is not valid?",
            "Which package contains the Random class?",
            "Which of the following is an immediate subclass of the Panel class?",
            "Which of the following is a reserved keyword in Java?"
    };

    public static String choices[][] = {
            {"Dynamic", "Architecture Neutral", "Use of pointers", "Object-oriented"},
            {"Object", "int", "long", "void"},
            {"for (int i = 99; i >= 0; i / 9)", "for (int i = 7; i <= 77; i += 7)", "for (int i = 20; i >= 2; --i)", "for (int i = 2; i <= 20; i = 2* i)"},
            {"java.util package", "java.lang package", "java.awt package", "java.io package"},
            {"Applet class", "Window class", "Frame class", "Dialog class"},
            {"object", "strictfp", "main", "system"}
    };

    public static String correctAnswers[] = {
            "Use of pointers",
            "int",
            "for (int i = 99; i >= 0; i / 9)",
            "java.util package",
            "Applet class",
            "strictfp"
    };
}
