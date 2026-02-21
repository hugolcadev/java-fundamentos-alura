package modelo;

import excecao.CepInvalidoException;

public class Cep {
    private final String numero;

    public Cep (String numero){
        numero = numero.replace("-", "");
        validaNumero(numero);
        this.numero = numero;
    }

    private void validaNumero(String numero){
        if (numero.length() != 8 || !cepContemApenasNumeros(numero)){
            throw new CepInvalidoException("O cep inserido é inválido ou está no formato errado.");
        }
    }

    private boolean cepContemApenasNumeros(String numero){
        for (int i = 0; i < numero.length(); i++){
            if (!Character.isDigit(numero.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public String getNumero() {
        return this.numero;
    }
}
