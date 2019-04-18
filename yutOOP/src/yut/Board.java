package yut;

public class Board {
	final int SIZE = 7;
	
	String[][] shipBoard = {
		
			{ " 0 ", " 0 ", " 0 ","   ", " 0 ", " 0 ", " 0 "},
			{ " 0 ", " 0 ", "   ","   ", "   ", " 0 ", " 0 "},
			{ " 0 ", "   ", " 0 ","   ", " 0 ", "   ", " 0 "},
			{ "   ", "   ", "   "," 0 ", "   ", "   ", "   "},
			{ " 0 ", "   ", " 0 ","   ", " 0 ", "   ", " 0 "},
			{ " 0 ", "   ", "   ","   ", "   ", "   ", " 0 "},
			{ " 0 ", " 0 ", " 0 ","   ", " 0 ", " 0 ", " 0 "},
		
	};
	
	void getBoard(){
		for(int i = 0; i<SIZE; i++) {
			for(int j =0; j<SIZE; j++) {
				System.out.printf("%s",shipBoard[i][j]);
			}
			System.out.println();
		}
	}
}

	/*
	class Mal extends Board {
		boolean life = true;
		boolean goal = false;
		
		int malX = 6;
		int malY = 6;
		
		void move(){
			if(malX==6 && malY<7 && malY>0)
			{
				malY++;
				if(malY==' ')
				{
					malY++;
				}
			}
			return malX
		*/	
		
	
