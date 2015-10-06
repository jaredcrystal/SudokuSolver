import java.util.ArrayList;


public class Cell {

	private String possibilities;
	
	public Cell(){
		possibilities = "123456789";
	}
	
	public Cell(Cell c){
		possibilities = new String(c.getPossibilities());
	}
	
	public void eliminate(String value) throws Exception{
		possibilities = possibilities.replace(value, "");
		if(possibilities.length() < 1){
			throw new Exception();
		}
	}
	
	public void add(String value){
		if(value.length() == 1){
			possibilities = value;
		}
	}
	
	public String getPossibilities(){
		return possibilities;
	}
	
	public void removePossibility(){
		possibilities = possibilities.substring(1);
	}
}
