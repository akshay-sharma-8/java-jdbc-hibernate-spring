import java.util.ArrayList;

public class Bank  {
    private ArrayList<Customer> customerList = new ArrayList<>();
   public void  deposit(String name, String bankAccountNumber,double amount){
              for(Customer c : customerList){
                  if(name.equals(c.getName()) && bankAccountNumber.equals(c.getBankAccountNumber())){
                      c.setBalance(c.getBalance() + amount);
                  }
              }
   }

   public void withdraw(String name, String bankAccountNumber ,double amount){
       for(Customer c : customerList){
           if(name.equals(c.getName()) && bankAccountNumber.equals(c.getBankAccountNumber())){
               if (c.getBalance() >= amount) {
                   c.setBalance(c.getBalance() - amount);
               } else {
                   System.out.println("Insufficient balance.");
               }
           }
       }

   }
   public void checkBalance(String name , String bankAccountNumber){
       for(Customer c : customerList){
           if(name.equals(c.getName()) && bankAccountNumber.equals(c.getBankAccountNumber())){
               System.out.println("Balance: ₹" + c.getBalance());
           }
       }
   }
    public void viewAccountDetails(String name, String bankAccountNumber) {
        for (Customer c : customerList) {
            if(name.equals(c.getName()) && bankAccountNumber.equals(c.getBankAccountNumber()))  System.out.println("Name : " + c.getName() + " Age : " + c.getAge() + " Address : " + c.getAddress() +"Account Number : "+c.getBankAccountNumber()+ " Balance : ₹" + c.getBalance());
        }
            
    }

    public void openAccount(String name, int age, String address , String bankAccountNumber ) {
        for (Customer c : customerList) {
            if (c.getName().equals(name)) {
                System.out.println("An account already exists for this name.");
                return;
            }
        }
        Customer newCustomer = new Customer();
        newCustomer.setName(name);
        newCustomer.setAge(age);
        newCustomer.setAddress(address);
        newCustomer.setBalance(0); // Default initial balance
        newCustomer.setBankAccountNumber(bankAccountNumber);
        customerList.add(newCustomer);
        System.out.println("Account created successfully for " + name);
    }

}
