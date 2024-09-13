public class ASCIIS {
    public static String hiveAscii() {
        return """
                      _____
                     /     \\\\
                    /       \\\\
                   /         \\\\
                  /___________\\\\
                  \\\\           /
                   \\\\         /
                    \\\\       /
                     \\\\_____/ 
                
                       HIVE!
                um banco de abelhas, 
                   para abelhas.""";
    }

    public static String logo() {
        return """
                       _ _ _
                     /       \\
                    {         }
                     \\       /
                       ````` 
                       HIVE!
                um banco de abelhas,    
                 feito por abelhas
                """;
    }

    public static String perfil(String nome, Double saldo) {
        return String.format("""
                # # # # # # # # # #
                #     .     .      #    Nome: %s
                #      \\  /       #    Tipo conta: Corrente
                #       oo         #    Saldo inicial: %.2f
                #   {/(    )\\}    #
                #  {/  (  )  \\}   #       
                #       00         #
                #                  #
                # # # # # # # # # #
                """, nome, saldo);
    }
}
