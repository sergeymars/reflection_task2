package net.bigmir.sergey_8888new;

import java.lang.annotation.*;

@Inherited
@Target(value = ElementType.TYPE)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface SaveTo {
    String path();
}
