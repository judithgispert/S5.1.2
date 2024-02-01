package cat.itacademy.barcelonactiva.gispert.judith.s05.t01.n02.exceptions;

public class FlowerNotFoundException extends RuntimeException{
    public FlowerNotFoundException(String errorMessage){
        super(errorMessage);
    }
}
