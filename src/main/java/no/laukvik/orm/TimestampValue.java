package no.laukvik.orm;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface TimestampValue {
    boolean nullable() default true;

    String column();
}