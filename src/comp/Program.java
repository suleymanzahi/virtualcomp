package comp;
import java.util.*;
import instructions.*;

public class Program {

	private List<Instruction> instructions;

	public Program(){
		this.instructions = new ArrayList<>();
	}

	public void add(Instruction inst) {
		instructions.add(inst);
	}

	public Instruction getInst(int index){
		return instructions.get(index);
	}

	public int size(){
		return instructions.size();
	}

/*	public String toString(){
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < instructions.size(); i++){
			str.append(i+": ");
			str.append(instructions.get(i).toString());
			str.append("\n");
		}
		return str.toString();
	}*/
}


