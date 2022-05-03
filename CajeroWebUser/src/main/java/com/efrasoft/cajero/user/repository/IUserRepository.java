package com.efrasoft.cajero.user.repository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.efrasoft.cajero.commons.entity.User;


@RepositoryRestResource(path  ="user")
public interface IUserRepository extends PagingAndSortingRepository<User, Long> {

}
