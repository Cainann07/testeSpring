//package dio.springboot.exempl2;
//
//import com.google.gson.Gson;
//import org.springframework.stereotype.Component;
//
//@Component
//public class ConversorJson { // não é necessário usar new para essa classe pois é um componente
//    private Gson gson = new Gson();
//    public ViaCepResponse converter(String json){
//        ViaCepResponse response = gson.from(json, ViaCepResponse.class);
//        return response;
//    }
//}
