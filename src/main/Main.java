package main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import testbean.MySpringWriterBeanWithDependency;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int opcion;
        String texto;
        ApplicationContext context = new ClassPathXmlApplicationContext("file:META-INF/beans.xml");
        BeanFactory factory = context;
        MySpringWriterBeanWithDependency test = (MySpringWriterBeanWithDependency) factory
                .getBean("MySpringWriterBeanWithDependency");
        do {
            System.out.println("Digite 1 para ENCRIPTAR o 2 para DESENCRIPTAR, 0 para SALIR: ");
            opcion = Integer.parseInt(in.readLine());
            switch (opcion) {
                case 0:
                    break;
                case 1:
                    System.out.println("Texto: ");
                    texto = in.readLine();
                    System.out.println("TEXTO ENCRIPTADO -- RESULTADO: " + test.runEncryption(texto.toLowerCase()));
                    break;
                case 2:
                    System.out.println("Texto: ");
                    texto = in.readLine();
                    System.out.println("TEXTO DESENCRIPTADO -- RESULTADO: " + test.runDecryption(texto.toLowerCase()));
                    break;
            }
        } while (opcion != 0);
    }
}

//ALFABETO PARA METODO CESAR
//a b c d e f g h i j k l m n o p q r s t u v w x y z

//d e f g h i j k l m n o p q r s t u v w x y z a b c