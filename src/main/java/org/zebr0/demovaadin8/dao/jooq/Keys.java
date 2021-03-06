/*
 * This file is generated by jOOQ.
 */
package org.zebr0.demovaadin8.dao.jooq;


import javax.annotation.Generated;

import org.jooq.UniqueKey;
import org.jooq.impl.Internal;
import org.zebr0.demovaadin8.dao.jooq.tables.TLike;
import org.zebr0.demovaadin8.dao.jooq.tables.records.TLikeRecord;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>demovaadin8</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<TLikeRecord> T_LIKE_PKEY = UniqueKeys0.T_LIKE_PKEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 {
        public static final UniqueKey<TLikeRecord> T_LIKE_PKEY = Internal.createUniqueKey(TLike.T_LIKE, "t_like_pkey", TLike.T_LIKE.TIMESTAMP);
    }
}
