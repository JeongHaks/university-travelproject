/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daily;

import StatePattern.Traffic;
import StatePattern.Stay;

/**
 *
 * @author lgpc
 */
public class FreeSum {

    Traffic traffic;
    Stay stay;
    double tsp;
    double ssp;
    int tc;

    public FreeSum() {
    }

    public void settsp(Traffic traffic) {
        this.traffic = traffic;
        this.tsp = traffic.getTrafficprice(tc);

    }

    public void setssp(Stay stay) {
        this.stay = stay;
        this.ssp = stay.getRoompice(tc, tc);
    }

    public double getFreeSum() {
        double freesum = tsp + ssp;
        System.out.println("합계" + freesum);
        return freesum;
    }

}
