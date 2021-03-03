package org.carlsoft.gestaopessoa.repository;

import org.carlsoft.gestaopessoa.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
