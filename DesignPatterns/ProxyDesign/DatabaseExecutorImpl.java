package DesignPatterns.ProxyDesign;

public class DatabaseExecutorImpl implements DatabaseExecutor{
    @Override
    public void executeQuery(String query) throws Exception {
        System.out.println("Executing Query: " + query);
    }
}
