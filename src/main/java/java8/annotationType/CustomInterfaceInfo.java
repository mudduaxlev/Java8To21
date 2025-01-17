package java8.annotationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
public @interface CustomInterfaceInfo {
	String info() default "Aj is the king";
}
