package com.AssessmentProblems.CoolTrack;

import java.util.*;

public class DataCenterUtil {

    private Set<DataCenter> dataCenterSet = new LinkedHashSet<>();

    public Set<DataCenter> getDataCenterSet() {
        return dataCenterSet;
    }

    public void setDataCenterSet(Set<DataCenter> dataCenterSet) {
        this.dataCenterSet = dataCenterSet;
    }

    public void addDataCenter(DataCenter dataCenter) {
        dataCenterSet.add(dataCenter);
    }

    public DataCenter getDataCenterById(String dataCenterId) {

        for (DataCenter dc : dataCenterSet) {
            if (dc.getDataCenterId().equals(dataCenterId)) {
                return dc;
            }
        }
        return null;
    }

    public List<DataCenter> getDataCentersWithMaximumCoolingPowerUsage() {

        List<DataCenter> result = new ArrayList<>();

        if (dataCenterSet.isEmpty())
            return result;

        double max = Double.MIN_VALUE;

        for (DataCenter dc : dataCenterSet) {
            if (dc.getCoolingPowerUsage() > max) {
                max = dc.getCoolingPowerUsage();
            }
        }

        for (DataCenter dc : dataCenterSet) {
            if (dc.getCoolingPowerUsage() == max) {
                result.add(dc);
            }
        }

        return result;
    }
}
