package com.example.cadastro

class Formulario {
    var nomeCompleto: String
    var telefone: String
    var email: String
    var cadastro: Boolean
    var sexo: String
    var cidade: String
    var uf: String

    constructor(
        nomeCompleto: String,
        telefone: String,
        email: String,
        cadastro: Boolean,
        sexo: String,
        cidade: String,
        uf: String
    ) {
        this.nomeCompleto = nomeCompleto
        this.telefone = telefone
        this.email = email
        this.cadastro = cadastro
        this.sexo = sexo
        this.cidade = cidade
        this.uf = uf
    }

    override fun toString(): String {
        return "Formulario(nomeCompleto='$nomeCompleto', telefone='$telefone', email='$email', cadastro=$cadastro, sexo='$sexo', cidade='$cidade', uf='$uf')"
    }


}