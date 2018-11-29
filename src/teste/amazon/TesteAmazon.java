package teste.amazon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TesteAmazon {
	
	
    static List<Integer> greatestFlightRangeDrones(Integer numberOfRequiredDrones, List<Drone> drones, List<Integer> inMaintenanceDrones) {
        // TODO: implement this function
        List<Integer> result = new ArrayList<Integer>();
        Collections.sort(drones, new Comparator<Drone>() {

			@Override
			public int compare(Drone o1, Drone o2) {
				int result = 0;
				if(o1.getFlightRange()>o2.getFlightRange())
					result = 1;
				else if (o1.getFlightRange()<o2.getFlightRange())
					result = -1;
				return result;
			}
		});
        
        for (Iterator<Drone> it = drones.iterator();it.hasNext(); ) {
        	Drone drone = it.next();
        	if(inMaintenanceDrones.contains(drone.getId())){
        		it.remove();
        	}
		}
        
        Collections.sort(drones, Collections.reverseOrder());
        List<Drone> subList = drones.subList(0, numberOfRequiredDrones);
        
        for (Drone drone : subList) {
        	result.add(drone.getId());
		} 
        
		return result;
    }

    private static class Drone {
        private int id;
        private int flightRange;

        public Drone(int id, int flightRange) {

            this.id = id;
            this.flightRange = flightRange;
        }

        public int getId() {
            return id;
        }

        public int getFlightRange() {
            return flightRange;
        }
    }

    // The first line of the input contains three decimal integers separated by space: total number of drones ('D'), number of drones to be selected ('G') and number of drones in maintenance ('M').
    // The following 'D' lines each contains two decimal integers separated by space with information about each drone: ID and flight range in kilometers.
    // The following 'M' lines each contains the numeric ID of a drone currently in maintenance.

    // Print the IDs of the 'G' selected drones to the standard output, one per line, sorted by flight range (greater first).
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numberOfDrones = in.nextInt();
        int numberOfRequiredDrones = in.nextInt();
        int numberOfDronesInMaintenance = in.nextInt();

        List<Drone> drones = new ArrayList<>();
        List<Integer> inMaintenanceDrones = new ArrayList<>();

        for(int i=0; i< numberOfDrones; i++) {
            drones.add(new Drone(in.nextInt(), in.nextInt()));
        }

        for(int i=0; i< numberOfDronesInMaintenance; i++) {
            inMaintenanceDrones.add(in.nextInt());
        }

        List<Integer> greatestFlightRangeDrones = greatestFlightRangeDrones(numberOfRequiredDrones, drones, inMaintenanceDrones);

        for(int i=0; i < greatestFlightRangeDrones.size(); i++) {
            System.out.println(greatestFlightRangeDrones.get(i));
        }

    }}
