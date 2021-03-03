package org.carlsoft.gestaopessoa.service;

import org.carlsoft.gestaopessoa.dto.MessageResponseDTO;
import org.carlsoft.gestaopessoa.entity.Person;
import org.carlsoft.gestaopessoa.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class PersonService {

    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {

        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(Person person){
        Person savedPerson = personRepository.save(person);
        return MessageResponseDTO
                .builder()
                .message("Create Person with ID " + savedPerson.getId())
                .build();
    }
}
