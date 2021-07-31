package chapter2DataTypesAndOperators.optionA;

public class DeveloperAndDate {
    private String developer = "Mike Khai";
    private int hourGet;
    private int minuteGet;
    private int dayGet;
    private int monthGet;
    private int yearGet;
    private int hourFinish;
    private int minuteFinish;
    private int dayFinish;
    private int monthFinish;
    private int yearFinish;

//    DeveloperAndDate d = new DeveloperAndDate();
//        d.setHourGet();
//        d.setMinuteGet();
//        d.setDayGet();
//        d.setMonthGet();
//        d.setYearGet();
//        d.setHourFinish();
//        d.setMinuteFinish();
//        d.setDayFinish();
//        d.setMonthFinish();
//        d.setYearFinish();

    public void setHourGet(int hourGet) {
        if(hourGet < 24 && hourGet > -1) {
            this.hourGet = hourGet;
        }
        else {
            System.out.println("Incorrect hour get. Needs(00-23)");
        }
    }

    public void setMinuteGet(int minuteGet) {
        if(minuteGet < 60 && minuteGet > -1) {
            this.minuteGet = minuteGet;
        }
        else {
            System.out.println("Incorrect minute get. Needs(00-59)");
        }
    }

    public void setDayGet(int dayGet) {
        if(dayGet < 32 && dayGet > 0) {
            this.dayGet = dayGet;
        }
        else {
            System.out.println("Incorrect day get. Needs(1-31)");
        }
    }

    public void setMonthGet(int monthGet) {
        if(monthGet < 13 && monthGet > 0) {
            this.monthGet = monthGet;
        }
        else {
            System.out.println("Incorrect month get. Needs(1-12)");
        }
    }

    public void setYearGet(int yearGet) {
        if(yearGet < 2050 && yearGet > 1980) {
            this.yearGet = yearGet;
        }
        else {
            System.out.println("Incorrect year get. Needs(1-12)");
        }
    }

    public void setHourFinish(int hourFinish) {
        if(hourFinish < 24 && hourFinish > -1) {
            this.hourFinish = hourFinish;
        }
        else {
            System.out.println("Incorrect hour finish. Needs(00-23)");
        }
    }

    public void setMinuteFinish(int minuteFinish) {
        if(minuteFinish < 60 && minuteFinish > -1) {
            this.minuteFinish = minuteFinish;
        }
        else {
            System.out.println("Incorrect minute finish. Needs(00-59)");
        };
    }

    public void setDayFinish(int dayFinish) {
        if(dayFinish < 32 && dayFinish > 0) {
            this.dayFinish = dayFinish;
        }
        else {
            System.out.println("Incorrect day finish. Needs(1-31)");
        };
    }

    public void setMonthFinish(int monthFinish) {
        if(monthFinish < 13 && monthFinish > 0) {
            this.monthFinish = monthFinish;
        }
        else {
            System.out.println("Incorrect month finish. Needs(1-12)");
        }
    }

    public void setYearFinish(int yearFinish) {
        if(yearFinish < 2050 && yearFinish > 1980) {
            this.yearFinish = yearFinish;
        }
        else {
            System.out.println("Incorrect year finish. Needs(1-12)");
        }
    }

    @Override
    public String toString() {
        return  "\n" +
                "\n" +
                "DeveloperAndDate{" +
                "developer='" + developer + '\'' +
                ", time get task: " + hourGet +
                ":" + minuteGet +
                ", date: " + dayGet +
                ":" + monthGet +
                ":" + yearGet +
                ", time finish task: " + hourFinish +
                ":" + minuteFinish +
                ", date: " + dayFinish +
                ":" + monthFinish +
                ":" + yearFinish +
                '}';
    }
}
