package org.example.strategy3;

public class SourceStrategy implements BoiledStrategy{
    @Override
    public String boiled() {
        return "소스를 끓인다";
    }
}
