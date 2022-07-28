/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Conexao;

import redis.clients.jedis.Jedis;

/**
 *
 * @author Leandro
 */
public class Conexao {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) throws Exception{
        try {
            Jedis jedis = new Jedis("localhost");
            System.out.println("Connection Successful");
            System.out.println("The server is running " + jedis.ping());
            jedis.set("company-name", "500Rockets.io");
            System.out.println("Stored string in redis: "+ jedis.get("company-name"));
        }catch(Exception e) {
            System.out.println(e);
        }
    }
    
}
