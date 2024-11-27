package dsa.solutions.adobe;

import java.util.*;

public class ConvexHull {

    public static Point getLowestPoint(ArrayList<Point> points) {
        Point lowestPoint = points.get(0);
        for (Point point : points) {
            if (point.y < lowestPoint.y || (point.y == lowestPoint.y && point.x < lowestPoint.x)) {
                lowestPoint = point;
            }
        }
        return lowestPoint;
    }

    public static Point[] compute(ArrayList<Point> points) {
        Point lowestPoint = getLowestPoint(points);

        Collections.sort(points, new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                double crossProduct = getCrossProduct(lowestPoint, o1, o2);
                if (crossProduct == 0) {
                    return Double.compare(getDistanceSquared(o1, lowestPoint), getDistanceSquared(o2, lowestPoint));
                }
                return crossProduct > 0 ? -1 : 1;
            }
        });

        Stack<Point> stack = new Stack<>();
        stack.add(points.get(0));
        stack.add(points.get(1));

        for (int i = 2; i < points.size(); i++) {
            Point nextPoint = points.get(i);
            Point currentPoint = stack.pop();

            while (!stack.empty() && getCrossProduct(stack.peek(), currentPoint, nextPoint) <= 0) {
                currentPoint = stack.pop();
            }

            stack.push(currentPoint);
            stack.push(nextPoint);
        }

        return stack.toArray(new Point[0]);
    }

    private static double getCrossProduct(Point a, Point b, Point c) {
        return ((b.x - a.x) * (c.y - a.y)) - ((b.y - a.y) * (c.x - a.x));
    }

    private static double getDistanceSquared(Point pointA, Point pointB) {
        return ((pointA.x - pointB.x) * (pointA.x - pointB.x)) + ((pointA.y - pointB.y) * (pointA.y - pointB.y));
    }
}
