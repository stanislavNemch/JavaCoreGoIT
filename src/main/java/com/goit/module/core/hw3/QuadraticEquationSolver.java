package com.goit.module.core.hw3;

public class QuadraticEquationSolver {

    public double[] solve(int a, int b, int c) {
        // Step 1: We calculate the discriminant D = b² - 4ac
        double discriminant = (double) b * b - 4.0 * a * c;

        // Step 2: Check the value of D and determine the number of roots
        if (discriminant < 0) {
            // D < 0 — no real roots, return an empty array
            return new double[0];
        } else if (discriminant == 0) {
            // D = 0 — one root: x = -b / (2a)
            double root = -b / (2.0 * a);
            return new double[]{root};
        } else {
            // D > 0 — two roots: x = (-b ± √D) / (2a)
            double sqrtD = Math.sqrt(discriminant);
            double root1 = (-b + sqrtD) / (2.0 * a);
            double root2 = (-b - sqrtD) / (2.0 * a);

            // Sort: first the larger root, then the smaller
            if (root1 < root2) {
                double temp = root1;
                root1 = root2;
                root2 = temp;
            }

            return new double[]{root1, root2};
        }
    }
}
