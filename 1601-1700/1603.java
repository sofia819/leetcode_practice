/**
 * 1603. Design Parking System
 * https://leetcode.com/problems/design-parking-system/
 */

class ParkingSystem {

  static int big, medium, small;
  final int SMALL = 3, MEDIUM = 2, BIG = 1;

  public ParkingSystem(int big, int medium, int small) {
    this.big = big;
    this.medium = medium;
    this.small = small;
  }

  public boolean addCar(int carType) {
    boolean result = false;
    switch (carType) {
      case SMALL:
        if (this.small > 0) {
          this.small -= 1;
          result = true;
        }
        break;
      case MEDIUM:
        if (this.medium > 0) {
          this.medium -= 1;
          result = true;
        }
        break;
      case BIG:
        if (this.big > 0) {
          this.big -= 1;
          result = true;
        }
        break;
    }

    return result;
  }
}
/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
