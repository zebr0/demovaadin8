/*
 * This file is generated by jOOQ.
 */
package org.zebr0.demovaadin8.dao.jooq.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.UpdatableRecordImpl;
import org.zebr0.demovaadin8.dao.jooq.tables.TLike;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TLikeRecord extends UpdatableRecordImpl<TLikeRecord> implements Record1<Timestamp> {

    private static final long serialVersionUID = 1744918962;

    /**
     * Setter for <code>demovaadin8.t_like.timestamp</code>.
     */
    public void setTimestamp(Timestamp value) {
        set(0, value);
    }

    /**
     * Getter for <code>demovaadin8.t_like.timestamp</code>.
     */
    public Timestamp getTimestamp() {
        return (Timestamp) get(0);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Timestamp> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<Timestamp> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<Timestamp> valuesRow() {
        return (Row1) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field1() {
        return TLike.T_LIKE.TIMESTAMP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component1() {
        return getTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value1() {
        return getTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TLikeRecord value1(Timestamp value) {
        setTimestamp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TLikeRecord values(Timestamp value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TLikeRecord
     */
    public TLikeRecord() {
        super(TLike.T_LIKE);
    }

    /**
     * Create a detached, initialised TLikeRecord
     */
    public TLikeRecord(Timestamp timestamp) {
        super(TLike.T_LIKE);

        set(0, timestamp);
    }
}
