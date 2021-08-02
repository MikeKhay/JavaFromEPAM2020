package chapteк5InsideClass.optionA.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Notepad {
    public static void main(String[] args) {
        Notice.DateNotice dateNotice1 = new Notice.DateNotice(1,8);
        Notice.DateNotice dateNotice2 = new Notice.DateNotice(2,8);
        Notice.DateNotice dateNotice3 = new Notice.DateNotice(3,8);


        Notice n1 = new Notice(1, "Have a shower", dateNotice1);
        Notice n2 = new Notice(2, "go to supermarket", dateNotice1);
        Notice n3 = new Notice(3, "go to work", dateNotice2);
        Notice n4 = new Notice(4, "Run", dateNotice3);
        Notice n5 = new Notice(5, "eat", dateNotice3);

        List<Notice> list = new ArrayList<>(Arrays.asList(n1, n2, n3, n4, n5));

        list.stream().filter(a -> a.getDateNotice().getDay() == 1).forEach(System.out::println);



    }
}
