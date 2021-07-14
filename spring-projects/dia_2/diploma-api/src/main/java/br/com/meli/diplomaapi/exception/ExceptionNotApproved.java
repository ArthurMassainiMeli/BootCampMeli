package br.com.meli.diplomaapi.exception;

public class ExceptionNotApproved extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ExceptionNotApproved(String mensagem) {
        super(mensagem);
    }

    public ExceptionNotApproved(Exception e) {
        super(e);
    }
}
