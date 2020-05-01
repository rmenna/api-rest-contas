package com.contas.apiContas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.contas.apiContas.model.Conta;

public interface ContaRepository extends JpaRepository<Conta, Long> {

}
