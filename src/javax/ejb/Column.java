//$Id$
//EJB Specification Copyright 2004 Sun Microsystems, Inc.
package javax.ejb;

import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

/**
 * @author Emmanuel Bernard
 */
@Target({TYPE, METHOD, FIELD}) @Retention(RUNTIME)
public @interface Column {
	String name() default "";
	boolean primaryKey() default false;
	boolean unique() default false;
	boolean nullable() default true;
	boolean insertable() default true;
	boolean updatable() default true;
	String columnDefinition() default "";
	String secondaryTable() default "";
	int length() default 255;
	int precision() default 0;
	int scale() default 0;
	boolean specified() default true; // For internal use only
}
