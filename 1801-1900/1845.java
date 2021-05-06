/**
 * 1845. Seat Reservation Manager
 * https://leetcode.com/problems/seat-reservation-manager/
 */

class SeatManager {

  PriorityQueue<Integer> seats;

  public SeatManager(int n) {
    this.seats = new PriorityQueue<Integer>();
    // This adds all the available seats into the queue in order of priority
    for (int i = 1; i <= n; i++) {
      this.seats.add(i);
    }
  }

  public int reserve() {
    // This removes the first element from the queue, making it unavailable
    return this.seats.poll();
  }

  public void unreserve(int seatNumber) {
    // This adds the seatNumber back into the queue
    this.seats.offer(seatNumber);
  }
}
/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */
