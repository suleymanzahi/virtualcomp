package instructions;

import comp.Memory;
import comp.ProgramCounter;
import word.Operand;
import word.Word;

public class Print implements Instruction {

    private Operand address;

    public Print(Operand address){
        this.address=address;
    }

    @Override
    public void execute(ProgramCounter pc, Memory m) {   // TODO fixa execute
        Word x = address.getWord(m);
        x.printValue();
        pc.increment();
    }


}
