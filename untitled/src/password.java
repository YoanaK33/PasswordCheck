public class password {
    public static boolean CheckPass(String pass)
    {
        char[]special = {'@', '!', '#','%'};
        char[]numbers = {'0','1','2','3','4','5','6','7','8','9'};

        char[]arrayOfPassword = pass.toCharArray();
        boolean two = false;
        boolean conteinsCharacter = false;
        if(pass.length() < 8)
        {
            return false;
        }
        for (int i = 0; i<arrayOfPassword.length; i++ )
        {
            for (int p=0; p< special.length; p++)
            {
                if (arrayOfPassword[i] == special[p])
                {
                    conteinsCharacter=true;

                }
            }
            for (int o = 0; o< numbers.length; o++){
                if (arrayOfPassword[i] == numbers[o]){
                    two=true;

                }
            }

        }

           if(conteinsCharacter==true && two==true)
           {
               return true;
           }else{
               return false;
           }




    }

}
