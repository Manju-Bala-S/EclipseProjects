package com.manju;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Board b = new Board();
		
		String fromPos="";
		String toPos="";
		
	   b.addChessMan(new Rook('B',"BR1","a0",'R'));		
	   b.addChessMan(new Rook('B',"BR2","h0",'R'));		
	   b.addChessMan(new Rook('W',"WR1","a7",'R'));		
	   b.addChessMan(new Rook('W',"WR1","h7",'R'));	
	   
	   b.addChessMan(new King('B',"BK","e0",'K'));	
	   b.addChessMan(new King('W',"WK","e7",'K'));	
	   
	   b.addChessMan(new Queen('B',"BQ","d0",'Q'));	
	   b.addChessMan(new Queen('W',"WQ","d7",'Q'));	
	   
	   b.addChessMan(new Knight('B',"BN1","b0",'N'));		
	   b.addChessMan(new Knight('B',"BN2","g0",'N'));		
	   b.addChessMan(new Knight('W',"WN1","b7",'N'));		
	   b.addChessMan(new Knight('W',"WN1","g7",'N'));
	   
	   b.addChessMan(new Knight('B',"BB1","c0",'B'));		
	   b.addChessMan(new Knight('B',"BB2","f0",'B'));		
	   b.addChessMan(new Knight('W',"WB1","c7",'B'));		
	   b.addChessMan(new Knight('W',"WB2","f7",'B'));
	   
	   b.addChessMan(new Pawn('W',"WP1","a6",'P'));		
	   b.addChessMan(new Pawn('W',"WP2","b6",'P'));		
	   b.addChessMan(new Pawn('W',"WP3","c6",'P'));		
	   b.addChessMan(new Pawn('W',"WP4","d6",'P'));		
	   b.addChessMan(new Pawn('W',"WP5","e6",'P'));		
	   b.addChessMan(new Pawn('W',"WP6","f6",'P'));		
	   b.addChessMan(new Pawn('W',"WP7","g6",'P'));		
	   b.addChessMan(new Pawn('W',"WP8","h6",'P'));		
	   
	   b.addChessMan(new Pawn('B',"BP1","a1",'P'));		
	   b.addChessMan(new Pawn('B',"BP2","b1",'P'));		
	   b.addChessMan(new Pawn('B',"BP3","c1",'P'));		
	   b.addChessMan(new Pawn('B',"BP4","d1",'P'));		
	   b.addChessMan(new Pawn('B',"BP5","e1",'P'));		
	   b.addChessMan(new Pawn('B',"BP6","f1",'P'));		
	   b.addChessMan(new Pawn('B',"BP7","g1",'P'));		
	   b.addChessMan(new Pawn('B',"BP8","h1",'P'));	
	   
	   Player p1 = new Player();
	   Player p2 = new Player();
	   
	   Scanner sc = new Scanner(System.in);
       int ch=1;
       
       while(!toPos.equals("q") && !fromPos.equals("q")){
    	   b.printBoard();
    	   if(ch%2!=0) {
    		   System.out.println("White's turn");
        	   System.out.println("Enter element:");
        	   fromPos = sc.nextLine();
    		   System.out.println("Enter position where you want to move:");
        	   toPos = sc.nextLine();
        	   p1.makeMove(fromPos,toPos,b);
    	   }
    	   else{
    		   System.out.println("Black's turn");
    		   System.out.println("Enter element:");
        	   fromPos = sc.nextLine();
    		   System.out.println("Enter position where you want to move:");
        	   toPos = sc.nextLine();
        	   p2.makeMove(fromPos,toPos,b);
    	   }
    	   ch++;
       }
	   
	}
}
