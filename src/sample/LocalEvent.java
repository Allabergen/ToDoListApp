package sample;

import java.time.LocalDate;

public class LocalEvent {
    private LocalDate date;
    private String description;

    public LocalEvent(LocalDate date, String description) {
        this.date = date;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return  "At: " + date +
                "\t" + description;
    }
}
