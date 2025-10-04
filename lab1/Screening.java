package lab1;

public class Screening {
    private String screeningName;
    private int profit;
    private Date screeningDate;

    public Screening(){
        this.screeningName = "";
        this.profit = 0;
        this.screeningDate = new Date();
    }

    public Screening(String screeningName, int profit, Date screeningDate){
        this.screeningName = screeningName;
        this.profit = profit;
        this.screeningDate = screeningDate;

    }
    public void printInfo(){
        System.out.println("Screening: ScreeningName: %s, Screening profit: %s".formatted(screeningName, profit));
        System.out.println("Date of screening:");
        screeningDate.printInfo();
    }

    public String getScreeningName(){
        return screeningName;
    }
    public void setScreeningName(String screeningName) {
        this.screeningName = screeningName;
    }

    public int getProfit() {
        return profit;
    }
    public void setProfit(int profit) {
        this.profit = profit;
    }

    public Date getScreeningDate(){
        return screeningDate;
    }

    public void setScreeningDate(Date screeningDate){
        this.screeningDate = screeningDate;
    }
















}
