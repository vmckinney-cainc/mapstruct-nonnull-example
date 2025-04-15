package org.example;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface ParentMapper {

    @Mapping(target = "childFoo", source = "child.foo")
    ParentTarget map(ParentSource parent);
}
