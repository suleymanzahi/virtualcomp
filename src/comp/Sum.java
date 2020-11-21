package comp;
import word.*;
import instructions.*;


class Sum extends Program {
    String value;

    public Sum  (String value, WordFactory wf) {
        this.value = value;
        Address n = new Address(0),
                sum = new Address(1);
        add(new Copy(wf.word(value), n));
        add(new Copy(wf.word("1"), sum));
        add(new JumpEq(6, n, wf.word("1")));
        add(new Add(sum, n, sum));
        add(new Add(n, wf.word("-1"), n));
        add(new Jump(2));
        add(new Print(sum));
        add(new Halt());
    }

    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("0: Copy " + value + " to [0] \n");
        str.append("1: Copy 1 to [1] \n");
        str.append("2: Jump to 6 if [0] == 1 \n");
        str.append("3: Add [1] and [0] into [1] \n");
        str.append("4: Add [0] and -1 into [0] \n");
        str.append("5: Jump to 2 \n");
        str.append("6: Print [1] \n");
        str.append("7: Halt \n");
        return str.toString();
    }
}
