/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daily;

import ObserverPattern.Schedule;
import StatePattern.Traffic;
import StatePattern.Stay;
import StatePattern.Culture;

/**
 *
 * @author lgpc
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Schedule schedule = new Schedule();
        Culture ct = new Culture(schedule);
        Stay st = new Stay();
        Traffic tf = new Traffic(schedule);

        schedule.setdays(1, 1, 1, 1, 1, "서울");
        schedule.getDaily();
        tf.setState();
        tf.setTraffic("비행기");
        tf.getTrafficprice(1);
        st.setState("호텔");
        st.getRoompice(1, 1);
        ct.setState();
        ct.getCulturepice(1);

        schedule.setdays(1, 1, 1, 1, 1, "제주");
        schedule.getDaily();
        tf.setTraffic("비행기");
        tf.getTrafficprice(1);
        st.setState("리조트");
        st.getRoompice(1, 1);
        ct.setState();
        ct.getCulturepice(1);

    }
}
