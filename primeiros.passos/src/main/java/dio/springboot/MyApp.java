//package dio.springboot;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//// É importante sempre revisar as anotações
//@Component // Essa notação serve para fazer com que as classes com isso virem Bean que são objetos gerenciados pelo Spring, serão componentes que serão escaneados na aplicação
//public class MyApp implements CommandLineRunner {
//
//    @Autowired // Serve para o Spring procurar o Bean desse objeto e injetá-lo aqui
//    private Calculadora calculadora;
//
//    @Override
//    public void run(String... args) throws Exception {
//        System.out.println("O resultado é: " + calculadora.somar(2, 2));
//    }
//}
