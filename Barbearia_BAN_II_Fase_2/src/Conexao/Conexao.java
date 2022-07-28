
package Conexao;

import redis.clients.jedis.Jedis;

/**
 *
 * @author Leandro
 */

public class Conexao {

    public void Connection(){
        try {
            Jedis jedis = new Jedis("localhost");
            System.out.println("Conexao inicializada!");
            
        }catch(Exception e) {
            System.out.println(e);
        }
    }

    public void Shutdown(Jedis jedis) {
        try {
            System.out.println("Conexao finalizada!");
            jedis.disconnect();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}