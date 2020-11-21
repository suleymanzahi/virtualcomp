package instructions;

import comp.Memory;
import comp.ProgramCounter;

public class Jump implements Instruction {


   private  int plats;

    public Jump(int plats){
        this.plats=plats;

    }
    @Override
    public void execute(ProgramCounter pc, Memory m) {
        pc.setCounter(plats);

    }
}
