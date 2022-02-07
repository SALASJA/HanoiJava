import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;

public class TowerOfHanoi{
	private int height;
	private HashMap<String, ArrayList<Integer>> state;
	
	public TowerOfHanoi(int n){
		this.height = height;
		this.state = new HashMap<>();
		this.state.put("A", new ArrayList<Integer>());
		this.state.put("B", new ArrayList<Integer>());
		this.state.put("C", new ArrayList<Integer>());
		
		ArrayList<Integer> column = this.state.get("A");
		for(int i = n; i >= 1; i--){
			column.add(i);
		}
		
	}
	
	public String get_state_string(){
		String result = "";
		for(String key: this.state.keySet()){
			result += String.format("%s | %s\n", key, this.state.get(key).toString());
		}
		return result;
	}
		
	
	public String toString(){
		String result = this.get_state_string();
		return result;
	}
	
	
	public void execute(String operation){
		
	}
		
	public void move(String source, String destination){
	
	}
	
	public boolean solved(){
		return false;
	}
			
}