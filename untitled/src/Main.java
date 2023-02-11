import javax.naming.ldap.UnsolicitedNotification;

public class Main {
    public static void main(String[] args)
    {
        boolean M;
        password p = new password();
        M = p.CheckPass("d2kt%gyh");
        if (M==true){
            System.out.println("Your password is true");
        }else {
            System.out.println("YOur password is incorrect");
        }

    }
}