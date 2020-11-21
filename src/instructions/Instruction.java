package instructions;

import comp.Memory;
import comp.ProgramCounter;

public interface Instruction {

    /*
     * @interface
     */
    void  execute(ProgramCounter pc, Memory m);
}
