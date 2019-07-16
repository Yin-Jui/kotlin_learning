package lottery;

import java.util.HashSet;
import java.util.Set;

public abstract  class numberGame {

    Set<Integer> numbers = new HashSet<>();

    int numbercount = 200;

    public abstract void generate();

}
