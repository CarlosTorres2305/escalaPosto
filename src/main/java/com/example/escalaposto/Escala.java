package com.example.escalaposto;

import java.util.Date;

public class Escala {
    private int idEscala;
    private Funcionario funcionario;
    private Date mesAno;

    public Escala(int idEscala, Funcionario funcionario, Date mesAno) {
        this.idEscala = idEscala;
        this.funcionario = funcionario;
        this.mesAno = mesAno;
    }

    public int getIdEscala() {
        return idEscala;
    }

    public void setIdEscala(int idEscala) {
        this.idEscala = idEscala;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Date getMesAno() {
        return mesAno;
    }

    public void setMesAno(Date mesAno) {
        this.mesAno = mesAno;
    }
}
