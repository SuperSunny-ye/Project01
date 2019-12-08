package HelloWorld;

import sun.security.provider.PolicySpiFile;
import sun.tracing.PrintStreamProviderFactory;

import java.io.PrintStream;
import java.util.ArrayList;

public class hellowork {


    public static  void main(String[] args) {
        System.out.println("你好 ，世界!");
        String[] arr = new String[]{"tom", "jerry", "lilei", "hanmeimei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //iter
        for (String s : arr) {
            System.out.println(s);

        }
        //itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
        //list.for
        ArrayList list = new Arraylist();
        list.add(123);
        list.add(456);
        list.add(789);

        for (Object o : list) {

        }
        //list.fori順序
        for (int i = 0; i < list.size(); i++) {

        }
        //list.forr逆序
        for (int i = list.size() - 1; i >= 0; i--) {

        }

    }
}

