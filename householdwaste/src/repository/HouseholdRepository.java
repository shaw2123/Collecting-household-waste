package repository;

import dataAccess.HouseholdDao;
import model.Truck;

public class HouseholdRepository implements IHouseholdRepository {
    private HouseholdDao hhd = new HouseholdDao();
    @Override
    public void calculateTime(Truck truck){
        hhd.Instance().calculateTime(truck);
    }
    
    @Override
    public void calculateCost(Truck truck){
        hhd.Instance().calculateCost(truck);
    }
    
    @Override
    public void printEstimateCost(Truck truck){
        hhd.Instance().printEstimateCost(truck);
    }
}