import java.util.ArrayList;
import java.util.Stack;


public class Puzzle {
	ArrayList<Cell> cells = new ArrayList<>();
	ArrayList<Cell> tempPuzzle = new ArrayList<>();
	Stack<ArrayList<Cell>> puzzles = new Stack<>();
	Stack<Integer> successIndex = new Stack<>();
	Stack<Integer> trialPositions = new Stack<>();
	
	int trialPos = 0;
	
	public Puzzle(){
		for(int i=0; i<81; i++){
			cells.add(new Cell());
		}
	}
	
	public void savePuzzle(int cellIndex, int trialValuePos){
		tempPuzzle = new ArrayList<>();
		for(Cell c : cells){
			tempPuzzle.add(new Cell(c));
		}
		
		puzzles.push(tempPuzzle);
		successIndex.push(cellIndex);
		trialPositions.push(trialValuePos);
	}
	
	public int goBack(){
		puzzles.pop();
		tempPuzzle = puzzles.peek();
		cells = new ArrayList<>();
		for(Cell c : tempPuzzle){
			cells.add(new Cell(c));
		}
		
		trialPos = trialPositions.peek();
		trialPositions.pop();
		
		int result = successIndex.peek()-1;
		successIndex.pop();
		
		return result;
	}
	
	public void resetPuzzle(){
		tempPuzzle = puzzles.peek();
		cells = new ArrayList<>();
		for(Cell c : tempPuzzle){
			cells.add(new Cell(c));
		}
	}
	
	public ArrayList<String> solve(){
		
		//save base/original puzzle
		savePuzzle(0,0);
		Boolean succeeded = false;
		
		outerloop:
		for(int i=0; i < 81; i++){	//for each cell in the puzzle
			
			if(cells.get(i).getPossibilities().length() > 1){
				succeeded = false;
				
				while(trialPos < cells.get(i).getPossibilities().length()){
					String trialValue = String.valueOf(cells.get(i).getPossibilities().charAt(trialPos));
					
					try{
						add(trialValue, i);
						if(solved()){
							break outerloop;
						}else{	//Value was successfully added (didn't break try)
							succeeded = true;
							//System.out.println("Succeeded with " + trialValue + " at cell " + i + " trialPos = " + trialPos);
							savePuzzle(i,trialPos+1);
							trialPos = 0;
							break;
						}
					}catch(Exception e){	
						//Value was NOT successfully added. Reset puzzle and try next value.
						//System.out.println("Failed with " + trialValue + " at cell " + i + " trialPos = " + trialPos);
						resetPuzzle();
					}
					
					trialPos++;
				}
				
			}else if(cells.get(i).getPossibilities().length() == 1){
				succeeded = true;
				//System.out.println("One possible value at cell " + i);
				trialPos = 0;
			}
			
			if(succeeded == false){
				//no value worked. Backtrack.
				//System.out.println("*****FAILED, GO BACK*****");
				i = goBack();
			}
		}
		
		ArrayList<String> result = new ArrayList<>();
		for(Cell c : cells){
			result.add(c.getPossibilities());
		}
		
		return result;
	}
	
	public ArrayList<String> print(){
		ArrayList<String> result = new ArrayList<>();
		for(Cell c: cells){
			result.add(c.getPossibilities());
		}
		return result;
	}
	
	public boolean solved(){
		for(Cell c: cells){
			if(c.getPossibilities().length() > 1){
				return false;
			}
		}
		return true;
	}
	
	public void add(String value, int pos) throws Exception{
		Cell tempCell = cells.get(pos);
		tempCell.add(value);
		cells.set(pos, tempCell);
		//and eliminate that value from possibilities of relevant cells
		for(int i=0; i<81; i++){
			if(areRelevant(i,pos)){
				tempCell = cells.get(i);
				int beforeLength = tempCell.getPossibilities().length();
				tempCell.eliminate(value);
				if(beforeLength > 1 && tempCell.getPossibilities().length() == 1){
					add(tempCell.getPossibilities(), i);
				}
				cells.set(i, tempCell);
			}
		}
	}
	
	public boolean areRelevant(int i, int pos){
		if(i == pos){
			return false;
		}
		if( (i/9) == (pos/9) ){
			return true;
		}
		if( (i%9) == (pos%9) ){
			return true;
		}
		if((pos % 3) == 0 && ((pos/9) == 0 || (pos/9) == 3 || (pos/9) == 6)){
			//top left of box
			if(i == (pos+10)){
				return true;
			}
			if(i == (pos+11)){
				return true;
			}
			if(i == (pos+19)){
				return true;
			}
			if(i == (pos+20)){
				return true;
			}
		}
		
		if((pos % 3) == 1 && ((pos/9) == 0 || (pos/9) == 3 || (pos/9) == 6)){
			//top middle of box
			if(i == (pos+8)){
				return true;
			}
			if(i == (pos+10)){
				return true;
			}
			if(i == (pos+17)){
				return true;
			}
			if(i == (pos+19)){
				return true;
			}
		}
		
		if((pos % 3) == 2 && ((pos/9) == 0 || (pos/9) == 3 || (pos/9) == 6)){
			//top right of box
			if(i == (pos+7)){
				return true;
			}
			if(i == (pos+8)){
				return true;
			}
			if(i == (pos+16)){
				return true;
			}
			if(i == (pos+17)){
				return true;
			}
		}
		
		if((pos % 3) == 0 && ((pos/9) == 1 || (pos/9) == 4 || (pos/9) == 7)){
			//left middle of box
			if(i == (pos-8)){
				return true;
			}
			if(i == (pos-7)){
				return true;
			}
			if(i == (pos+10)){
				return true;
			}
			if(i == (pos+11)){
				return true;
			}
		}
		
		if((pos % 3) == 0 && ((pos/9) == 2 || (pos/9) == 5 || (pos/9) == 8)){
			//left bottom of box
			if(i == (pos-17)){
				return true;
			}
			if(i == (pos-16)){
				return true;
			}
			if(i == (pos-8)){
				return true;
			}
			if(i == (pos-7)){
				return true;
			}
		}
		
		if((pos % 3) == 1 && ((pos/9) == 1 || (pos/9) == 4 || (pos/9) == 7)){
			//middle middle of box
			if(i == (pos-10)){
				return true;
			}
			if(i == (pos-8)){
				return true;
			}
			if(i == (pos+8)){
				return true;
			}
			if(i == (pos+10)){
				return true;
			}
		}
		
		if((pos % 3) == 1 && ((pos/9) == 2 || (pos/9) == 5 || (pos/9) == 8)){
			//bottom middle of box
			if(i == (pos-19)){
				return true;
			}
			if(i == (pos-17)){
				return true;
			}
			if(i == (pos-10)){
				return true;
			}
			if(i == (pos-8)){
				return true;
			}
		}
		
		if((pos % 3) == 2 && ((pos/9) == 1 || (pos/9) == 4 || (pos/9) == 7)){
			//right middle of box
			if(i == (pos-11)){
				return true;
			}
			if(i == (pos-10)){
				return true;
			}
			if(i == (pos+7)){
				return true;
			}
			if(i == (pos+8)){
				return true;
			}
		}
		
		if((pos % 3) == 2 && ((pos/9) == 2 || (pos/9) == 5 || (pos/9) == 8)){
			//right bottom of box
			if(i == (pos-20)){
				return true;
			}
			if(i == (pos-19)){
				return true;
			}
			if(i == (pos-11)){
				return true;
			}
			if(i == (pos-10)){
				return true;
			}
		}
		return false;
	}
}
