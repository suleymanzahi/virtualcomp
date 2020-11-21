package word;

public class LongWordFactory implements WordFactory {

    @Override
    public Word word(String value) {
        long longValue = Long.parseLong(value);
        return new LongWord(longValue);
    }
}
