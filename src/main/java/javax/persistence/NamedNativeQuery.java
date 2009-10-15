// $Id$
// EJB3 Specification Copyright 2004-2009 Sun Microsystems, Inc.
package javax.persistence;

import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Specifies a named native SQL query.
 * Query names are scoped to the persistence unit.
 * The <code>NamedNativeQuery</code> annotation can be applied to an
 * entity or mapped superclass.
 *
 * @since Java Persistence 1.0
 */
@Target({TYPE})
@Retention(RUNTIME)
public @interface NamedNativeQuery {

    /**
     * The name used to refer to the query with the {@link EntityManager}
     * methods that create query objects.
     */
    String name();

    /** The SQL query string. */
    String query();

    /** Query properties and hints.  (May include vendor-specific query hints.) */
    QueryHint[] hints() default {};

    /** The class of the result. */
    Class resultClass() default void.class;

    /** The name of a {@link SqlResultSetMapping}, as defined in metadata. */
    String resultSetMapping() default "";
}
