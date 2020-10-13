package com.ashutosh.asgashutosh.repository;
import org.springframework.data.repository.CrudRepository;
import com.ashutosh.asgashutosh.model.Accounts;
public interface AccountsRepository extends CrudRepository<Accounts, Integer>
{
}
