package com.company.connection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Invertory {
    private ArrayList<Connection>connections=new ArrayList<Connection>();

    public Invertory() {
        this.connections = connections;
    }

    public ArrayList<Connection> getConnections() {
        return connections;
    }

    public void setConnections(ArrayList<Connection> connections) {
        this.connections = connections;
    }

    public boolean addConnection(Connection con){
        boolean code=true;
        for (Connection c : connections){
            if (c.getConnectionId()==con.getConnectionId()){
                code=false;
                break;
            }

        }
        if (code){
            connections.add(con);
        }
        return code;
    }

    public double recharge(int id,double amount){
        double code=-1;
        for (Connection c: connections) {
            if (c.getConnectionId()==id){
                code = c.getBalance();
                code += amount;
                c.setBalance(code);
                break;
            }
        }
        return code;
    }

    public double deduct (int id,double amount)throws ConnectionLockExtention{
        double code=-1;
        for (Connection c: connections) {
            if (c.getConnectionId() == id) {
                code = c.getBalance();
                if (code >= 0) {
                    code -= amount;
                    c.setBalance(code);
                    break;
                } else {
                    throw new ConnectionLockExtention(code);
                }
            }
        }
        return code;
    }

    public Set<Integer> getUniqueCustomerIds(){
        Set<Integer> ids=new HashSet<Integer>();
        for (Connection c:connections){
            ids.add(c.getCustomerId());
        }
        return ids;
    }
    public HashMap<Integer,Connection> getCustomerHashMap(){
        HashMap<Integer,Connection> myMap=new HashMap<Integer,Connection>();
        for (Connection c:connections){
            myMap.put(c.getConnectionId(),c);
        }
        return myMap;
    }
}

