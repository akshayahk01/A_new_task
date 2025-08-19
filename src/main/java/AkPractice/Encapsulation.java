package AkPractice;
class Personal{
    private String password;
    private int Atm_pin;
    private int Account_number;



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAtm_pin() {
        return Atm_pin;
    }

    public void setAtm_pin(int atm_pin) {
        Atm_pin = atm_pin;
    }

    public int getAccount_number() {
        return Account_number;
    }

    public void setAccount_number(int account_number) {
        Account_number = account_number;
    }
}

public class Encapsulation {

    private String name;
    private int id;
    private boolean fees_Cleared;



    public static void main(String[] args) {
        Encapsulation e = new Encapsulation();
        e.name="akshay hiremath";
        System.out.println(e.name);

        Personal p = new Personal();
        p.setPassword("akasakassaascnoanc");
        System.out.println("my password is :"+ p.getPassword());
    }
}
