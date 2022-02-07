import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		int height = (args.length == 1) ? Integer.parseInt(args[0]) : 3;
		Scanner input = new Scanner(System.in);
		TowerOfHanoi puzzle = new TowerOfHanoi(height);
		System.out.println(puzzle);
		while(!puzzle.solved()){
			System.out.print("Enter your next operation: ");
			String operation = input.next();
			puzzle.execute(operation);
			System.out.println(puzzle);
		}
		System.out.println("COMPLETE!");
	}
}