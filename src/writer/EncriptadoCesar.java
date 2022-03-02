package writer;

public class EncriptadoCesar implements ENCRIPTA {

    @Override
    public String encripta(String texto) {
        //se aumenta la pos por 3
        int longitudTraslacion = 3;
        //Se crea un metodoCesar ya que el codigo llega a ser repetitivo
        return metodoCesar(texto, longitudTraslacion);
    }

    @Override
    public String desencripta(String texto) {
        //Se devuelve el alfabeto con negativo, se resta la pos por 3
        int longitudTraslacion = -3;
        //Se crea un metodoCesar ya que el codigo llega a ser repetitivo
        return metodoCesar(texto, longitudTraslacion);
    }

    private String metodoCesar(String texto, int longitudTraslacion){
        String mensaje = texto;
        int posAlfabetoOriginal;
        int posNuevoAlfabeto;
        char newCharacter;
        //StringBuilder posee la caracteristica de que es un String mutable, se puede cambiar
        StringBuilder msgEncriptado = new StringBuilder();
        // Por cada caracter en el mensaje convertido a un arreglo de caracteres, se revisa si el caracter es vacío o no. Luego se generan ambas posiciones en los alfabetos.
        for (char character : mensaje.toCharArray()) {
            if (character != ' ') {
                posAlfabetoOriginal = character - 'a';
                posNuevoAlfabeto = (posAlfabetoOriginal + longitudTraslacion);
                //El nuevo carater se encuentraria en la pos nueva del alfabeto: 3
                newCharacter = (char) ('a' + posNuevoAlfabeto);
                msgEncriptado.append(newCharacter);
            } else {
                msgEncriptado.append(character);
            }
        }
        //Se busca el valor del msgEncriptado para convertilo a String.
        mensaje = String.valueOf(msgEncriptado);
        return mensaje ;
    }
}
