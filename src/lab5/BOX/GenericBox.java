package lab5.BOX;

public class GenericBox<T>{

    private T content;
    public void setContent(T o){
        content=o;

    }

    public T getContent(){
        return content;

    }
}
