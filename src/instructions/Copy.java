package instructions;

import comp.Memory;
import comp.ProgramCounter;
import word.Address;
import word.Operand;
import word.Word;

public class Copy implements Instruction {

    private Operand word;
    private Address address;

    public Copy (Operand word, Address address){
        this.word=word;
        this.address=address;
    }

    @Override
    public void execute(ProgramCounter pc, Memory m) {   //TODO fixa execute
        m.add(address.getIndex(), word.getWord(m));
        pc.increment();
    }

/*    public String toString(){
        return "Copy " + word.ge+ " to " + address.getIndex();
    }*/
}
