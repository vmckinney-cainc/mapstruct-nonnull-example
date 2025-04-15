// copied for reader convenience

import org.example.ChildSource;
import org.example.ParentMapper;
import org.example.ParentSource;
import org.example.ParentTarget;

import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-04-15T14:55:34-0700",
    comments = "version: 1.6.3, compiler: javac, environment: Java 20.0.1 (Oracle Corporation)"
)
public class TheGeneratedParentMapperImpl implements ParentMapper {

    @Override
    public ParentTarget map(ParentSource parent) {
        if ( parent == null ) {
            return null;
        }

        ParentTarget.ParentTargetBuilder parentTarget = ParentTarget.builder();

        parentTarget.childFoo( parentChildFoo( parent ) );

        return parentTarget.build();
    }

    private String parentChildFoo(ParentSource parentSource) {
        ChildSource child = parentSource.child();
        if ( child == null ) {
            return null;
        }
        return child.foo();
    }
}