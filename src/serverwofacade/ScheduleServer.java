/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serverwofacade;

/**
 *
 * @author sarun
 */
public class ScheduleServer {
    
    public void start(String str){
        System.out.println(str); //starting
        System.out.println("Starts booting...");
        System.out.println("Reading system config files...");
        System.out.println("Initializing...");
        System.out.println("Initializing context...");
        System.out.println("Initializing listeners...");
        System.out.println("Creating system objects...");
        System.out.println("Releasing processes...");
        System.out.println("Destorying...");
        System.out.println("Destroying system objects...");
        System.out.println("Destroying listeners...");
        System.out.println("Destroying context...");
        System.out.println("Shutting down...");
        
    }
    
    public void stop(String stop){
        
        System.out.println("Releasing processes...");
        System.out.println("Destorying...");
        System.out.println("Destroying system objects...");
        System.out.println("Destroying listeners...");
        System.out.println("Destroying context...");
        System.out.println("Shutting down...");
        
    }
    
    /*
    public void startBooting(){
	System.out.println("Starts booting...");
    }
    public void readSystemConfigFile(){
        System.out.println("Reading system config files...");
    }
    public void init(){
	System.out.println("Initializing...");
    }
    public void initializeContext(){
	System.out.println("Initializing context...");
    }
    public void initializeListeners(){
	System.out.println("Initializing listeners...");
    }
    public void createSystemObjects(){
        System.out.println("Creating system objects...");
    }
    public void releaseProcesses(){
        System.out.println("Releasing processes...");
    }
    public void destory(){
        System.out.println("Destorying...");
    }
    public void destroySystemObjects(){
	System.out.println("Destroying system objects...");
    }
    public void destoryListeners(){
        System.out.println("Destroying listeners...");
    }
    public void destoryContext(){
        System.out.println("Destroying context...");
    }
    public void shutdown(){
        System.out.println("Shutting down...");
    }*/
}
