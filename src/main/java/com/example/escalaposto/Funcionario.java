package com.example.escalaposto;

import java.util.Date;

public class Funcionario {
    private int idFuncionario;
    private String nomeCartao;
    private String nomeFunc;
   private Date diaFolga;
    private Date domMes;

    public Funcionario(int idFuncionario, String nomeCartao, String nomeFunc, Date diaFolga) {
        this.idFuncionario = idFuncionario;
        this.nomeFunc = nomeFunc;
        this.diaFolga = diaFolga;
    }

    public String getNomeCartao() {
        return nomeCartao;
    }

    public void setNomeCartao(String nomeCartao) {
        this.nomeCartao = nomeCartao;
    }

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public Date getDiaFolga() {
        return diaFolga;
    }

    public void setDiaFolga(Date diaFolga) {
        this.diaFolga = diaFolga;
    }

    public Date getDomMes() {
        return domMes;
    }

    public void setDomMes(Date domMes) {
        this.domMes = domMes;
    }
}
