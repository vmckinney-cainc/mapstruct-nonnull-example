package org.example;

import org.mapstruct.factory.Mappers;

public class App {
    public static void main(String[] args) {
        Mappers.getMapper(ParentMapper.class).map(new ParentSource(new ChildSource("bar")));
    }
}
