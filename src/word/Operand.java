package word;

import comp.Memory;

public interface Operand {

    Word getWord(Memory memory);

    boolean checkEq(Operand o2, Memory m);

}
