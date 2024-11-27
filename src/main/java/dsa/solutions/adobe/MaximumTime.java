package dsa.solutions.adobe;

import java.util.ArrayList;

public class MaximumTime {

    private static double getDistanceSquared(Point a, Point b) {
        return ((a.x - b.x) * (a.x - b.x)) + ((a.y - b.y) * (a.y - b.y));
    }

    public static double maxTime(int n, int speed, int[][] locations) {
        if (n == 1) {
            return 0;
        }

        ArrayList<Point> points = new ArrayList<>();
        for (int[] loc : locations) {
            points.add(new Point(loc[0], loc[1]));
        }

        Point[] convexHull = ConvexHull.compute(points);
        int num = convexHull.length;

        if (num == 2) {
            double maxDist = Math.sqrt(getDistanceSquared(convexHull[0], convexHull[1]));
            return maxDist / speed;
        }

        int midHull = 1;
        while (Math.abs(getCrossProduct(convexHull[num - 1], convexHull[0], convexHull[(midHull + 1) % num])) >
                Math.abs(getCrossProduct(convexHull[num - 1], convexHull[0], convexHull[midHull]))) {
            midHull++;
        }

        int lower = 0, upper = midHull;
        double maxDist = 0;

        while (lower < midHull || upper < num) {
            maxDist = Math.max(maxDist, getDistanceSquared(convexHull[lower], convexHull[upper]));
            if (Math.abs(getCrossProduct(convexHull[lower], convexHull[(upper + 1) % num], convexHull[(lower + 1) % num])) >
                    Math.abs(getCrossProduct(convexHull[lower], convexHull[upper], convexHull[(lower + 1) % num]))) {
                upper++;
            } else {
                lower++;
            }
        }

        return Math.sqrt(maxDist) / speed;
    }

    private static double getCrossProduct(Point a, Point b, Point c) {
        return ((b.x - a.x) * (c.y - a.y)) - ((b.y - a.y) * (c.x - a.x));
    }
}
