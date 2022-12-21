package DesignPatterns.ProxyDesign;

public class DatabaseExecutorProxy implements DatabaseExecutor{
    boolean admin;
    DatabaseExecutorImpl databaseExecutor;

    public DatabaseExecutorProxy(String name,String password) {
        if(name.equals("ADMIN") && password.equals("1234"))
        {
             admin = true;
             databaseExecutor = new DatabaseExecutorImpl();
        }
    }

    @Override
    public void executeQuery(String query) throws Exception {
      if(admin)
      {
          databaseExecutor.executeQuery(query);
      }else
      {
          extracted(query);
      }
    }
    private void extracted(String query) throws Exception {
        if(query.equals("DELETE"))
        {
            throw new Exception("you are not authorized to delete this query");
        }else
        {
            databaseExecutor =  new DatabaseExecutorImpl();
            databaseExecutor.executeQuery(query);
        }
    }
}
