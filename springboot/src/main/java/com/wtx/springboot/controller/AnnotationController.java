package com.wtx.springboot.controller;

import com.wtx.springboot.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.StandardCharsets;
import java.util.Objects;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/7/2 9:30
 *
 * @ConfigurationProperties(prefix = "person.dog")注解来修饰某类bean，
 * 其作用是告诉springBoot，获取配置文件中属性值，然后此类中的属性将与配置文件中对应属性一一绑定。
 * 【prefix = "person.dog"】表示与配置文件中哪个层级的属性进行绑定。如果是在主配置文件中(
 * 属性名必须是application.yml或application.properties)可以直接使用，实际生产中因为项目中
 * 一些属性为了直观区分，需自定义一个配置文件，例如redis.properties，这些属性在自定义的 配置文件中的，
 * 则需要配合@PropertySource使用.
 *
 * 默认Spring只读取主配置文件的属性，因此要引入自定义配置文件则要使用@PropertySource注解，
 * 并指定自定义配置文件路径，这样就可以将指定配置文件的属性读取到Spring中以供使用。
 * 我们可以通过environment.getProperty("env.name")，获取指定属性的值。也可以配合@Value 注解
 * 将Spring容器中读取到的值赋值给bean的属性。这种方式适合主要注入的属性少的场景，如果bean属性很多，
 * 那么要一个个的给属性标注@Value注解，过于繁琐，可以直接使用@ConfigurationProperties(prefix = "person.dog")自动适配属性。
 */
@RestController
public class AnnotationController {

    @Autowired
    Person person;
    @GetMapping("/ConfigurationProperties.do")
    public  void ConfigurationProperties(){
        System.out.println(person.getAge());
        System.out.println(person.getName());
    }

    public static void main(String[] args) {
        System.out.println(StandardCharsets.UTF_8);
        String str = null ;
        if (Objects.equals("1",str)){
            System.out.println("M");
        }
        if (!Objects.equals("1",str)){
            System.out.println("A");
        }
        Person person = new Person();
        String name = person.getName();
        Person person1 = new Person();
        person1.setName(name);
        System.out.println("css ");
    }
}
