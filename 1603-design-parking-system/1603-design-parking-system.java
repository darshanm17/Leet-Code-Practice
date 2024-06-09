class ParkingSystem {
    int bigsize,mediumsize,smallsize;
    public ParkingSystem(int big, int medium, int small) {
        bigsize=big;
        mediumsize=medium;
        smallsize=small;
    }
    
    public boolean addCar(int carType) {
        if(carType==1 && bigsize>=1){
                bigsize-=1;
                return true;
        }
        
        else if(carType==2 && mediumsize>=1){
            mediumsize-=1;
        return true;
        }
        else if(carType==3 && smallsize>=1){
            smallsize-=1;
        return true;
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */