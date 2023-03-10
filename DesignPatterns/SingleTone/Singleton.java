package DesignPatterns.SingleTone;

// we use singleton design when we want to instanciate the constructe as it called and only instanciate ones
//types of the singletone
// 1. egar signgleton.
// 2. lazy sigleton. (widlu used)
public class Singleton {
   private static volatile Singleton INSTANCE;

   final String name;
   private Singleton(){
     this.name = "janak";
   }

   public static Singleton getInstance()
   {
       if(INSTANCE == null)
       {
           synchronized (Singleton.class)
           {
              if(INSTANCE == null)
              {
                  INSTANCE = new Singleton();
              }
           }
       }
       return INSTANCE;
   }
}


