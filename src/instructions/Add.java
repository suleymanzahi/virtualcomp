package instructions;

import word.Address;
import word.Operand;
import word.Word;

public class Add extends BinOp {

    public Add(Operand op1, Operand op2, Address address) {
        super(op1,op2,address);
    }

    @Override
    protected void evaluate(Word word1, Word word2, Word toAdd) {
        toAdd.add(word1,word2);
    }
}
