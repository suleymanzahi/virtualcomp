package word;

import comp.Memory;

public class LongWord implements Word {

    private long value;

    public LongWord(long value) {
        this.value = value;
    }

    private long getValue()  {
        return value;
    }


    @Override
    public void add(Word w1, Word w2) {
        LongWord lw1 = (LongWord) w1;
        LongWord lw2 = (LongWord) w2;
        value = Long.sum(lw1.getValue(), lw2.getValue());
    }

    @Override
    public void multiply(Word w1, Word w2) {
        LongWord lw1 = (LongWord) w1;
        LongWord lw2 = (LongWord) w2;
        long lvalue = lw1.getValue() * lw2.getValue();
        value = lvalue;


    }

    @Override
    public void printValue() {
        System.out.println(value);
    }


    @Override
    public Word getWord(Memory memory) {
        return this;
    }

    @Override
    public boolean checkEq(Operand o1, Memory m) {
        Word word = o1.getWord(m);
        LongWord bw = (LongWord) word;
        return value == bw.getValue();
    }

}
