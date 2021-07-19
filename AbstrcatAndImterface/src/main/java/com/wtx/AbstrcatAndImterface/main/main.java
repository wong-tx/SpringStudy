package com.wtx.AbstrcatAndImterface.main;

import com.wtx.AbstrcatAndImterface.entity.Mammals;
import com.wtx.AbstrcatAndImterface.entity.Phone;
import com.wtx.AbstrcatAndImterface.entity.person;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/6/19 9:18
 */
public class main {

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.game();
        phone.video();
        Mammals mammals = new Mammals();
        person person = new person();
        /**
         *
         1.在子类的类定义中，可以直接调用到父类的protected函数。（提示，如果子类又定义了一个重名的函数，那么就要用super.f()了）
         2.通过子类对象无法调用到父类的protected函数，不管是不是用父类引用来接的（上面的这个匿名内部类用父类引用接的；局部内部类用子类引用的）。
         3.直接创建基类对象，通过基类对象也是无法调用到父类的protected函数。因为此时就是默认的包访问权限，自然也就不可以。

         */
//        person.game();

        String str = "sjalsnka ";
        String s = str.replaceAll("''", "'");
        System.err.println(s);

    }
}
