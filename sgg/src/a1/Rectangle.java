package a1;

public class Rectangle {
    int length;
    int width;

    int area() {
        return this.length * this.width;
    }

    int perimeter() {
        return 2 * (this.length + this.width);
    }

    void print(char sign) {
        for (int i = 1; i <= this.width; i++) {
            for (int j = 1; j <= this.length; j++) {
                System.out.println(sign);
            }
            System.out.println();
        }
    }

    String getInfo() {
        return "chang: " + this.length + ", kuan: " + this.width + ",mianji: " + this.area() + ", zhouchang: " + this.perimeter();
    }
}
