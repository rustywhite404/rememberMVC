package org.example.strategy3;

public class Chef {
    public static void main(String[] args) {
        Pot pot = new Pot();
        //냄비를 준비한다.
        String soup = pot.cook(new SoupStrategy());
        System.out.println(soup);
        //스프 재료를 넣으면 스프를 요리한다
        String source = pot.cook(new SourceStrategy());
        System.out.println(source);
        //소스 재료를 넣으면 소스를 요리한다
    }
}
