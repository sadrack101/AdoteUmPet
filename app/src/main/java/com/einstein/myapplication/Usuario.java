package com.einstein.myapplication;

public class Usuario {

    private String UID;
    private String nomeInput;
    private String numeroTelefoneInput;
    private String emailInput;
    private String confirmEmailInput;
    private String senhaInput;
    private String confirmSenhaInput;

    public Usuario(String UID, String nomeInput, String numeroTelefoneInput, String emailInput,
                   String confirmEmailInput, String senhaInput, String confirmSenhaInput) {
        this.UID = UID;
        this.nomeInput = nomeInput;
        this.numeroTelefoneInput = numeroTelefoneInput;
        this.emailInput = emailInput;
        this.confirmEmailInput = confirmEmailInput;
        this.senhaInput = senhaInput;
        this.confirmSenhaInput = confirmSenhaInput;
    }

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }

    public String getNomeInput() {
        return nomeInput;
    }

    public void setNomeInput(String nomeInput) {
        this.nomeInput = nomeInput;
    }

    public String getNumeroTelefoneInput() {
        return numeroTelefoneInput;
    }

    public void setNumeroTelefoneInput(String numeroTelefoneInput) {
        this.numeroTelefoneInput = numeroTelefoneInput;
    }

    public String getEmailInput() {
        return emailInput;
    }

    public void setEmailInput(String emailInput) {
        this.emailInput = emailInput;
    }

    public String getConfirmEmailInput() {
        return confirmEmailInput;
    }

    public void setConfirmEmailInput(String confirmEmailInput) {
        this.confirmEmailInput = confirmEmailInput;
    }

    public String getSenhaInput() {
        return senhaInput;
    }

    public void setSenhaInput(String senhaInput) {
        this.senhaInput = senhaInput;
    }

    public String getConfirmSenhaInput() {
        return confirmSenhaInput;
    }

    public void setConfirmSenhaInput(String confirmSenhaInput) {
        this.confirmSenhaInput = confirmSenhaInput;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "UID='" + UID + '\'' +
                ", nomeInput='" + nomeInput + '\'' +
                ", numeroTelefoneInput='" + numeroTelefoneInput + '\'' +
                ", emailInput='" + emailInput + '\'' +
                '}';
    }

}
