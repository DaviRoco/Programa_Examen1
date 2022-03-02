package writer;

import java.util.Arrays;

public class EncriptadoVignere implements ENCRIPTA {
    private String clave = "LOUP";

    @Override
    public String encripta(String texto) {
        return metodoVignereEncrypt(texto, clave);
    }

    @Override
    public String desencripta(String texto) {
        return metodoVignereDecrypt(texto, clave);
    }

    static String metodoVignereEncrypt(String texto, String clave){
        StringBuilder msgEncriptado = new StringBuilder();
        texto = texto.toUpperCase();
        for (int i = 0, j = 0; i < texto.length(); i++) {
            char letter = texto.charAt(i);
            msgEncriptado.append((char) (((letter - 65) + (clave.charAt(j) - 65)) % 26 + 65));
            j = ++j % clave.length();
        }
        return msgEncriptado.toString();
    }
    static String metodoVignereDecrypt(String texto, String clave){
        StringBuilder msgDesencriptado = new StringBuilder();
        texto = texto.toUpperCase();
        for (int i = 0, j = 0; i < texto.length(); i++) {
            char letter = texto.charAt(i);
            msgDesencriptado.append((char) ((letter - clave.charAt(j) + 26) % 26 + 65));
            j = ++j % clave.length();
        }
        return msgDesencriptado.toString();
    }
}
