// Date:01-02-2026
class Solution {
    public int countMonobit(int n) {
        if(n<0){
            return -1;
        }
        if(n==0){
            return 1;
        }
        int count =2;
        int current = 2;
        while(n>current-1){
            current*=2;
            if(n>=current-1) count++;
        }
        return count;
    }
}

// problem no 3

class RideSharingSystem {
    List<Integer> rider = new ArrayList<>();
    List<Integer> driver = new ArrayList<>();

    public RideSharingSystem() {
        
    }
    
    public void addRider(int riderId) {
        rider.add(riderId);
    }
    
    public void addDriver(int driverId) {
        driver.add(driverId);
    }
    
    public int[] matchDriverWithRider() {
        if(driver.size()<=0 || rider.size()<=0){
            return new int[]{-1,-1};
        }
        int driverId = driver.remove(0);
        int riderId = rider.remove(0);
        return new int[]{driverId,riderId};
    }
    
    public void cancelRider(int riderId) {
        rider.remove(Integer.valueOf(riderId));
    }
}
