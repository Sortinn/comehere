package problems.leetcode.main;

import java.awt.geom.Point2D;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main6 {

    private int x;
    private int y;

    public static boolean isInMap(double x, double y, List<Point2D> map) {
        Point2D seller = new Point2D.Double(x, y);
        int size = map.size();
        boolean isInLineOrVertex = true;
        int intersectCount = 0;
        double precision = 2e-10;
        Point2D p1, p2;
        Point2D p = seller;

        p1 = map.get(0);
        for (int i = 1; i <= size; i++) {
            if (p1.equals(p)) {
                return isInLineOrVertex;
            }

            p2 = map.get(i % size);
            if (p.getX() < Math.min(p1.getX(), p2.getX()) || p.getX() > Math.max(p1.getX(), p2.getX())) {
                p1 = p2;
                continue;
            }

            if (p.getX() > Math.min(p1.getX(), p2.getX()) && p.getX() < Math.max(p1.getX(), p2.getX())) {
                if (p.getY() <= Math.max(p1.getY(), p2.getY())) {
                    if (p1.getX() == p2.getX() && p.getY() >= Math.min(p1.getY(), p2.getY())) {
                        return isInLineOrVertex;
                    }
                    if (p1.getY() == p2.getY()) {
                        if (p1.getY() == p.getY()) {
                            return isInLineOrVertex;
                        } else {
                            ++intersectCount;
                        }
                    } else {
                        double xinters = (p.getX() - p1.getX()) * (p2.getY() - p1.getY()) / (p2.getX() - p1.getX()) + p1.getY();
                        if (Math.abs(p.getY() - xinters) < precision) {
                            return isInLineOrVertex;
                        }

                        if (p.getY() < xinters) {
                            ++intersectCount;
                        }

                    }

                }

            } else {
                if (p.getX() == p2.getX() && p.getY() <= p2.getY()) {
                    Point2D p3 = map.get((i + 1) % size);
                    if (p.getX() >= Math.min(p1.getX(), p3.getX()) && p.getX() <= Math.max(p1.getX(), p3.getX())) {
                        ++intersectCount;
                    } else {
                        intersectCount += 2;
                    }
                }
            }
            p1 = p2;
        }


        //偶数在多边形外
        if (intersectCount % 2 == 0) {
            return false;
        } else {
            //奇数在多边形内
            return true;
        }
    }


    public static void main(String[] args) throws IOException {
        List<Point2D> map = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String firstLine = in.nextLine();
        String[] xAndy = firstLine.split(",");
        double x = Double.parseDouble(xAndy[0]);
        double y = Double.parseDouble(xAndy[1]);
        String secondLine = in.nextLine();
        String[] mapXandY = secondLine.split(",");
        for (int i = 0; i < mapXandY.length; ) {
            map.add(new Point2D.Double(Double.parseDouble(mapXandY[i++]), Double.parseDouble(mapXandY[i++])));
        }
        if (isInMap(x, y, map)) {
            System.out.print("yes");
        }
    }
}
