package org.opentutorials.javatutorials.packages.Generic;

class _EmployeeInfo{
    public int rank;
    _EmployeeInfo(int rank){this.rank = rank;}
}

class Person<T, S>{ //' < ' 안에 들어 올 수 있는 인자는 참조형만 가능. except int, char
                    // wrapper 클래스를 사용하면 기본인자를 사용 할 수 있다
    public T info;
    public S id;
    Person(T info, S id){
        this.info = info;
        this.id = id;
    }
    public <U> void printInfo(U info)
    {
        System.out.println(info);
    }
}
public class GenericDemo1 {
    public static void main(String[] args) { // int 에 대한 wrapper = Integer
        EmployeeInfo e = new EmployeeInfo(1);
        Integer id = new Integer(10);
        Person p1 = new Person(e, id);
        p1.printInfo(e); //info에 어떤 값이 들어왔는지에 따라 타입을 유추 할 수 있기에 생략 할 수 있다.

    }
}
