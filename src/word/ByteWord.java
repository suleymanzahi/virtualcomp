package word;

import comp.Memory;

public class ByteWord implements Word {

    private byte value;

    public ByteWord(byte value) {
        this.value = value;
    }

    private byte getValue() {
        return value;
    }


    @Override
    public void add(Word w1, Word w2) {
        ByteWord bw1 = (ByteWord) w1;
        ByteWord bw2 = (ByteWord) w2;
        this.value = ((byte) (bw1.getValue() + bw2.getValue()));
    }

    @Override
    public void multiply(Word w1, Word w2) {
        ByteWord bw1 = (ByteWord) w1;
        ByteWord bw2 = (ByteWord) w2;
        this.value = ( (byte) (bw1.getValue() * bw2.getValue()));
    }

    @Override
    public void printValue() {
        System.out.println(value);
    }

    @Override
    public boolean checkEq(Operand o1, Memory m) {
        Word word = o1.getWord(m);
        ByteWord bw = (ByteWord) word;
        return value == bw.getValue();
    }

    @Override
    public Word getWord(Memory memory) {
        return this;
    }
}
