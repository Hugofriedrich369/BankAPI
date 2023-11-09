package com.ibm.services;

import com.ibm.GlobalExceptionHandler.ContaInvalidaException;
import com.ibm.GlobalExceptionHandler.SaldoInsuficienteException;
import com.ibm.models.ContaCorrente;

import java.util.List;

public interface ContaCorrenteService {
    ContaCorrente getContaPorNumero(String numeroConta);
    void depositar(String numeroConta, double valor) throws ContaInvalidaException;
    void sacar(String numeroConta, double valor) throws ContaInvalidaException, SaldoInsuficienteException;
    void transferir(String contaOrigem, String contaDestino, double valor) throws ContaInvalidaException, SaldoInsuficienteException;
    ContaCorrente criarConta(String nome, String cpf) throws ContaInvalidaException;

}
