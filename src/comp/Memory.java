package comp;
import word.*;

public class Memory {

	private WordFactory wf;
	private Word[] mem;

	public Memory(int size, WordFactory wf) {
		this.wf = wf;
		this.mem = new Word[size];
		for(int i = 0; i < mem.length; i++) {
			mem[i] = wf.word("0");
		}
	}

	public Word get(int index) {
		return mem[index];
	}

	public WordFactory getWf() {		//för att jämföra minnets factory med ordets factory
		return wf;
	}

	public void add(int index, Word word) {
		mem[index] = word;
	}

}
