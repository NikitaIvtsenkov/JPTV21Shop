/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Arrays;

/**
 *
 * @author Nikita
 */
public class Worker {
    
    private String jobtitle;
    private InfoWorker[] infosworkers;

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public InfoWorker[] getInfosworkers() {
        return infosworkers;
    }

    public void setInfosworkers(InfoWorker[] infosworkers) {
        this.infosworkers = infosworkers;
    }

    public void addInfoworker(InfoWorker infoworker){
        InfoWorker[] newInfos = Arrays.copyOf(infosworkers, infosworkers.length+1);
        newInfos[newInfos.length-1]=infoworker;
        this.infosworkers = newInfos;
    }

    @Override
    public String toString() {
        return "Worker{"
                + "jobtitle=" + jobtitle 
                + ", infosworkers=" + infosworkers 
                + '}';
    }
    
    
}
