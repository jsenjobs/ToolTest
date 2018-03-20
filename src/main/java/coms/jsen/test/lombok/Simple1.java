package coms.jsen.test.lombok;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
public class Simple1 {

    @Getter @Setter private String name;

    public int sex;

    public static int id;


    public Simple1(@NonNull String name) {
        this.name = name;
        System.out.println(name);
    }

    public static void main(String[] args) {
        Simple1 s = new Simple1("jsen");
        System.out.println(s.getName());
        new Simple1();
        new Simple1("jsen", 20);
        new Simple1(null);

    }
}
