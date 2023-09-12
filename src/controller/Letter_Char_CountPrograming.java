/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author CongThanh
 */
import common.Algorithm;
import common.Library;
import model.Element;
import view.Menu;

/**
 *
 * @author ACER
 */
public class Letter_Char_CountPrograming extends Menu<String> {

    static String[] mc = {"Count Letter", "Count Character", "Exit"};

    protected Library library;
    protected Algorithm algorithm;
    protected int[] array;
    protected int size_array;

    public Letter_Char_CountPrograming() {
        super("PROGRAMMING", mc);
        library = new Library();
        algorithm = new Algorithm();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                algorithm.analyze(library.inputString("\nEnter your content: "));
                algorithm.displayLetter();
                System.out.println("");
                break;
            case 2:
                algorithm.analyze(library.inputString("\nEnter your content: "));
                algorithm.displayChar();
                System.out.println("");
                break;
            case 3:
                System.exit(0);
        }
    }

}
