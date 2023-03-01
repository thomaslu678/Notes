package com.hillcrest.chapter11.data;

public class DataSet {

    private double[] data;
    public int count;

    public DataSet(int items){
        data = new double[items];
    }

    public void addItem(double value) throws BadDataException {
        if(count < data.length){
            data[count] = value;
            count++;
        }
        else{
            throw new BadDataException("Too many values. Expecting " + data.length);
        }
    }

    public double average() throws BadDataException{
        if(count != data.length){
            throw new BadDataException("Too few values. Expecting " + data.length);
        }
        double sum = 0;
        if(count > 0){
            for(var value : data){
                sum += value;
            }
            return sum/count;
        }
        else{
            return 0;
        }
    }



}
