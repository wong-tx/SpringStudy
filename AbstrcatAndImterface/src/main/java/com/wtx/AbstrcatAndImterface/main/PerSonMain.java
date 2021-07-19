package com.wtx.AbstrcatAndImterface.main;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.wtx.AbstrcatAndImterface.entity.person;
import org.apache.commons.lang.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/9/8 9:21
 */
public class PerSonMain {


    public static void main(String[] args) {
//        String str = "!23";
//        List<String> list = Arrays.asList(str.split("/"));
//        list.add("1");
//        System.out.println(list);

        person person = new person();
        person.setId(99);

        person person0 = new person();
        person0.setId(88);

        person person1 = new person();
        person1.setId(1);
        person1.setGame("person");

        person person2 = new person();
        person2.setId(2);
        person2.setGame("person0");

        person person3 = new person();
        person3.setId(3);
        person3.setGame("person3");

        HashMap<Object, person> map = Maps.newHashMap();
        map.put(1,person);
        map.put(2,person0);
        List<person> list = Lists.newArrayList();
        list.add(person1);
        list.add(person2);
        list.add(person3);

        List<person> personList = list.stream().map(i -> {
            com.wtx.AbstrcatAndImterface.entity.person person4 = map.get(i.getId());
            if (person4 != null) {
                person4.setGame(i.getGame());
                return person4;
            }
            return null;
        }).filter(Objects::nonNull).collect(Collectors.toList());
        System.out.println(personList);

        List<person> list1 = list.stream().map(i -> {
            com.wtx.AbstrcatAndImterface.entity.person person4 = map.get(i.getId());
            if (person4 != null) {
                person4.setGame(i.getGame());
                return person4;
            }
            return null;
        }).filter(Objects::isNull).collect(Collectors.toList());
        System.out.println(list1);




    }


}
