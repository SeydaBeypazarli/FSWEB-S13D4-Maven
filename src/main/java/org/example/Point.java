package org.example;

public class Point {

        // x ve y değişkenleri
        private int x;
        private int y;

        // Constructor
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        // Getter ve Setter metodları
        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        // distance() metodu (0,0) noktasına göre uzaklık
        public double distance() {
            return Math.sqrt(x * x + y * y);
        }

        // distance(Point p) metodu
        public double distance(Point p) {
            if(p == null) {
                System.out.println("point objesi null geldi");
                return 0;
            }
            return Math.sqrt(Math.pow(x-p.x, 2) + Math.pow(y-p.y, 2));
        }

        // distance(int a, int b) metodu
        public double distance(int a, int b) {
            return Math.sqrt(Math.pow(a - this.x, 2) + Math.pow(b - this.y, 2));
        }

        // Test metodu

}

