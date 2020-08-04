package com.forleven.apirestforleventest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.forleven.apirestforleventest.models.Telefone;

public interface TelefoneRepository extends JpaRepository<Telefone, Long> {

}
