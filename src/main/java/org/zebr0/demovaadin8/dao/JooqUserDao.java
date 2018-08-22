package org.zebr0.demovaadin8.dao;

import org.zebr0.demovaadin8.bean.User;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.zebr0.demovaadin8.dao.jooq.Tables.T_USER;

@ApplicationScoped
public class JooqUserDao extends JooqDao implements UserDao {

    @Override
    public User selectByEmail(String email) {
        return dslContext.selectFrom(T_USER)
                .where(T_USER.EMAIL.equal(email))
                .fetchAnyInto(User.class);
    }

    @Override
    public List<User> selectAll() {
        return dslContext.selectFrom(T_USER).fetchInto(User.class);
    }

    @Override
    public void insert(User user) {
        assertThat(dslContext.newRecord(T_USER, user).insert()).isEqualTo(1);
    }

}
