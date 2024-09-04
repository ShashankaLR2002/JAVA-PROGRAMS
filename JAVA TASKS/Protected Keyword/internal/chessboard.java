package com.xworkz.practise.internal;

public class chessboard extends Board {

    public chessboard() {
        super();
    }

    public chessboard(String name, int size) {
        super(name, size);
    }

    public static void main(String[] args) {
        chessboard chessBoard = new chessboard("Cls Chess",86);
        chessBoard.printDetails();
    }
}
