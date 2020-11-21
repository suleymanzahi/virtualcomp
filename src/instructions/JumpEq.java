package instructions;

import comp.Memory;
import comp.ProgramCounter;
import word.Operand;

public class JumpEq implements Instruction {

    private Operand o1;
    private Operand o2;
    private int nextInstruction;

    public JumpEq(int nextInstruction, Operand address,Operand word){
        this.o1=word;
        this.o2=address;
        this.nextInstruction=nextInstruction;

    }

    @Override
    public void execute(ProgramCounter pc, Memory m) {  //TODO använd getWord, vi får impl. equals i Word-klasserna

        if (o1.checkEq(o2,m)) {
            pc.setCounter(nextInstruction);
        } else {
            pc.increment();
        }

    }

    /*public String toString(){
        return  "Jump to " + nextInstruction +" if" + o1.toString();
    }*/
}
