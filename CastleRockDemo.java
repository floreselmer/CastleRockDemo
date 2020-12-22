public class CastleRockDemo
{
   public static void main( String[] args )
   {
      
      Account a1 = new Account(101,821.0,.03);
      a1.computeInterest();
      a1.printAccountDetails();
      
      System.out.println(" ");
      
      Account b1 = new Account(200,1250.00,.024);
      b1.computeInterest();
      b1.printAccountDetails();
      
      System.out.println(" ");
      
      Account c1 = new Account(300,320.00,.019);
      c1.computeInterest();
      c1.printAccountDetails();
      
      System.out.println(" ");
        
      //Account basic = new Account();
      
      
      
      
      
    }
   
  
  
  
  
  
  
}