package DesignPatterns.ProxyDesign;

//the proxy design is structural design pattern,
//when there are specific conditions like someone is in auth to do this where as some one is not

//EX -> ADMIN,USER

public interface DatabaseExecutor{
    abstract void executeQuery(String query) throws Exception;
}
