package dio.springboot.exemplo3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SistemaMensagem implements CommandLineRunner {
//    @Value("${name:NoReply-DIO}")// Se não achar a propriedade nomeada de "name", será exibido NoReply-DIO por padrão para não ocorrer um erro;
//    private String nome;
//    @Value("${email}")
//    private String email;
//    @Value("${telefones}")
//    private List<Long> telefones;
    @Autowired
    private Remetente remetente;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Mensagem enviada por: " + remetente.getNome() + "\nE-mail: " + remetente.getEmail() + "\nCom telefones para contato: " + remetente.getTelefones());
        System.out.println("Seu cadastro foi realizado");
    }
}
