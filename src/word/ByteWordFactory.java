package word;

public class ByteWordFactory implements WordFactory {

    @Override
    public Word word(String value) {
        byte byteValue = Byte.parseByte(value);
        return new ByteWord(byteValue);
    }
}
