/*
 * This file is generated by jOOQ.
 */
package fr.mazerty.torii.dao.jooq;


import javax.annotation.Generated;

import org.jooq.Sequence;
import org.jooq.impl.SequenceImpl;


/**
 * Convenience access to all sequences in torii
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

    /**
     * The sequence <code>torii.t_user_id_seq</code>
     */
    public static final Sequence<Integer> T_USER_ID_SEQ = new SequenceImpl<Integer>("t_user_id_seq", Torii.TORII, org.jooq.impl.SQLDataType.INTEGER.nullable(false));
}