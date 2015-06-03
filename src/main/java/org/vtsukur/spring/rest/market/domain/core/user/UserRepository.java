package org.vtsukur.spring.rest.market.domain.core.user;

import org.springframework.data.repository.CrudRepository;

/**
 * @author volodymyr.tsukur
 */
public interface UserRepository extends CrudRepository<User, Long> {
}