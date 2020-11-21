package instructions;

import comp.Memory;
import comp.ProgramCounter;

public class Halt implements Instruction {

    @Override
    public void execute(ProgramCounter pc, Memory m) {  //TODO fixa execute
        pc.increment();
    }

}
