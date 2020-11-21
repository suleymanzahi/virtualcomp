package comp;

public class Computer  { 
	
	private Program prog;
	private Memory memory;
	private ProgramCounter pc;

	public Computer(Memory memory) {
		this.memory = memory;
		this.pc = new ProgramCounter();
	}

	public void load(Program program) {
		this.prog = program;
	}

    public void run() {
		while (pc.isHalt(prog.size())){
			prog.getInst(pc.getCounter()).execute(pc,memory);
		}
    }
}
