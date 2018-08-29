package org.zebr0.demovaadin8.dao;

import org.jooq.DSLContext;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import static org.assertj.core.api.Assertions.assertThat;
import static org.zebr0.demovaadin8.dao.jooq.tables.TLike.T_LIKE;

@ApplicationScoped
public class LikeDao {

    @Inject
    private DSLContext dslContext;

    public int count() {
        return dslContext.fetchCount(T_LIKE);
    }

    public void insert() {
        assertThat(dslContext.insertInto(T_LIKE).defaultValues().execute()).isEqualTo(1);
    }

}
