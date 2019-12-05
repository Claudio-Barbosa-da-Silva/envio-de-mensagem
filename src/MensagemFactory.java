/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class MensagemFactory {
    
    public static Mensagem newInstance(){
        return newInstance("email");
    }
    
    public static Mensagem newInstance(String tipoMsg){
        if(tipoMsg.equalsIgnoreCase("sms"))
            return new EnviarSms();
        else if(tipoMsg.equalsIgnoreCase("email"))
            return new EnviarEmail();
        else throw new IllegalArgumentException("Não é possível enviar msn do tipo" + tipoMsg);
    
    }
    
}
