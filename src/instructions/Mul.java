package instructions;

import word.Address;
import word.Operand;
import word.Word;

public class Mul extends BinOp {

    public Mul(Operand ad1, Operand ad2, Address ad3){
        super(ad1,ad2,ad3);
    }

    @Override
    protected void evaluate(Word word1, Word word2, Word toAdd) {
        toAdd.multiply(word1, word2);
    }

}
