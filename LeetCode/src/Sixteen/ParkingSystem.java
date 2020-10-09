package Sixteen;

public class ParkingSystem {
    int big ;
    int medium;
    int small;
    public ParkingSystem(int big, int medium, int small) {
        this.big=big;
        this.medium=medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        if (carType==1)
        {
        big--;
        if (big<0)
        {   big=0;
            return false;
        }else
        {
            return true;
        }
        }else if (carType==2)
        {   medium--;
            if (medium<0)
            {
                return false;
            }else
            {

                return true;
            }
        }else
        {
            small--;
            if (small<0)
            {
                return false;
            }else
            {
                return true;
            }
        }
    }
}
