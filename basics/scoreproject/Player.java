package scoreproject;

public class Player {
    private static int IDCreat = 1001;
    private int ID;
    private String name;
    private String role; 
    private int run;
    private int fourCount;
    private int sixCount;

    public Player(String name, String role){
        ID = IDCreat++;
        this.name = name;
        this.role = role;
        run = 0;
        fourCount = 0;
        sixCount = 0;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public void setRun(int totalRun) {
        this.run += totalRun;
        if(totalRun == 4)fourCount++;
        else if(totalRun == 6)sixCount++;
    }

    public void setFourCount(int fourCount) {
        this.fourCount = fourCount;
    }
    public void setSixCount(int sixCount) {
        this.sixCount = sixCount;
    }

    public int getID() {
        return ID;
    }
    public String getName() {
        return name;
    }
    public String getRole() {
        return role;
    }
    public int getRun() {
        return run;
    }
    public int getFourCount() {
        return fourCount;
    }
    public int getSixCount() {
        return sixCount;
    }
    public String  playerInfo(){
        return " |  "+ ID +"  | "+ name +" |  "+role+"  |   "+run+"  |    "+fourCount+"   |    "+sixCount;
    }
}
