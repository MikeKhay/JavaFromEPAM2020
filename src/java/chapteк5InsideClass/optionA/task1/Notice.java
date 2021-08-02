package chapteк5InsideClass.optionA.task1;

public class Notice {

        private int idNotice;
        private String text;
        private DateNotice dateNotice;

        public Notice(int idNotice, String text, DateNotice dateNotice) {
            this.idNotice = idNotice;
            this.text = text;
            this.dateNotice = dateNotice;
        }

        static class DateNotice{
            private int day;
            private int month;

            public DateNotice(int day, int month) {
                this.day = day;
                this.month = month;
            }

            public int getDay() {
                return day;
            }

            public void setDay(int day) {
                this.day = day;
            }

            public int getMonth() {
                return month;
            }

            public void setMonth(int month) {
                this.month = month;
            }

            @Override
            public String toString() {
                return "DateNotice{" +
                        ", day=" + day +
                        ", month=" + month +
                        '}';
            }
        }

    public int getIdNotice() {
        return idNotice;
    }

    public void setIdNotice(int idNotice) {
        this.idNotice = idNotice;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public DateNotice getDateNotice() {
        return dateNotice;
    }

    public void setDateNotice(DateNotice dateNotice) {
        this.dateNotice = dateNotice;
    }

    @Override
    public String toString() {
        return "Notice{" +
                "idNotice=" + idNotice +
                ", text='" + text + '\'' +
                ", dateNotice=" + dateNotice +
                '}';
    }
}
