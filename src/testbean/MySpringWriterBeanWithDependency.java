package testbean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import writer.ENCRIPTA;

public class MySpringWriterBeanWithDependency {
    private ENCRIPTA encripta;

    @Autowired
    public void setEncripta (ENCRIPTA encripta){
        this.encripta = encripta;
    }

    public String runEncryption(String texto){
        return encripta.encripta(texto);
    }

    public String runDecryption(String texto){
        return encripta.desencripta(texto);
    }
}
