package com.manju;

public class Player {
	public void makeMove(String elt,String toPos,Board b) {
		//System.out.println("fromPos:"+);
		System.out.println("toPos:"+toPos);
		
		String t2="";
		String t1="";
		
   		for (ChessMan chessMan : b.getChessMen()) {
               if(chessMan.getId().equals(toPos))
               {
               	t2 = chessMan.getPosition();
               	break;
               }
               if(chessMan.getId().equals(elt))
               {
               	t1 = chessMan.getType()+"";
               	break;
               }
       }
   	   System.out.println("t2:"+t2+"t1:"+t1);
   	   if(t1=="P")
   	   {
   		   Pawn p;
   		   //p.isAValidMove(elt, toPos);
   	   }
	}
}
