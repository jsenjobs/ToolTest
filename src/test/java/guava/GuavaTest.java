package guava;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;

import static com.google.common.base.Preconditions.*;

public class GuavaTest {

    @Test
    public void check1() {
        checkArgument(true);
        checkArgument(false);
    }

    @Test
    public void check2() {
        checkNotNull("hello");
        checkNotNull(null);
    }

    @Test
    public void check3() {
        print(Objects.equal(null, null));
        print(MoreObjects.toStringHelper(new TestClass("jsen", 23)).add("nameK", "valueK").addValue(12));
    }

    @Test
    public void check4() {
        checkState(true);
        checkState(false);
    }

    @Test
    public void check5() {
        List<String> list = Lists.newArrayList();
        list.add("peida");
        list.add("jerry");
        list.add("harry");
        list.add("eva");
        list.add("jhon");
        list.add("neron");

        print(list);

        Ordering o = Ordering.natural();
        print(o.sortedCopy(list));

        print(o.isOrdered(list));

        print(list);
    }

    static void print(Object o) {
        System.out.println(o);
    }

    static void print(Iterable i) {
        for (Object anI : i) {
            print(anI);
        }
        System.out.println();
    }
}
