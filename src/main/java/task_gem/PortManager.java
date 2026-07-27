package task_gem;

import java.util.Arrays;

public class PortManager {
    public static void main(String[] args) {

        int[] serverPorts = {8080, 80, 443, 22, 5432};
        Arrays.sort(serverPorts);
        System.out.println("Sorted server ports: " + Arrays.toString(serverPorts));

        int targetPort = 443;
        int foundIndex = Arrays.binarySearch(serverPorts, targetPort);
        System.out.println("Index of port " + targetPort + ": " + foundIndex);

        int[] topTwoPorts = Arrays.copyOf(serverPorts, 2);
        System.out.println("Top 2 ports: " + Arrays.toString(topTwoPorts));
    }
}
