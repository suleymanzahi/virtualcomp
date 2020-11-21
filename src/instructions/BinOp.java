package instructions;

import comp.Memory;
import comp.ProgramCounter;
import word.Address;
import word.Operand;
import word.Word;

abstract class BinOp implements Instruction{

     private Operand op1, op2;
     private Address address;

     protected BinOp (Operand op1, Operand op2, Address ad) {
         this.op1 = op1;
         this.op2 = op2;
         this.address = ad;
     }

    @Override
    public void execute(ProgramCounter pc, Memory m) {
        evaluate(op1.getWord(m),op2.getWord(m), address.getWord(m));
        pc.increment();
    }

    protected abstract void evaluate(Word word1, Word word2, Word toAdd);

}
