package word;

import comp.Memory;

public class Address implements Operand{

    private int index;

    public Address(int index) {
        this.index = index;
    }

    @Override
    public Word getWord(Memory memory) {
        return memory.get(index).getWord(memory);
    }

    @Override
    public boolean checkEq(Operand o2, Memory m) {
        Address a = (Address) o2;
        Word w1 = getWord(m);
        Word w2 = a.getWord(m);
        return w1.checkEq(w2,m);
    }

    public int getIndex() {
        return index;
    }
}
