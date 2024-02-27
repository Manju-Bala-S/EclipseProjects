package com.manju;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {
	
	private List<ChessMan> chessMen;
	private String[][] chessBoard = new String[8][8];
	//private Map<String,List<Integer>> m1 = new HashMap<String,List<Integer>>();
	private Map<String,Integer> m = new HashMap<>();
	
	public Board() {
		this.chessMen = new ArrayList<ChessMan>();
		for (int i = 0; i < 8; i++) {
		    for (int j = 0; j < 8; j++) {
		    	chessBoard[i][j] = " ";
		    }
		 }
		m.put("a",0);
		m.put("b",1);
		m.put("c",2);
		m.put("d",3);
		m.put("e",4);
		m.put("f",5);
		m.put("g",6);
		m.put("h",7);
	}
		
	
	public void addChessMan(ChessMan cm)
	{
	    //System.out.println("Inside addChessMen , cm:"+cm.getPosition());
		String pos = cm.getPosition();
		//System.out.println(pos.charAt(0));
		int j = m.get(""+pos.charAt(0));
		int i = Integer.parseInt(pos.charAt(1)+"");
		//System.out.println("i:"+i+"j:"+j);
		chessBoard[i][j] = cm.getId();
		chessMen.add(cm);
	}
	
	public List<ChessMan> getChessMen(){
		return chessMen;
	}
	
	public String[][] getChessBoard(){
		return chessBoard;
	}
	
	public void printBoard() {
		System.out.print("\t");
		String[] at = {"a","b","c","d","e","f","g","h"};
        for (int i = 0; i < 8; i++) {
            System.out.print(at[i] + "\t");
        }
        System.out.println();
        int size = at.length;
        for(int k=0;k<size*8;k++) {
        	System.out.print("_");
        }
        System.out.println("\n");
        for (int i = 0; i < 8; i++) {
            System.out.print(i+"\t");
            for (int j = 0; j < 8; j++) {
                System.out.print(chessBoard[i][j] + "\t");
            }
            System.out.println();
        }
	}
	
}
