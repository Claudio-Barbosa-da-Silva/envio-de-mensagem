/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class EnviarWhatsApp implements Mensagem{

    @Override
    public void enviar(String msg) {
    System.out.println("Enviando WhatsApp: " + msg);

    }
    
}
