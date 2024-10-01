package org.example.strategy3;

public class SoupStrategy implements BoiledStrategy{
    @Override
    public String boiled() {
        return "스프를 끓인다";
    }
}
