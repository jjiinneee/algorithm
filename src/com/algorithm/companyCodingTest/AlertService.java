package com.algorithm.companyCodingTest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class AlertService {
  private final AlertDAO storage;
  
  public AlertService(AlertDAO storage) {
    this.storage = storage;
  }
  
  
  public UUID raiseAlert(){
    return this.storage.addAlert(new Date());
  }
  
  public Date getAlertTime(UUID id){
    return this.storage.getAlert(id);
  }
  //https://github.com/HimashiNethinikaRodrigo/TestDomeJavaPractice/tree/master/src/main/edu/testdome/java
  
}

interface AlertDAO{
  UUID addAlert(Date time);
  Date getAlert(UUID id);
}

class MapAlertDAO implements AlertDAO {
  private final Map<UUID, Date> alerts = new HashMap<UUID, Date>();
  
  @Override
  public UUID addAlert(Date time){
    UUID id = UUID.randomUUID();
    this.alerts.put(id, time);
    return id;
  }
  
  @Override
  public Date getAlert(UUID id){
    return this.alerts.get(id);
  }
  
  public static void main(String[] args) {
  
  
  
  }
}
