package word;

public interface Word extends Operand {

    void add(Word w1, Word w2);  // ska inte returnera ngt, samma med mul

    void multiply(Word w1, Word w2);
    
    void printValue();

}
